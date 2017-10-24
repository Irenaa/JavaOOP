package com.gmal.bezkrovna1998;

public class Network {
	private int quantity; 
	private Phone[] phonesList = new Phone[100];
	private int n;
	
	public Network(int quantity) {
		super();
		this.quantity = quantity;
		for (int i = 0; i < this.quantity ; i++) {
            this.phonesList[i] = new Phone();

        }
		this.n=0;
	}

	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPhone(Phone phone) {
		for (int i = 0; i < n; i++) {
			if(this.phonesList[i].getNumber().equals(phone.getNumber())) {
				return true;
			}
		}
		return false;
		
	}
	public boolean addPhone(Phone phone) {
		if(n!=quantity) {
		this.phonesList[n]=phone;
		n++;
		return true;
		}else {
			System.out.println("Network is full.Change your network");
			return false;
		}
	}
	
	
}
