package com.rent.inter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rent.model.Article;
import com.rent.model.User;
import com.rent.util.PageInfo;

public interface IUserOperation {
	
	/* 方法名必须与User.xml里面配置的select的id对应 **/
	public User selectUserByID(int id);
	
	/* 列表查询 **/
	public List<User> selectUsers(String userName);
	
	/* 增加数据 **/
	public void addUser(User user);
	
	/* 更新数据 **/
	public void updateUser(User user);
	
	/* 删除数据 **/
	public void deleteUser(int id);
	
	/* 多对一查询 **/
	public List<Article> getUserArticles(int userid);
	
	/* 分页查询 **/
	public List<Article> selectArticleListPage(@Param("page") 
												PageInfo page,
												@Param("userid") 
												int userid);
}
