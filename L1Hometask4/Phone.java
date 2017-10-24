package com.gmal.bezkrovna1998;

public class Phone {
	private String firma;
	private String number;
	public Phone(String firma, String number) {
		super();
		this.firma = firma;
		this.number = number;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirma() {
		return firma;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		if (number.length()==5) { 
		this.number = number;
		}else {
			System.out.println("Opps");
		}
	}
	public void registration(Network net) {
		if(net.isPhone(this)) {
		System.out.println(this+" You have already registered your phone");
		} else {
			if(net.addPhone(this)) {
			System.out.println(this+" have been registered successfully");
			}
		}
	}
	
	public void call(Network net,String num) {
		Phone ph=new Phone("",num);
		if(net.isPhone(ph)&& net.isPhone(this)&&!this.number.equals(num)){
			System.out.println(num +" calling");
		}else {
			System.out.println("check the number");
		}
	}
	
	
	@Override
	public String toString() {
		return "Phone [firma=" + firma + ", number=" + number + "]";
	}
	

}
