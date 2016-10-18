package com.rent.util;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 创建自定义标签类
 * @author chivas
 *
 */
public class PageInfoTag extends TagSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PageInfo page;
	
	@Override
	public int doStartTag() throws JspException{
		try{
			JspWriter out = this.pageContext.getOut();
			if(page == null){
				out.print("No PageInfo Found...");
				return SKIP_BODY;
			}
			/* 当前页码 **/
			int currentPage = page.getCurrentPage();
			/* 数据总数 **/
			int totalCount = page.getTotalResult();
			/* 每页显示条数 **/
			int pageSize = page.getShowCount();
			
			int lastPage=0;
	        if (totalCount % pageSize!=0){
	            lastPage = totalCount % pageSize;
	        }
	        else{
	            lastPage =1+ totalCount / pageSize;
	        }
	        
	        if (currentPage>=lastPage){
	            currentPage =lastPage;
	        }
	        
	        String pageStr = "";

	        if(currentPage == (lastPage-1)){
	        	pageStr=String.format("<a href=\"%s\">上一页</a>    <a></a>",
	                    page.getRequestUrl()+"?page="+(currentPage-1));
	        }else if(currentPage == 1){
	        	pageStr=String.format("<a></a>    <a href=\"%s\">下一页</a>",
	        			page.getRequestUrl()+"?page="+(currentPage+1) );
	        }else{
	        pageStr=String.format("<a href=\"%s\">上一页</a>    <a href=\"%s\">下一页</a>",
	        		page.getRequestUrl()+"?page="+(currentPage-1),page.getRequestUrl()+"?page="+(currentPage+1) );
	        }
			
			out.println(pageStr);
		}catch(Exception e){
			throw new JspException(e.getMessage());
		}
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException{
		return EVAL_PAGE;
	}
	
	@Override
	public void release(){
		super.release();
		this.page = null;
	}

	//getter and setter
	public PageInfo getPage() {
		return page;
	}

	public void setPage(PageInfo page) {
		this.page = page;
	}
	
	
	
	
	
	
	
	
	
	

}
