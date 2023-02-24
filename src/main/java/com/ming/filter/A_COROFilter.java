package com.ming.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class A_COROFilter implements Filter {
	private static final String ORIGIN = "Origin";

	private static final String REFERER = "Referer";

	private static final String TRUE = "true";

	private static final String CACHE_86400 = "86400";

	private static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";

	private static final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";

	private static final String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";

	private static final String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";

	private static final String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";

	private static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";

	private static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
//		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		//拦截器允许跨域同源
		System.out.println(this.getClass()+"允许跨域同源");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		// 响应类型
		response.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
		// 预检请求的结果缓存60分钟
		response.setHeader("Access-Control-Max-Age", "3600");

		//httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
		// 允许所有
		response.setHeader("Access-Control-Allow-Origin", "*");
		// 指定允许其他域名访问
		// response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1,http://locahost"); // 允许白名单IP
		// 响应头设置
		response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
		filterChain.doFilter(request,response);
	}

	@Override
	public void destroy() {
//		Filter.super.destroy();
	}
}
