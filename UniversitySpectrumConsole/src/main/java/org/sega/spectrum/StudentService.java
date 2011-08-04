package org.sega.spectrum;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {
	
	private ArrayList<Student> studentList;
	
	public StudentService() {
		studentList = new ArrayList<Student>();
	}
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void delStudent(String studentId) {
		
		ArrayList<Student> studentsToDelete = new ArrayList<Student>();
		for(int i = 0;i <  studentList.size();i++) {
			Student student = studentList.get(i);
			String id = student.getID();
			if(id.equals(studentId)) {
				studentsToDelete.add(student);
			}
		}
		
		for(Student studentToDelete : studentsToDelete) {
			studentList.remove(studentToDelete);
		}
	}
	
	public void deletebyIterator(String studentId) {
		
		Iterator<Student> studentIterator = studentList.iterator();
		while(studentIterator.hasNext()) {
			Student student = studentIterator.next();
			String id = student.getID();
			if(id.equals(studentId)) {
				studentIterator.remove();
				break;
			}
		}
	}
	
	public  ArrayList<Student> getAll() {
		return this.studentList;	
	}	
}