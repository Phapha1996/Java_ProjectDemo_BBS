package org.fage.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.fage.domain.Category;
import org.fage.service.CategoryService;

import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport implements RequestAware{
	private Category category;
	private Map<String,Object> request;
	private CategoryService cs = new CategoryService();
	//private List<Category> list;
	
	public String add(){
		try {
			cs.addCategory(category);
			this.addFieldError("message", "��ӳɹ�������");
		} catch (SQLException e) {
			this.addFieldError("message", "���ʧ�ܣ�������Ĳ����ϱ�׼������");
			e.printStackTrace();
		}
		return "input";
	}
	
	
	public String list(){
		try {
			List<Category> list = cs.getAllCateGory();
//			list = cs.getAllCateGory();
			request.put("categorys", list);
		} catch (SQLException e) {
			e.printStackTrace();
			this.addFieldError("message", "�Բ��𣬷���������δ֪����");
		}
		return "get";
	}
	
	
	public String update(){
		try {
			cs.updateCategory(category);
			this.addFieldError("message", "���³ɹ�����");
		} catch (SQLException e) {
			e.printStackTrace();
			this.addFieldError("message", "����ʧ�ܣ���");
		}
		
		return "input";
	}
	
	public String delete(){
		
		try {
			cs.deleteCategory(category.getId());
			this.addFieldError("message", "ɾ���ɹ�������");
		} catch (SQLException e) {
			e.printStackTrace();
			this.addFieldError("message", "ɾ��ʧ�ܣ���");
		}
		
		return "input";
	}
	

	public String addui(){
		return "forward";
	}
	
	public String updateui(){
		return "forward";
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	
}
