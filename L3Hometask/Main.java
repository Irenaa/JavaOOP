package com.gmail.bezkrovna1998;

public class Main {

	public static void main(String[] args) {
		Student sd1 = new Student("Ira", "Bezkrovna", 12345, 2);
		Student sd2 = new Student("Vas", "Vezkr", 12678, 2);
		Student sd3 = new Student("Goo", "Nono", 23456, 2);
		Student sd4 = new Student("Sara", "Korbic", 34567, 2);
		Student sd5 = new Student("Sonya", "Abuk", 45678, 2);
		Student sd6 = new Student("Nasta", "Lomon", 56789, 2);
		Student sd7 = new Student("Mono", "Bomer", 98765, 2);
		Student sd8 = new Student("Gloria", "Lover", 87654, 2);
		Student sd9 = new Student("Gack", "Adulterer", 76543, 2);
		Student sd10 = new Student("Ben", "Myrul", 65432, 2);
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
			System.out.println(gr);
			System.out.println(gr.findStudent("Abuk"));
			gr.deleteStudent(sd5);
			System.out.println(gr);
			gr.addStudent(sd5);
			System.out.println(gr);
			gr.addStudent(sd5);
		} catch (GroupException e) {
			e.printStackTrace();
		}
	}

}
