package com.gmail.bezkrovna1998;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


public class Counter {
	private ArrayList<Letter> letterArr = new ArrayList<>();
	
	public void count(File file) {
		String text=Text.loadTextFromFile(file);
		text=text.toLowerCase();
		for(char i ='a';i<='z';i++) {
			int counter=Text.countLetter(text, i);
			letterArr.add(new Letter(i,counter));
		}
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("The frequancy of letters");
		sb.append(System.lineSeparator());
		Collections.sort(letterArr);
		for (Letter letter : letterArr) {
			if(letter!=null) {
				sb.append(letter);
				sb.append(System.lineSeparator());
			}
			
		}
		return sb.toString();
	}
	

}
