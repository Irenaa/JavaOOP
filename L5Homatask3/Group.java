package com.gmail.bezkrovna1998;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {
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

	public Student[] getListGroup() {
		Student[] grList=new Student[quantity];
		System.arraycopy(listGroup, 0, grList, 0, quantity);
		return grList;
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

	public Student findStudent(String surname) {
		for (int i = 0; i < quantity; i++) {
			if (listGroup[i].getSurname().equals(surname)) {
				return listGroup[i];
			}
		}
		return null;
	}

	public void sortSurname() {
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
	public static Student createStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		System.out.print("Enter surname: ");
		String surname =sc.nextLine();
		System.out.print("Enter id: ");
		int id=sc.nextInt();
		System.out.print("Enter the course: ");
		int course=sc.nextInt();
		System.out.print("Enter the age: ");
		int age=sc.nextInt();
		System.out.print("Are student a man?: ");
		boolean sex= sc.nextBoolean();
		Student st=new Student(name,surname,age,id,course,sex);
		sc.close();
		return st;
		
	}
	
	public void sortByParamentr(int i) {
		switch(i) {
			case 1: Arrays.sort(listGroup,new NameCompare());
			break;
			case 2: Arrays.sort(listGroup,new SurnameCompare());
			break;
			case 3: Arrays.sort(listGroup,new IdCompare());
			break;
			default:
				System.out.println("Opps no sort was made(");
		}
	}
	
	
	@Override
	public Student[] getSoldats() {
		int n=0;
		for (Student student : listGroup) {
			if(student!=null && student.isSex() && student.getAge()>=18) {
				n++;
			}
		}
		Student[] voenkomList=new Student[n];
		int i=0;
		for (Student student : listGroup) {
			if(student!=null && student.isSex() && student.getAge()>=18) {
				voenkomList[i]=student;
				System.out.println(student.info());
			}
		}
		
		return voenkomList;
	}
	public void saveGroup(String file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			for (Student student : this.getListGroup()) {
				if (student != null) {
					pw.println(student.studentForFile());
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public Group loadGroup(String file) {
		Group gr = new Group();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				gr.addStudent(Student.splitText(text));

			}
		} catch (IOException | GroupException e) {
			System.out.println(e);
		}
		return gr;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(System.lineSeparator());
		//sortSurname();
		//System.out.println(Arrays.toString(listGroup));
		//Arrays.sort(listGroup,0,quantity);
//		Arrays.sort(listGroup,new NameCompare());
		for (int i = 0; i < quantity; i++) {
			sb.append(i + 1).append(") ").append(listGroup[i].info());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
