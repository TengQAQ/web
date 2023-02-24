package com.ming.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/test")
public class aFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig){
		System.out.println("--------------aFilter--------------");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("do-filter");
		filterChain.doFilter(servletRequest,servletResponse);
		System.out.println("执行结束");
	}

	@Override
	public void destroy() {
		System.out.println("拦截器被销毁");
	}
}
