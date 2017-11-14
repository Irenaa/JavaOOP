package com.gmail.bezkrovna1998;

import java.util.Comparator;

public class NameCompare implements Comparator<Student>{

	@Override
	public int compare(Student obj1,Student obj2) {
		if(obj1==null && obj2==null) {
			return 0;
		}
		if(obj1!=null && obj2==null) {
			return -1;
		}
		if(obj1==null && obj2!=null) {
			return 1;
		}
		return obj1.getFirstName().compareTo(obj2.getFirstName());
		
	}
}
