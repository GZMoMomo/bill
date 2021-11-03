package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import entity.Category;
import service.CategoryService;

public class CategoryTableModel implements TableModel {
    String[] columnNames=new String[] {"分类名称","消费次数","消费金额"};
    public List<Category> cs=new CategoryService().list();
    
    
	
	
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return columnNames[arg0];
	}

	
	public int getRowCount() {
		// TODO Auto-generated method stub
		return cs.size();
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Category h=cs.get(rowIndex);
		if(0==columnIndex)
			return h.name;
		if(1==columnIndex)
			return h.recordNumber;
		if(2==columnIndex)
			return h.spend;
		return null;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
