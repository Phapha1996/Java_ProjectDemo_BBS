package org.fage.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.UUID;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	/*private static String username;
	private static String password;
	private static String url;
	private static String driver;*/
	
	private static ComboPooledDataSource pool;
	
	static{
		try{
		pool = new ComboPooledDataSource("mysql_Ca");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static DataSource getDataSource(){
		return pool;
	}
	
	
	public static String getID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
}
