package com.gmail.bezkrovna1998;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> bigBang=new ArrayList<>();
		bigBang.add("Leonard");
		bigBang.add("Sheldon");
		bigBang.add("Volovitc");
		bigBang.add("Kutrapalli");
		bigBang.add("Penny");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of bottles");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String temp=bigBang.get(0);
			bigBang.remove(0);
			bigBang.add(bigBang.size(), temp);
			bigBang.add(bigBang.size(), temp);
		}
		System.out.println(bigBang);
		sc.close();
	}

}
