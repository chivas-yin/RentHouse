package com.rent.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.rent.inter.IUserOperation;
import com.rent.model.Article;
import com.rent.model.User;

public class Test {

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;
	
	static{
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSession(){
		return sqlSessionFactory;
	}
	
	public static void main(String[] args) {
//	  SqlSession session = sqlSessionFactory.openSession();
	  
	  /* 直接读取User.xml的配置内容查询 **/
//	  try{
//		  User user = (User)session.selectOne("com.rent.models.UserMapper.selectUserByID",1);
//		  
//		  System.out.println(user.getUserAddress());
//		  System.out.println(user.getUserName());
//		  System.out.println(user.toString());
//	  }finally{
//		  session.close();
//	  }
	  
	  
	  /* 通过接口与User.xml关联进行查询 **/
//	  try{
//		  IUserOperation userOperation = session.getMapper(IUserOperation.class);
//		  User user = userOperation.selectUserByID(3);
//		  System.out.println(user.toString());
//		  
//		  List<User> users = userOperation.selectUsers("%");
//		  System.out.println(users.size());
//		  for(User user2:users){
//			  System.out.println(user2.toString());
//		  }
//		  
//	  }finally{
//		  session.close();
//	  }
	  
	  /* 增加用户 **/
//	  addUser();
	  
	  /* 更新用户信息 **/
//	  updateUser();
	  
	  /* 删除数据 **/
//	  deleteUser(1);
	  
	  /* 多对一查询 **/
//	  getUserArticle(3);

	  
	}
	
	
	
	/**
	 * 测试增加数据，增加后必须提交事务，否则不会写入数据库
	 */
	public static void addUser(){
		User user = new User();
		user.setUserAddress("guangzhou haizhu");
		user.setUserName("lubolin");
		user.setUserAge(25);
		
		SqlSession session = sqlSessionFactory.openSession();
		try{
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			userOperation.addUser(user);
			session.commit();
			System.out.println("当前增加的用户id为："+user.getId());
		}finally{
			session.close();
		}
	}
	
	/**
	 * 更新用户信息
	 */
	public static void updateUser(){
		//先得到用户，然后修改再提交
		SqlSession session = sqlSessionFactory.openSession();
		try{
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			User user = userOperation.selectUserByID(3);
			user.setUserName("yezhiyong");
			user.setUserAddress("guangzhou panyu");
			user.setUserAge(30);
			userOperation.updateUser(user);
			session.commit();
			System.out.println("id为:"+user.getId()+"的用户信息已修改");
		}finally{
			session.close();
		}
	}
	
	
	/**
	 * 删除用户信息
	 * @param id
	 */
	public static void deleteUser(int id){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			userOperation.deleteUser(id);
			session.commit();
			System.out.println("id为："+id+"的数据已删除！");
		}finally{
			session.close();
		}
	}
	
	/**
	 * 多对一查询
	 */
	public static void getUserArticle(int userid){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			List<Article> articleList = userOperation.getUserArticles(userid);
			for(Article article : articleList){
				System.out.println(article.toString());
			}
		}finally{
			session.close();
		}
	}
	
	
	
	
	
	
	
	
}
