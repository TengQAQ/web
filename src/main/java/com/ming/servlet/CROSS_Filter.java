package com.ming.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebFilter("/*")
public class CROSS_Filter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
		// 响应类型
		httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
		// 预检请求的结果缓存60分钟
		httpServletResponse.setHeader("Access-Control-Max-Age", "3600");

		//httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
		// 允许所有
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		// 指定允许其他域名访问
		// response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1,http://locahost"); // 允许白名单IP
		// 响应头设置
		httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
		filterChain.doFilter(httpServletRequest,httpServletResponse);
	}

}
