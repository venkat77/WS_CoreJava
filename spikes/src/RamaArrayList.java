
public class RamaArrayList {

	private int[] subjects;
	private int size;
	
	public RamaArrayList(int n) {
		subjects = new int[n];
	}
	
	public boolean add(int i, int subject) {
		
		boolean success = true;
		
		try {
			this.validateArray(i);
			this.subjects[i] = subject;
			this.size++;
		} catch(ArrayIndexOutOfBoundsException aobe) {
			success = false;
		}
		
		return success;
	}
	
	private void validateArray(int index) {
		
		if(index == this.subjects.length) {
			
			int[] newSubjects = new int[this.subjects.length * 2];
			
			for(int i=0; i<subjects.length; i++) {
				newSubjects[i] = this.subjects[i];
			}
			
			this.subjects = newSubjects;
		}
	}
	
	public int[] getAll() {
		return this.subjects;
	}
	
	public int getSize() {
		return this.size;
	}
}
