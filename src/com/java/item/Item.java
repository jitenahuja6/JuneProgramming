package com.java.item;

public class Item {
	
	private String name;
	private String manufacturerlocation;
	
	Item(String name, String manufacturerlocation)
	{
		this.name = name;
		this.manufacturerlocation = manufacturerlocation;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", manufacturerlocation=" + manufacturerlocation + "]";
	}
	
	

}
