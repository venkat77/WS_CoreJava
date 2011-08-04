import java.util.Scanner;

public class RamaArrayListSpike {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total subjects: ");
		int n = scanner.nextInt();
		
		RamaArrayList ramaList = new RamaArrayList(n);
		int i=0;
		System.out.print("Enter number " + (i+1) + "(-1 to stop): ");
		int subject = scanner.nextInt();
		while(subject != -1) {
			boolean succeeded = ramaList.add(i, subject);
			if(!succeeded) {
				System.out.println("Sorry!!! We are out of capacity");
				break;
			}
			i++;
			System.out.print("Enter number " + (i+1) + "(-1 to stop): ");
			subject = scanner.nextInt();
		}		
		
		int size = ramaList.getSize();
		
		int[] sortedArray = sort(ramaList.getAll(), size);
		int minimum = calculateMinimum(ramaList.getAll(), size);
		int maximum = calculateMaximum(ramaList.getAll(), size);
		System.out.println("Minimum score: " + minimum );
		System.out.println("Maximum Score: " + maximum );
		RamaArrayListSpike.display(sortedArray, size);	
	}

	public static int[] sort(int[] subs, int size) {
			
		for(int j=1;j<size;j++) {
			for( int i=j;i<size;i++) {
				if(subs[i]<subs[j-1]) {
					int y= subs[j-1];
					subs[j-1]=subs[i];
					subs[i]=y;
				}
			}	
		}
		
		return subs;		
	}
		
	public static int calculateMinimum(int[] subs, int size) {
		int min=subs[0];
		for( int i=1; i < size; i++) {
			if(subs[i] < min){
			int y= subs[i];
			subs[i] = min;
			min=y;	
			}
		}
		return min;
	}	
	
	public static int calculateMaximum(int[] subs, int size){
		
		int max = subs[0];
		for(int i=1;i < size; i++) {
			if(subs[i] > max) {
				max = subs[i];
			}
		}
		return max;	
	}
	
	public static void display(int[] subs, int size) {
		for(int i=0;i < size;i++) {
			System.out.print(subs[i] + " ");	
		}
	}	 
}
