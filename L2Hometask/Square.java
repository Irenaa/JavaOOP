package com.gmail.bezkrovna1998;

public class Square extends Shape{
	private Point A;
	private Point B;
	private Point C;
	private Point D;
	public Square(Point a, Point b, Point c, Point d) {
		super();
		A = a;
		B = b;
		C = c;
		D = d;
	}
	public Square() {
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
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
	public Point getD() {
		return D;
	}
	public void setD(Point d) {
		D = d;
	}
	@Override
	double calculatePerimetr() {
		double per=A.getDistance(B)+B.getDistance(C)+C.getDistance(D)+D.getDistance(A);
		return per;
	}
	@Override
	double calculateArea() {
		double halfPer=(A.getDistance(B)+B.getDistance(C)+C.getDistance(A))/2;
		double area1= Math.sqrt(halfPer*(halfPer-A.getDistance(B))*(halfPer-B.getDistance(C))*(halfPer-C.getDistance(A)));
		halfPer=(D.getDistance(B)+B.getDistance(C)+C.getDistance(D))/2;
		double area2= Math.sqrt(halfPer*(halfPer-D.getDistance(B))*(halfPer-B.getDistance(C))*(halfPer-C.getDistance(D)));
		return area1+area2;
		
	}
	@Override
	public String toString() {
		return "Square [A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", Area=" + calculateArea() + "]";
	}
	
}
