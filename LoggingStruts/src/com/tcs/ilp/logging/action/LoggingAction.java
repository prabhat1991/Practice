package com.tcs.ilp.logging.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tcs.ilp.logging.dao.LoginDAO;

public class LoggingAction extends ActionSupport
{
	private String usn;
	private String pwd;
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String logging() 
	{
		if(LoginDAO.validate(usn,pwd)==true)
			return "success";
		else
			return "invalid";
	}
}
