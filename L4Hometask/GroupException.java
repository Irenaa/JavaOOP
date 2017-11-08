package com.gmail.bezkrovna1998;

public class GroupException extends Exception{

	@Override
	public String getMessage() {
		
		return "The group is full";
	}
	

}
