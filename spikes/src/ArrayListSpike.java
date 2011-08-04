import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSpike {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int i=0;
		System.out.print("Enter number " + (i+1) + "(-1 to stop): ");
		int subject = scanner.nextInt();
		
		while(subject != -1) {
			arrayList.add(subject);
			i++;
			System.out.print("Enter number " + (i+1) + "(-1 to stop): ");
			subject = scanner.nextInt();
		}		
		
		ArrayList<Integer> sortedArray = sort(arrayList);
		int minimum = calculateMinimum(arrayList);
		int maximum = calculateMaximum(arrayList);
		System.out.println("Minimum score: " + minimum );
		System.out.println("Maximum Score: " + maximum );
		ArrayListSpike.display(sortedArray);	
	}

	public static ArrayList<Integer> sort(ArrayList<Integer> list) {
			
		for(int j=1;j<list.size();j++) {
			for( int i=j;i<list.size();i++) {
				if(list.get(i) < list.get(j-1)) {
					int y= list.get(j-1);
					list.set((j-1), list.get(i));
					list.set(i, y);
				}
			}	
		}
		
		return list;		
	}
		
	public static int calculateMinimum(ArrayList<Integer> list) {
		
		int min = list.get(0);
		
		for( int i=1; i < list.size(); i++) {
			if(list.get(i) < min){
				int y= list.get(i);
				min=y;	
			}
		}
		
		return min;
	}	
	
	public static int calculateMaximum(ArrayList<Integer> list){
		
		int max = list.get(0);
		for(int i=1;i < list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;	
	}
	
	public static void display(ArrayList<Integer> list) {
		for(int i=0;i < list.size();i++) {
			System.out.print(list.get(i) + " ");	
		}
	}	 
}
