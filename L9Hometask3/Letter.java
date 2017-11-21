package com.gmail.bezkrovna1998;

public class Letter implements Comparable {
	char letter;
	int num = 0;

	public Letter(char letter, int num) {
		super();
		this.letter = letter;
		this.num = num;
	}

	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int compareTo (Object obj) {
		Letter lt1=(Letter)obj;
		return lt1.num-this.num;
	}

	@Override
	public String toString() {
		return "Letter [letter=" + letter + ", num=" + num + "]";
	}
	
	
}
