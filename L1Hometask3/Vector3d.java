package com.gmail.bezkrovna1998;

public class Vector3d {

	private double x;
	private double y;
	private double z;
	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3d() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public static Vector3d sum(Vector3d vOne,Vector3d vTwo) {
		Vector3d suma=new Vector3d();
		suma.setX(vOne.x+vTwo.x);
		suma.setY(vOne.y+vTwo.y);
		suma.setZ(vOne.z+vTwo.z);
		return suma;
	}
	
	public double scalar(Vector3d vOne) {
		return (this.x*vOne.x+this.y*vOne.y+this.z*vOne.z);
	}
	
	public static Vector3d vectProduct(Vector3d vOne,Vector3d vTwo) {
		Vector3d vect=new Vector3d();
		vect.setX(vOne.y*vTwo.z-vOne.z*vTwo.y);
		vect.setY(vOne.z*vTwo.x-vOne.x*vTwo.z);
		vect.setZ(vOne.x*vTwo.y-vOne.y*vTwo.x);
		return vect;
		
	}
	
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", z=" + z ;
	}
	
}
