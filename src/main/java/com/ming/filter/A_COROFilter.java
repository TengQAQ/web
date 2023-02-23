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
		// 解决跨域请求问题
		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse resp = (HttpServletResponse) servletResponse;
		String origin = req.getHeader (ORIGIN);
		if (origin == null) {
			origin = req.getHeader (REFERER);
		}
		// 允许指定域访问跨域资源
		setHeader (resp, ACCESS_CONTROL_ALLOW_ORIGIN, origin);
		// 允许客户端携带跨域cookie，此时origin值不能为“*”，只能为指定单一域名
		setHeader (resp, ACCESS_CONTROL_ALLOW_CREDENTIALS, TRUE);

		filterChain.doFilter (req, resp);

	}

	private void setHeader(HttpServletResponse resp, String key, String value) {
		resp.setHeader (key, value);
	}

	@Override
	public void destroy() {
//		Filter.super.destroy();
	}
}
