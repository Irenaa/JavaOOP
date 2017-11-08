package com.gmail.bezkrovna1998;

public class Human {
	private String firstName;
	private String surname;
	private int id;
	private int age;
	private boolean sex;

	public Human(String firstName, String surname, int id, int age, boolean sex) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.id = id;
		this.age = age;
		this.sex=sex;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String info() {
		return "firstName=" + firstName + ", surname=" + surname + ", id=" + id + ", age=" + age+", sex=" + sex;
	}

}
