package com.gmail.bezkrovna1998;

public class Student extends Human implements Comparable {
	private int course;

	public Student(String firstName, String surname,int age, int id, int course,boolean sex) {
		super(firstName, surname, id,age, sex);
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String surname,int age, int id,boolean sex) {
		super(firstName, surname, id,age,sex);
		// TODO Auto-generated constructor stub
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String info() {
		StringBuilder sb=new StringBuilder();
		sb.append("Student [").append(super.info());
		sb.append(", course=").append(course);
		sb.append(" ]");
		return sb.toString();
	}

	@Override
	public int compareTo(Object arg0) {
		Student anotherBaby = (Student) arg0;
		if (this.getId() > anotherBaby.getId()) {
			return 1;
		}
		if(this.getId() < anotherBaby.getId()){
			return -1;
		}
		return 0;
		
	}

	

}





