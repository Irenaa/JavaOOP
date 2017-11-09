package com.gmail.bezkrovna1998;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileWorker {

	public static void copyFile(File in,File out)throws IOException{
		if(in==null||out==null) {
			throw new IllegalArgumentException("Null file pointer");
		}
		try(InputStream inSt=new FileInputStream(in);
				OutputStream outSt=new FileOutputStream(out)){
			int byteCopy =0;
			byte[] bufferArray = new byte[1024*1024];
			
			for(;(byteCopy=inSt.read(bufferArray))>0;) {
				outSt.write(bufferArray,0,byteCopy);
			}
			
			
			
		}catch(IOException e) {
			throw e;
		}
		
	}
}

