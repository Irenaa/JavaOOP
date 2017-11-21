package com.gmail.bezkrovna1998;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Text {
	public static String loadTextFromFile(File file) {
		if (file == null) {
			throw new IllegalArgumentException("null file pointer");
		}
		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				sb.append(text);
			}
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("non");
		}
		return sb.toString();
	}
	
	public static int countLetter(String text, char letter) {
		int letterNum = 0;
		for (char let : text.toCharArray()) {
			if (let == letter) {
				letterNum += 1;
			}
		}
		return letterNum;
	}

}
