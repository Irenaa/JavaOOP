package com.gmail.bezkrovna1998;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("Animals.txt");
		Counter ct=new Counter();
		ct.count(file);
		System.out.println(ct);
	}

}
