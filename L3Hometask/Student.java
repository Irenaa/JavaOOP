package com.gmail.bezkrovna1998;

public class Student extends Human{
	private int course;

	public Student(String firstName, String surname, int id, int course) {
		super(firstName, surname, id);
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String surname, int id) {
		super(firstName, surname, id);
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

	

}
