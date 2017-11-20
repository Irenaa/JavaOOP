package com.gmail.bezkrovna1998;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		Student sd1 = new Student("Ira", "Bezkrovna", 17, 12345, 2,false);
		Student sd2 = new Student("Vas", "Vezkr", 21, 12678, 2,true);
		Student sd3 = new Student("Goo", "Nono", 21, 23456, 2,true);
		Student sd4 = new Student("Sara", "Korbic", 17, 34567, 2,false);
		Student sd5 = new Student("Sonya", "Abuk", 20, 45678, 2,false);
		Student sd6 = new Student("Nasta", "Lomon", 19, 56789, 2,false);
		Student sd7 = new Student("Mono", "Bomer", 20, 98765, 2,true);
		Student sd8 = new Student("Gloria", "Lover", 18, 87654, 2,false);
		Student sd9 = new Student("Gack", "Adulterer", 18, 76543, 2,true);
		Student sd10 = new Student("Ben", "Myrul", 17, 65432, 2,true);
		Group gr = new Group("UK-61");
		try {
			gr.addStudent(sd10);
			gr.addStudent(sd8);
			gr.addStudent(sd9);
			gr.addStudent(sd1);
			System.out.println(gr);
			gr.addStudent(sd2);
			gr.addStudent(sd3);
			gr.addStudent(sd4);
			gr.addStudent(sd5);
			gr.addStudent(sd6);
			gr.addStudent(sd7);
			gr.sortByParamentr(1);
			System.out.println(gr);
			System.out.println(gr.findStudent("Abuk"));
			gr.deleteStudent(sd5);
			System.out.println(gr);
			gr.addStudent(sd5);
			gr.sortByParamentr(3);
			System.out.println(gr);
			gr.deleteStudent(sd5);
			gr.deleteStudent(sd8);
//			gr.addStudent(Group.createStudent());
//			System.out.println(gr);
			

		} catch (GroupException e) {
			e.printStackTrace();
		}
//		System.out.println("TADATADAM");
//		gr.getSoldats();
		
		File file = new File("group.txt");
		FileWorker.saveObject(gr, file);
		System.out.println();
		System.out.println("Group loaded from file");
		System.out.println();
		Group gr2= new Group();
		gr2 = (Group) FileWorker.loadObject(file);
		System.out.println(gr2);

	}
	
	

}
