import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingWorker;

import gui.panel.SpendPanel;
import util.ChartUtil;
import util.CircleProgressBar;
import util.ColorUtil;
import util.GUIUtil;

public class HutuMainFrame {

	public static void main(String[] args) {
      GUIUtil.useLNF();
      
      JPanel p=new JPanel();
      
      CircleProgressBar cpb=new CircleProgressBar();
      cpb.setBackgroundColor(ColorUtil.blueColor);
      cpb.setProgress(0);
      
      JButton b=new JButton("µã»÷");
      
      p.setLayout(new BorderLayout());
      p.add(cpb,BorderLayout.CENTER);
      p.add(b,BorderLayout.SOUTH);
      
      JPanel p1=new JPanel();
      JLabel jl=new JLabel();
     // Image img=ChartUtil.getImage(400, 300);
     // Icon icon=new ImageIcon(img);
    //  jl.setIcon(icon);
      p1.add(jl);
      
      
      GUIUtil.showPanel(p1);
     
      b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new SwingWorker() {

				@Override
				protected Object doInBackground() throws Exception {
					for(int i=0;i<100;i++) {
						cpb.setProgress(i+1);
						cpb.setForegroundColor(ColorUtil.getByPercentage(i+1));
						try {
							Thread.sleep(100);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return null;
				}
				
			}.execute();
			
		}
	});
      
	}
}
