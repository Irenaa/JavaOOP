package com.gmail.bezkrovna1998;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class FileWorker {

	public static void saveObject(Object obj,File file) {
		try(ObjectOutput oos= new ObjectOutputStream(new FileOutputStream(file)) ){
			oos.writeObject(obj);
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public static Object loadObject(File file) {
		try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))){
			return ois.readObject();
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
