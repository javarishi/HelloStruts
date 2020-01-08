package com.h2k.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloAction implements Action{
	
	public HelloAction() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;

	@Override
	public String execute() throws Exception {
		System.out.println("Hello Struts!! " + this.getName());
		if(this.getName().equalsIgnoreCase("rishi")) {
			throw new Exception("Developers Name Not Allowed");
		}
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("address", "3375 SPring Hill Pwky");
		context.put("storeId", 121);
		stack.push(context);
		return SUCCESS;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
