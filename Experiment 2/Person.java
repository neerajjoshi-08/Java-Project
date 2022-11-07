//People

import java.util.Scanner;
class People {
    protected String name;
    protected String city;

    void getdata() {
        System.out.print("Enter name of person: ");
        name = Person.sc.nextLine();
        System.out.print("Enter name of city: ");
        city = Person.sc.nextLine();
    }

    void putdata() {
        System.out.println("Name of person: " + name);
        System.out.println("Name of city: " + city);
    }
}

class Student extends People {
    private long rollno;
    private String branch;
        
   void getdata() {
    super.getdata();
    System.out.print("Enter rollno of student: ");
    rollno = Person.sc.nextLong();
    Person.sc.nextLine();
    System.out.print("Enter branch of student: ");
    branch = Person.sc.nextLine();
    }

    void putdata() {
        super.putdata();
        System.out.println("Rollno of student: " + rollno);
        System.out.println("Branch of student: " + branch);
    }
}

class Teacher extends People {
    private String qualification;
    private String subject;
        
   void getdata() {
        super.getdata();
        System.out.print("Enter qualification of teacher: ");
        qualification = Person.sc.nextLine();
        System.out.print("Enter subject of teacher: ");
        subject = Person.sc.nextLine();
    }

    void putdata() {
        super.putdata();
        System.out.println("Qualification of teacher: " + qualification);
        System.out.println("Subject of teacher: " + subject);
    }
}

class Person {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println("\nEnter details of student-----> ");
        stud.getdata();
        System.out.println("\nDetails of student-----> ");
        stud.putdata();

        Teacher teach = new Teacher();
        System.out.println("\nEnter details of teacher-----> ");
        teach.getdata();
        System.out.println("\nDetails of teacher-----> ");
        teach.putdata();
    }
}