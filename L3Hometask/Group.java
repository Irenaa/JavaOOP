package com.gmail.bezkrovna1998;

public class Group {
	private String name;
	private Student[] listGroup = new Student[10];
	private int quantity;

	public Group(String name) {
		super();
		this.name = name;
		this.quantity = 0;
	}

	public Group() {
		super();
		this.quantity = 0;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStudent(Student sd) throws GroupException {
		if (listGroup[9] != null) {
			throw new GroupException();
		}
		if (sd != null) {
			listGroup[quantity++] = sd;
		}

	}

	public void deleteStudent(Student sd) {
		for (int i = 0; i < quantity; i++) {
			if (listGroup[i].getId() == sd.getId()) {
				System.out.println(listGroup[i].info() + " expelled");
				listGroup[i] = null;
				for (int j = i + 1; j < quantity; j++) {
					if (listGroup[j] != null) {
						listGroup[j - 1] = listGroup[j];
						listGroup[j] = null;
					}
				}
				this.quantity--;

				return;
			}
		}
		System.out.println("We don`t have such Student");

	}

	public String findStudent(String surname) {
		for (int i = 0; i < quantity; i++) {
			if (listGroup[i].getSurname().equals(surname)) {
				return listGroup[i].info();
			}
		}
		return "We don`t have such student";
	}

	public void sort() {
		for (int i = 0; i < quantity; i++) {
			for (int j = i + 1; j < quantity; j++) {
				if (listGroup[i].getSurname().compareTo(listGroup[j].getSurname()) > 0) {
					Student temp = listGroup[i];
					listGroup[i] = listGroup[j];
					listGroup[j] = temp;
				}
			}
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(System.lineSeparator());
		sort();
		for (int i = 0; i < quantity; i++) {
			sb.append(i + 1).append(") ").append(listGroup[i].info());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
