package com.rent.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rent.inter.IUserOperation;
import com.rent.model.Article;
import com.rent.model.User;
/**
 * mybatis与spring3集成
 * @author chivas
 *
 */
public class MybatisSpringTest {

	private static ApplicationContext ctx;
	
	static{
		ctx = new ClassPathXmlApplicationContext("spring.xml");
	}
	
	public static void main(String[] args) {
		IUserOperation userOperation = (IUserOperation) ctx.getBean("userMapper");
		//测试id=3的用户查询
		System.out.println("得到用户id=3的用户信息");
		User user = userOperation.selectUserByID(3);
		System.out.println(user.toString());
		
		//得到文章列表测试
		System.out.println("得到用户id为3的所有文章列表");
		List<Article> articles = userOperation.getUserArticles(3);
		for(Article article : articles){
			System.out.println(article.toString());
		}
	}
}
