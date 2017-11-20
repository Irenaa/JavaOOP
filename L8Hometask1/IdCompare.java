package com.gmail.bezkrovna1998;

import java.util.Comparator;

public class IdCompare implements Comparator<Student>{
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
		return (obj1.getId()-obj2.getId());
	}
}
