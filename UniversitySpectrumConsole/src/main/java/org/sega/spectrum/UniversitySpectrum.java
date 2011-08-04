package org.sega.spectrum;

import java.util.Scanner;


public class UniversitySpectrum {
		
	public static void main(String[] args) {
		
		int i = getChoice();
		
	    while (i!=4){		
	    	switch (i) {
	    		case 1:
	    			StudentEnrollmentController.addstudent();
	    			break;
	    		case 2:
	    			StudentEnrollmentController.deletestudent();
	    			break;
	    		case 3:
	    			StudentEnrollmentController.displayStudent();
	    			break;
	    	}
	    	
		 i = getChoice();
		}
	    
	}	
	
	public static int getChoice() {

		Scanner sc = new Scanner(System.in);
		System.out.print("<ENTER> to proceed: ");
		sc.next();
	
		System.out.println("1.Enroll Student  ");
    	System.out.println("2.Delete Student ");
		System.out.println("3.Display Students ");
		System.out.println("4.Quit");
		System.out.print("Enter Your Choice: ");
		
		int i = sc.nextInt();
		return i;
		
	}
    

}
