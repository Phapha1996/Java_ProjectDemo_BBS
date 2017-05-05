package org.fage.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.fage.domain.Category;
import org.fage.utils.JdbcUtils;


public class CategoryDao {
	//增加分类
	public void add(Category c) throws SQLException{
		Object[] params = {JdbcUtils.getID(),c.getName(),c.getDiscription()};
		new QueryRunner(JdbcUtils.getDataSource()).update("insert into _category values(?,?,?)", params);
	}
	
	
	public void delete(String id) throws SQLException{
		new QueryRunner(JdbcUtils.getDataSource()).update("delete from _category where id=?", id);
	}
	
	
	public void update(Category c) throws SQLException{
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql="update _category set name=?,discription=? where id=?";
		Object[] params = {c.getName(),c.getDiscription(),c.getId()};
		qr.update(sql, params);
	}

	public List<Category> getAll() throws SQLException{
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from _category";
		return qr.query(sql, new BeanListHandler(Category.class));
	}

	public Category find(String id) throws SQLException{
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from _category where id=?";
		return qr.query(sql, id, new BeanHandler(Category.class));
	}
}


