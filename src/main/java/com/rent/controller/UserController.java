package com.rent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rent.inter.IUserOperation;
import com.rent.model.Article;
import com.rent.util.PageInfo;
import com.rent.util.ServletUtil;

@Controller
@RequestMapping("/article")
public class UserController {

	@Autowired
	IUserOperation userMapper;
	
	@RequestMapping("/list")
	public ModelAndView listall(HttpServletRequest request,
								HttpServletResponse response){
		List<Article> articles = userMapper.getUserArticles(3);
		ModelAndView mv = new ModelAndView("hellospring");
		mv.addObject("articles",articles);
		return mv;
	}
	
	@RequestMapping("/pagelist")
    public ModelAndView pageList(HttpServletRequest request,HttpServletResponse response){
        PageInfo page = ServletUtil.getPage(request);
        List<Article> articles=userMapper.selectArticleListPage(page,3);

        //制定视图，也就是list.jsp
        ModelAndView mav=new ModelAndView("hellospring");
        mav.addObject("articles",articles);
        mav.addObject("page",page);
        return mav;
    }
	
}
