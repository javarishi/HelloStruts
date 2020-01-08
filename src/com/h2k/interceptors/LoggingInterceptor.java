package com.h2k.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoggingInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("LoggingInterceptor ::  destroy ");

	}

	@Override
	public void init() {
		System.out.println("LoggingInterceptor ::  init ");

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// Pre Processing - execute before Action Execution
		System.out.println("LoggingInterceptor :: intercept - Start");
		
		String result = invocation.invoke();
		
		// Post processing
		System.out.println("LoggingInterceptor :: Result generated is :: " + result);
		return result;
	}

}
