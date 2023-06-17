package com.java.item;

import java.util.ArrayList;
import java.util.List;

public class ItemImpl {
	
	List<Item> itemobj = new ArrayList<>();
	ItemImpl()
	{
		itemobj.add(new Item("Laptop", "Punjab"));
		itemobj.add(new Item("Mobile", "China"));
	}
	
	public void additem()
	{
		itemobj.add(new Item("Headphone", "Mumbai"));
	}
	
	public List<Item> getItemobj()
	{
		return itemobj;
	}
	
	public static void main(String[] args) {
		
		ItemImpl obj = new ItemImpl();
		ItemImpl obj2 = new ItemImpl();
		List<Item> objects1 = obj.getItemobj();
		List<Item> objects2 = obj2.getItemobj();
		
		obj2.additem();
		
		System.out.println(objects1);
		System.out.println(objects2);
		
		
		
		
	}
	
	
	

}
