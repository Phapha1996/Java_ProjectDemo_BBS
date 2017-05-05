package org.fage.service;

import java.sql.SQLException;
import java.util.List;

import org.fage.dao.CategoryDao;
import org.fage.domain.Category;

public class CategoryService {
	private CategoryDao dao = new CategoryDao();
	public void addCategory(Category c) throws SQLException{
		dao.add(c);
	}
	
	public Category findCategoryForId(String id) throws SQLException{
		return dao.find(id);
	}
	
	public void deleteCategory(String id) throws SQLException{
		dao.delete(id);
	}
	
	public void updateCategory(Category c) throws SQLException{
		Category category = findCategoryForId(c.getId());
		if(category!=null){
			dao.update(c);
		}
	}
	
	
	public List<Category> getAllCateGory() throws SQLException{
		return dao.getAll();
	}
}
