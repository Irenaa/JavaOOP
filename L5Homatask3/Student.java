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
	public String studentForFile() {
		return this.getFirstName() + ";" + this.getSurname() + ";" + this.getAge() + ";"
				+ this.getId() + ";" + this.getCourse() + ";" + this.isSex();
	}

	public static Student splitText(String text) {
		String[] stInfo = text.split(";");
		String firstName = stInfo[0];
		String surname = stInfo[1];
		int age = Integer.valueOf(stInfo[2]);
		int id=Integer.valueOf(stInfo[3]);
		int course=Integer.valueOf(stInfo[4]);
		boolean sex = (stInfo[5].equals("true"));
		Student student = new Student(firstName, surname ,age, id,course, sex);
		return student;
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





