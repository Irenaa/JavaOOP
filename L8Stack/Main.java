package com.gmail.bezkrovna1998;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackList bl1=new BlackList();
		bl1.addClass(Integer.class);
		bl1.addClass(Boolean.class);
		Stack st1=new Stack(bl1);
		st1.addObject("5673");
		st1.addObject(8765.98);
		st1.addObject(true);
		System.out.println("Stack:");
		System.out.println(st1);
		
	}

}
