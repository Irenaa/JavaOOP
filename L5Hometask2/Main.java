package com.gmail.bezkrovna1998;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File a=new File("first.txt");
		File b=new File("second.txt");
		File c=new File("c.txt");
		FileWorker.similarWordsFile(a,b,c);
	}

}
