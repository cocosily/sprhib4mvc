package com.zhongrun.common.web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.zhongrun.common.Constant;

/**
 * 登录过滤器
 * @author lenovo
 *
 */
public class ZrSessionFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// 不过滤的uri
		String[] notFilter = new String[] { "/action.do", "/tologin.do" };
		// 请求的uri
        String uri = request.getRequestURI();
        System.out.println("----uri -----"+uri);
        // uri中包含background时才进行过滤
        if (uri.indexOf("do") != -1) {
        	// 是否过滤
            boolean doFilter = true;
            for (String s : notFilter) {
            	if (uri.indexOf(s) != -1) {
            		// 如果uri中包含不过滤的uri，则不进行过滤
            		doFilter = false;
                    break;
            	}
            }
            System.out.println("wwwww");
            if (doFilter) {
            	// 执行过滤
                // 从session中获取登录者实体
                Object obj = request.getSession().getAttribute(Constant.CURRENT_LOGING_USER);
                if (null == obj) {
                	// 如果session中不存在登录者实体，则弹出框提示重新登录
                    // 设置request和response的字符集，防止乱码
                    request.setCharacterEncoding(Constant.CHARACTER_ENCODING_UTF8);
                    response.setCharacterEncoding(Constant.CHARACTER_ENCODING_UTF8);
                    //跳转登录页面
                    //request.getRequestDispatcher("../user/tologin.do").forward(request,response);
                    System.out.println(request.getServerName());
                    response.sendRedirect("/sh/user/tologin");
                    /*PrintWriter out = response.getWriter();
                    String loginPage = "....";  
                    StringBuilder builder = new StringBuilder();  
                    builder.append("<script type=\"text/javascript\">");  
                    builder.append("alert('网页过期，请重新登录！');");  
                    builder.append("window.top.location.href='");  
                    builder.append(loginPage);  
                    builder.append("';");  
                    builder.append("</script>");  
                    out.print(builder.toString());*/
                }else {
                    // 如果session中存在登录者实体，则继续
                    filterChain.doFilter(request, response);
                }
            }else {
            	// 如果不执行过滤，则继续
                filterChain.doFilter(request, response);
            }
        } else{
        	// 如果uri中不包含do，则继续
            filterChain.doFilter(request, response);
        }

	}

}
