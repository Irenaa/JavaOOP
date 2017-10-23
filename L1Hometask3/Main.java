package com.gmail.bezkrovna1998;

public class Main {

	public static void main(String[] args) {
		Vector3d vectOne=new Vector3d(0,2,3);
		Vector3d vectTwo=new Vector3d(3,0,2);
		System.out.println(vectOne);
		System.out.println(vectTwo);
		System.out.println("Vector sum - "+Vector3d.sum(vectOne,vectTwo));
		System.out.println("Scalar product = " + vectOne.scalar(vectTwo));
		System.out.println("Vector product - " + Vector3d.vectProduct(vectOne, vectTwo));

	}

}
