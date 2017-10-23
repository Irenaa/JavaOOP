package com.gmail.bezkrovna1998;

public class Triangle {
	private double a;
	private double b;
	private double c;
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public double area() {
		double halfP = (a + b + c) / 2.0;
		double area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
		return area;
		
	}
	
	public boolean isTriangle() {
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			return true;
		}else {
		System.out.println("Opps!");
			return false;
		}
	}

}
