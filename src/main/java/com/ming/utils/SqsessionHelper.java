package com.ming.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class SqsessionHelper {
	static String PATH="jdbc.properties";
	static SqlSessionFactory factory = null;
	static {
		if (factory.equals(null)){
			try {
				Reader reader = Resources.getResourceAsReader(PATH);
				factory = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	public static SqlSession opensqlsession(){
		return factory.openSession();
	}
}
