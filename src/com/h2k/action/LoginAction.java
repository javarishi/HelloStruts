package com.h2k.action;

import com.h2k.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<UserDTO>{
	
	private UserDTO user = new UserDTO();
	
	/**
	 * @return the user
	 */
	public UserDTO getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		if(user.getUserId().equals(user.getPassword())){
			System.out.println("Loging Successul " + user.getUserId());
			return SUCCESS;
		}else {
			System.out.println("Loging Unsuccessul " + user.getUserId());
			return ERROR;
		}
	}
	
	
	@Override
	public void validate() {
		if(!(user.getUserId() != null && user.getUserId().trim().length() > 0)) {
			addFieldError("userId" , "User ID Cannot be NULL or Empty");
		}
		if(!(user.getPassword() != null && user.getPassword().trim().length() > 0)) {
			addFieldError("password" , "Password Cannot be NULL or Empty");
		}
	}

	@Override
	public UserDTO getModel() {
		
		return user;
	}
	
	
	
	
}
