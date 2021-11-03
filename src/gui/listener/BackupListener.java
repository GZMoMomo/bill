package gui.listener;

import java.awt.event.ActionEvent;
import util.MysqlUtil;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import gui.panel.BackupPanel;
import gui.panel.ConfigPanel;
import gui.panel.MainPanel;
import service.ConfigService;

public class BackupListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		BackupPanel p=BackupPanel.instance;
		String mysqlPath=new ConfigService().get(ConfigService.mysqlPath);
		if(0==mysqlPath.length()) {
			JOptionPane.showMessageDialog(p, "����ǰ����������mysql��·��");
			MainPanel.instance.workingPanel.show(ConfigPanel.instance);
			ConfigPanel.instance.tfMysqlPath.grabFocus();
		    return;
		}
		JFileChooser fc=new JFileChooser();
		fc.setSelectedFile(new File("hutubill.sql"));
		fc.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return ".sql";
			}
			
			@Override
			public boolean accept(File f) {
				return f.getName().toLowerCase().endsWith(".sql");
			}
		});
		
		int returnVal=fc.showSaveDialog(p);
		File file=fc.getSelectedFile();
		System.out.println(file);
		if(returnVal==JFileChooser.APPROVE_OPTION) {
			System.out.println(file);
			if(!file.getName().toLowerCase().endsWith(".sql")) {
				file=new File(file.getParent(),file.getName()+".sql");
			}
			System.out.println(file);
			
			try {
				MysqlUtil.backup(mysqlPath, file.getAbsolutePath());
				JOptionPane.showMessageDialog(p, "���ݳɹ��������ļ�λ�ڣ�\r\n"+file.getAbsolutePath());
				
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(p, "����ʧ��\r\n,����:\r\n"+e.getMessage());
			}
		}

	}

}
