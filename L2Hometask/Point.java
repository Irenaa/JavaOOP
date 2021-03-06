package com.gmail.bezkrovna1998;

public class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getDistance(Point B) {
		double distance=Math.sqrt(Math.pow(this.getX()-B.getX(), 2)+Math.pow(this.getY()-B.getY(), 2));
		return distance;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
