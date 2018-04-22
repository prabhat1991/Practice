package com.tcs.ilp.logging.dao;

public class LoginDAO 
{
	public static boolean validate(String username,String password) 
	{
		if(username.equals("prabhat") && password.equals("kumar"))
			return true;
		else
			return false;
	}
}
