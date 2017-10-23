package com.gmail.bezkrovna1998;

public class Main {

	public static void main(String[] args) {
		Cat catOne =new Cat("Barsik","Orange",3,6.3,false);
		System.out.println(catOne);
		catOne.voice();
		if(!catOne.isFed()) {
		System.out.println("Feed the CAT");
		catOne.setFed(true);
		}
		catOne.voice();
	}

}
