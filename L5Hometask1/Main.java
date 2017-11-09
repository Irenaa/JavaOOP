package com.gmail.bezkrovna1998;

import java.io.File;


public class Main {

	public static void main(String[] args) {
		
		File folderIn= new File("E:\\ÊÏ²_new\\ÅÊ. Ï²ÄÏĞÈªÌÑÂÀ");
		File folderOut = new File("E:\\ÊÏ²_new\\ÅÊ. Ï²ÄÏĞÈªÌÑÂÀ\\New folder1");
		MyFileFilter mFF = new MyFileFilter("doc","docx");
		
		FileWorker.copyFromTo(folderIn, folderOut, mFF);


	}

}
