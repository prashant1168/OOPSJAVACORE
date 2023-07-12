package com.app.core;

public enum RoomType 
{
	GENERAL(2000), SPECIAL(5000), SEMI_SPECIAL(3000), ICU(7000);
	
	private int getCost;

	private RoomType(int getCost) 
	{
		this.getCost = getCost;
	}	
	
}
