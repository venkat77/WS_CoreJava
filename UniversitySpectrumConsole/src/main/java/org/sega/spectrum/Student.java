package org.sega.spectrum;

public class Student {
	
	private static int maxId = 1;
		    
	private String firstName;
	private String lastName;
	private String age;
	private String studentID;
	
	public Student(String sId) {
		this.studentID = sId;
	}
	
	public Student(String fName,String lName,String aAge) {
		
		this.firstName = fName;
		this.lastName = lName;
		this.age = aAge;
		
		this.studentID = String.valueOf(Student.maxId);
		Student.maxId++;
	}
	
	public Student(String fName,String lName,String aAge,String sID) {
		
		this.firstName = fName;
		this.lastName = lName;
		this.age = aAge;
		this.studentID = sID;
	
	}
	
    public String getStudentInfo() {
    	String studentInfo = "\n" + "FIRST NAME:" + this.firstName + "\n" + "LAST NAME:" + this.lastName +"\n" +"AGE:" + this.age +"\n"+ "STUDENT ID:" +this.studentID +"\n";
    	return studentInfo;
    }
    public String getID() {
    	return this.studentID;
    }
    public String toString(){
		return this.firstName;
	}
    public boolean equals(Object obj){
    	
    	Student student = (Student) obj;
    	
    	if(this.studentID.equals(student.studentID)) {
    		return true;
    	} else {
    		return false;
    	}
    }
}