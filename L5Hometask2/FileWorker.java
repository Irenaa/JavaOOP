package com.gmail.bezkrovna1998;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWorker {
	private File a;
	private File b;
	private File c;

	public FileWorker(File a, File b, File c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public FileWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File getA() {
		return a;
	}

	public void setA(File a) {
		this.a = a;
	}

	public File getB() {
		return b;
	}

	public void setB(File b) {
		this.b = b;
	}

	public File getC() {
		return c;
	}

	public void setC(File c) {
		this.c = c;
	}

	public static String getText(File a) {
		if (a == null) {
			throw new IllegalArgumentException("null file pointer");
		}
		StringBuffer sb = new StringBuffer();
		try (BufferedReader f = new BufferedReader(new FileReader(a.getName()))) {
			String str = "";
			for (; (str = f.readLine()) != null;)
				sb.append(str);
			sb.append(System.lineSeparator());
		} catch (IOException e) {
			System.out.println("ERROR");
		}
		return sb.toString();
	}

	public static String[] getArray(String s) {
		String[] array = s.split("[ ,.?!\n]");
		return array;
	}

	public static void saveToFile(File file, String s) {
		if (file == null) {
			throw new IllegalArgumentException("null file pointer");
		}
		try (PrintWriter a = new PrintWriter(file.getName())) {
			a.println(s);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

	}

	public static void similarWordsFile(File a, File b, File c) {
		if (a == null && b == null && c == null) {
			throw new IllegalArgumentException("null file pointer");
		}
		String textA = FileWorker.getText(a);
		String textB = FileWorker.getText(b);
		String[] arrayA = FileWorker.getArray(textA);
		String[] arrayB = FileWorker.getArray(textB);
		StringBuffer sbuf = new StringBuffer();
		for (String stringA : arrayA) {
			for (String stringB : arrayB) {
				if (stringA.equals(stringB)) {
					sbuf.append(stringA + " ");
				}
			}
		}
		FileWorker.saveToFile(c, sbuf.toString());

	}

}
