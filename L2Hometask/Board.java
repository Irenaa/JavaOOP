package com.gmail.bezkrovna1998;

public class Board {
	private String name;
	private Shape[] board = new Shape[4];

	
	public Board(String name) {
		super();
		this.name = name;
	}

	public Board() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addShape(Shape sh, int pos) {
		try{if (board[pos - 1] == null) {
			board[pos-1]=sh;
			return;
		}
		System.out.println("Opps, check the position");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Incorrect index.Sorry.We have only 4 parts on the board.");
		}
	}
	
	public void deleteShape(int pos) {
		try {if (board[pos - 1] != null ) {
			board[pos-1]=null;
			System.out.println("Successsful delete)");
			return;
		}
		System.out.println("This part is empty(");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Incorrect index.Sorry.We have only 4 parts on the board.");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(name).append(System.lineSeparator());
		int cellNumber=1;
		double area=0;
		for (Shape shape : board) {
			sb.append(cellNumber++).append(")");
			if(shape==null) {
				sb.append("free");
			}else {
				sb.append(shape);
				area+=shape.calculateArea();
			}
			sb.append(System.lineSeparator());
		}
		sb.append("Area = "+area);
		return sb.toString();
		
	}
	
}
