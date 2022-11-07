//School Class.

import java.util.Scanner;

class Person {
	String name;
	String date_of_birth;

	public void getdata() {
		System.out.print("Enter Name of Person: ");
		name = School.sc.nextLine();
		System.out.print("Enter Date of Birth: ");
		date_of_birth = School.sc.nextLine();
	}

	public void putdata() {
		System.out.println("Name of Person: " + name);
		System.out.println("Date of Birth of Person: " + date_of_birth);
	}

}

class Teacher extends Person {
	float salary;
	String[] subjects = new String[2];

	public void getdata() {
		super.getdata();
		System.out.print("Enter salary of Teacher: ");
		salary = School.sc.nextFloat();
		School.sc.nextLine();
		System.out.print("Enter subjects teaches by teacher: ");
		subjects[0] = School.sc.nextLine();
		subjects[1] = School.sc.nextLine();
	}

	public void putdata() {
		super.putdata();
		System.out.println("Salary of Teacher: " + salary);
		System.out.println("Subjects teaches by Teacher: " + subjects[0] + " and " + subjects[1]);
		School.sc.nextLine();
	}
}

class Student extends Person {
	long student_ID;

	public void getdata() {
		super.getdata();
		System.out.print("Enter Student ID: ");
		student_ID = School.sc.nextLong();

	}

	public void putdata() {
		super.putdata();
		System.out.println("ID of Student: " + student_ID);
		School.sc.nextLine();
	}

}

class School {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Student stud = new Student();
		stud.getdata();
		stud.putdata();

		Teacher teach = new Teacher();
		teach.getdata();
		teach.putdata();

		Person per = new Person();
		per.getdata();
		per.putdata();
	}
}
