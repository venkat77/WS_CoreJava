import java.util.Arrays;
import java.util.Scanner;

public class ArraySpike {
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total subjects: ");
		int n = scanner.nextInt();
		int[] subjects = new int[n];
		
		for( int i=0; i<n; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			int subject = scanner.nextInt();
			subjects[i] = subject;
		}		
		int[] sort	= sorting(subjects);	
		int minimum = calculateMinimum(subjects);
		int maximum = calculateMaximum(subjects);
		System.out.println("Minimum score: " + minimum );
		System.out.println("Maximum Score: " + maximum );
		System.out.println("sorting :" + Arrays.toString(sort));
		ArraySpike.display(subjects);	
	}

	public static int[] sorting(int[] subs) {
			
		for(int j=1;j<subs.length;j++) {
			for( int i=j;i<subs.length;i++) {
				if(subs[i]<subs[j-1]) {
					int y= subs[j-1];
					subs[j-1]=subs[i];
					subs[i]=y;
				}
			}	
		}
		
		return subs;		
	}
		
	public static int calculateMinimum(int[] subs) {
		int min=subs[0];
		for( int i=1; i < subs.length; i++) {
			if(subs[i] < min){
			int y= subs[i];
			subs[i] = min;
			min=y;	
			}
		}
		return min;
	}	
	
	public static int calculateMaximum(int[] subs){
		
		int max = subs[0];
		
		for(int i=1;i < subs.length; i++) {
			if(subs[i] > max) {
				max = subs[i];
			}
		}
		return max;	
	}
	
	public static void display(int[] subs) {
		for(int i=0;i < subs.length;i++) {
			System.out.print(subs[i] + " ");	
		}
	}	 
}