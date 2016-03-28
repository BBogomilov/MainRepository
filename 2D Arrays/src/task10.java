
public class task10 {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 7, 5, 6, 89, 7, 3, 6, 2, 3, 6, 87, 2, 45, 7, 2, 65 };
		int frequentEl = mostFrequentEl(arr);
		System.out.println(frequentEl);

	}
	
	static int mostFrequentEl (int[] arr) {
		int count =0;
		int tempCount =0;
		int tempEl =0;
		int popular =arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			tempCount =0;
			tempEl = arr[i];
			
			if(i !=0 && tempEl == arr[i-1])
				continue;
			
			for(int j=0; j<arr.length; j++) {
				if(tempEl == arr[j]) {
					tempCount++;
				}
				
				if(tempCount > count) {
					popular = tempEl;
					count = tempCount;
				}
			}
		}
		return popular;
	}

}
