package com.gmail.bezkrovna1998;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		MyFileFilter mFF = new MyFileFilter("doc","docx");
		File folderIn= new File("E:\\�ϲ_new\\��. ϲ���Ȫ����");
		File[] arrFiles= folderIn.listFiles(mFF);
		
		
		File folderOut = new File("E:\\�ϲ_new\\��. ϲ���Ȫ����\\New folder1");
		for (File file : arrFiles) {
		try {
			
				File out= new File(folderOut+"\\"+file.getName());
				System.out.println(file.getName());
				FileWorker.copyFile(file, out);
			}
			
			
		catch(IOException e) {
			e.printStackTrace();
		}
		}


	}

}
