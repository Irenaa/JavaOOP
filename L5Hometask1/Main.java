package com.gmail.bezkrovna1998;

import java.io.File;


public class Main {

	public static void main(String[] args) {
		
		File folderIn= new File("E:\\�ϲ_new\\��. ϲ���Ȫ����");
		File folderOut = new File("E:\\�ϲ_new\\��. ϲ���Ȫ����\\New folder1");
		MyFileFilter mFF = new MyFileFilter("doc","docx");
		
		FileWorker.copyFromTo(folderIn, folderOut, mFF);


	}

}
