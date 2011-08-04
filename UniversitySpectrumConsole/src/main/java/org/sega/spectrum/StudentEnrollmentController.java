package org.sega.spectrum;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEnrollmentController {
	
	private static StudentService service;
	private static int maxId = 1;
	
    static {
    	service = new StudentService();
    }
    
	public static void addstudentVersion1() {
	 
		Scanner sanner = new Scanner(System.in);
		System.out.println("First Name :");
		String fName = sanner.nextLine();
		System.out.println("Last Name :");
		String lName = sanner.nextLine();
		System.out.println("Age :");
		String age = sanner.nextLine();
		
		ArrayList<Student> allStudents = service.getAll();
		int maxId = 0;
		for(int i = 0; i< allStudents.size();i++) {
			Student aStudent = allStudents.get(i);
			int id = Integer.parseInt(aStudent.getID());
			if(	id > maxId){	
				maxId = id;
			}
		}
		String sID = Integer.toString(maxId + 1);
	
		Student student = new Student(fName,lName,age,sID);
		
		service.addStudent(student);
			
	}
	
	public static void addstudentVersion2() {
		 
		Scanner sanner = new Scanner(System.in);
		System.out.println("First Name :");
		String fName = sanner.nextLine();
		System.out.println("Last Name :");
		String lName = sanner.nextLine();
		System.out.println("Age :");
		String age = sanner.nextLine();
		
		String sID = Integer.toString(maxId);
	
		Student student = new Student(fName,lName,age,sID);
		
		service.addStudent(student);
		
		maxId++;		
	}
	
	
	public static void addstudent() {
		 
		Scanner sanner = new Scanner(System.in);
		System.out.println("First Name :");
		String fName = sanner.nextLine();
		System.out.println("Last Name :");
		String lName = sanner.nextLine();
		System.out.println("Age :");
		String age = sanner.nextLine();
		
		Student student = new Student(fName,lName,age);
		service.addStudent(student);	
	}
	
	public static void deletestudent() {
		System.out.println("Enter student Id to be deleted:");
		Scanner sanner = new Scanner(System.in);
		String studentId = sanner.nextLine();
		service.deletebyIterator(studentId);    
	}
	
	public static void displayStudent() {
		ArrayList<Student> allStudents = service.getAll();
		for(int i=0; i< allStudents.size(); i++) {
			Student student = allStudents.get(i);
			String studentInfo = student.getStudentInfo();
			System.out.println("Student Details:");	
			System.out.println(studentInfo);
		}
		
	}
	
	
}