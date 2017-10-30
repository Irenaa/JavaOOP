package com.gmail.bezkrovna1998;

public class Main {

	public static void main(String[] args) {
		Point A=new Point(0,0);
		Point B=new Point(3,4);
		Point C=new Point(4,5);
		Point D=new Point(6,0);
		Triangular tr=new Triangular(A,B,C);
		Square sq=new Square(A,B,C,D);
		Circle cr=new Circle(A,B);
		Board myBoard=new Board("My Board");
		myBoard.addShape(cr, 2);
		myBoard.addShape(sq, 1);
		myBoard.addShape(tr, 4);
		System.out.println(myBoard);
		myBoard.deleteShape(2);
		System.out.println(myBoard);
		myBoard.deleteShape(3);
		myBoard.deleteShape(7);
		System.out.println(myBoard);
	}

}
