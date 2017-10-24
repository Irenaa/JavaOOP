package com.gmal.bezkrovna1998;

public class Main {

	public static void main(String[] args) {
		Network Vodafone=new Network(5);
		Phone phOne=new Phone("Nokia","23467");
		phOne.registration(Vodafone);
		Phone phTwo=new Phone("Samsung","98765");
		phTwo.registration(Vodafone);
		phOne.registration(Vodafone);
		phOne.call(Vodafone, "98765");
		phOne.call(Vodafone, "67548");
		phTwo.call(Vodafone, "98765");
		Phone ph3=new Phone("Samsung","68765");
		Phone ph4=new Phone("Iphone","97365");
		Phone ph5=new Phone("Samsung","09355");
		Phone ph6=new Phone("Samsung","12345");
		ph3.registration(Vodafone);
		ph4.registration(Vodafone);
		ph4.registration(Vodafone);
		ph5.registration(Vodafone);
		ph6.registration(Vodafone);
		
		
	}

}
