package com.gmail.bezkrovna1998;

public class Human {
	private String firstName;
	private String surname;
	private int id;
	public Human(String firstName, String surname, int id) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.id = id;
	}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
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
		return "firstName=" + firstName + ", surname=" + surname + ", id=" + id ;
	}
	

}
