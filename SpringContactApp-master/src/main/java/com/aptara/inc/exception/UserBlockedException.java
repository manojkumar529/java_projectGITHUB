package com.aptara.inc.exception;

public class UserBlockedException  extends Exception{
	
	public UserBlockedException()
	{
		
	}
	public UserBlockedException(String errDesc)
	{
		super(errDesc);
	}
}
