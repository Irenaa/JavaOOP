package com.gmail.bezkrovna1998;

public class Circle extends Shape{
	private Point A;
	private Point B;
	public Circle(Point a, Point b) {
		super();
		A = a;
		B = b;
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point getA() {
		return A;
	}
	public void setA(Point a) {
		A = a;
	}
	public Point getB() {
		return B;
	}
	public void setB(Point b) {
		B = b;
	}
	@Override
	double calculatePerimetr() {
		double radius=A.getDistance(B);
		return 2*Math.PI*radius;
	}
	@Override
	double calculateArea() {
		double radius=A.getDistance(B);
		return Math.PI*Math.pow(radius,2);
	}
	@Override
	public String toString() {
		return "Circle [O=" + A + ", B=" + B + ", Area=" + calculateArea() + "]";
	}
	
}
