
public class MyStack {

	private static final int STARTING_ARRAY_SIZE = 4;
	private int currentPos = 0;
	private int minArrCurrentPos = 0;
	private Integer[] array;
	private Integer[] minArray;
	
	MyStack() {
		this.array = new Integer[STARTING_ARRAY_SIZE];
		this.minArray = new Integer[STARTING_ARRAY_SIZE];
	}
	
	public void pop(){
		if(array[currentPos-1] == minArray[minArrCurrentPos-1]) {
			minArray[minArrCurrentPos-1] = null;
			minArrCurrentPos--;
		}
		array[currentPos-1] = null;
		currentPos--;
	}
	
	public void push(Integer num) {
			array[currentPos] = num;
			currentPos++;
			if(currentPos == array.length)
				increaseSizeOfMainArr();
			
			if(minArrCurrentPos == 0) {
				minArray[minArrCurrentPos] = num;
				minArrCurrentPos++;
			}
			else {
				if(num <= minArray[minArrCurrentPos-1]) {
					minArray[minArrCurrentPos] = num;
					minArrCurrentPos++;
					if(minArrCurrentPos == minArray.length)
						increaseSizeOfSecondaryArr();
				}
			}
	}
	
	public Integer minElement() {
		try {
		if(this.minArrCurrentPos == 0)
			throw new NullPointerException("There are no elements in this Stack");
		
		return this.minArray[this.minArrCurrentPos-1];
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	private void increaseSizeOfMainArr(){
		Integer[] newArr = new Integer[this.array.length*2];
		
		for(int i=0; i<this.array.length; i++) {
			newArr[i] = this.array[i];
		}
		this.array = newArr;
	}
	
	private void increaseSizeOfSecondaryArr(){
		Integer[] newArr = new Integer[this.minArray.length*2];
		
		for(int i=0; i<this.minArray.length; i++) {
			newArr[i] = this.minArray[i];
		}
		this.minArray = newArr;
	}
	
}
