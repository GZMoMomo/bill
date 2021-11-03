package gui.model;

import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import entity.Category;
import service.CategoryService;

public class CategoryComboBoxModel implements ComboBoxModel {
    public List<Category> cs=new CategoryService().list();
    
    public Category c;
    
    public CategoryComboBoxModel() {
    	if(!cs.isEmpty()) {
    		c=cs.get(0);
    	}
    }
    
	@Override
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getElementAt(int index) {
		// TODO Auto-generated method stub
		return cs.get(index);
	}

	@Override
	public int getSize() {
		
		return cs.size();
	}

	@Override
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getSelectedItem() {
		if(!cs.isEmpty()) {
			return c;
		}else {
			return null;
		}
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		c=(Category)anItem;
		
	}

}
