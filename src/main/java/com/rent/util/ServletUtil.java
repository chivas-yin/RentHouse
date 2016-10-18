package com.rent.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求响应工具类
 * @author chivas
 *
 */
public class ServletUtil {

	/**
	 * 封装page类
	 */
	public static PageInfo getPage(HttpServletRequest request){
		PageInfo page = new PageInfo();
		int currentPage = request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
        int pageSize = 2;
        if (currentPage<=0){
            currentPage =1;
        }
        int currentResult = (currentPage-1) * pageSize;
        page.setShowCount(pageSize);
        page.setCurrentResult(currentResult);
        page.setCurrentPage(currentPage);
        page.setRequestUrl(request.getRequestURI());
        
        return page;
	}
	
}
