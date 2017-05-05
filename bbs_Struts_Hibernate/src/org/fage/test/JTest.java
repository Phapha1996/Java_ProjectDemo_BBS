package org.fage.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import org.fage.dao.CategoryDao;
import org.fage.domain.Category;
import org.junit.Test;

public class JTest {
	@Test
	public void test(){
		Category c = new Category();
		c.setName("fage");
		c.setDiscription("hahah");
		CategoryDao dao = new CategoryDao();
		try {
			dao.add(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("test.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("name"));
		
	
	}
	
	
}
