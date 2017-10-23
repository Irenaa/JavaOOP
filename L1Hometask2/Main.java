package com.gmail.bezkrovna1998;

public class Main {

	public static void main(String[] args) {
		Triangle tOne=new Triangle(3,4,1);
		if(tOne.isTriangle()) {
			System.out.println("The area is: "+tOne.area());
		}

	}

}
