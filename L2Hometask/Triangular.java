package com.gmail.bezkrovna1998;

public class Triangular extends Shape {
	private Point A;
	private Point B;
	private Point C;
	public Triangular(Point a, Point b, Point c) {
		super();
		A = a;
		B = b;
		C = c;
	}
	public Triangular() {
		super();
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
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
	@Override
	double calculatePerimetr() {
		double per=A.getDistance(B)+B.getDistance(C)+C.getDistance(A);
		return per;
	}
	@Override
	double calculateArea() {
		double halfPer=(A.getDistance(B)+B.getDistance(C)+C.getDistance(A))/2;
		return Math.sqrt(halfPer*(halfPer-A.getDistance(B))*(halfPer-B.getDistance(C))*(halfPer-C.getDistance(A)));
	}
	@Override
	public String toString() {
		return "Triangular [A=" + A + ", B=" + B + ", C=" + C + ", Area=" + calculateArea() + "]";
	}
	

}
