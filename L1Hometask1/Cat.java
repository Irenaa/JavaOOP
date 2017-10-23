package com.gmail.bezkrovna1998;

public class Cat {
	private String name;
	private String color;
	private int age;
	private double weight;
	private boolean fed;
	
	public Cat(String name, String color, int age, double weight,boolean fed) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.weight = weight;
		this.fed = fed;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFed() {
		return fed;
	}

	public void setFed(boolean fed) {
		this.fed = fed;
	}
	
	public void voice() {
		if (fed) {
			System.out.println("Mur");
		}else {
			System.out.println("SSSHHH");
		}
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + ", weight=" + weight + ", fed=" + fed + "]";
	}
	
	
	
	
}
