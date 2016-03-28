public class HillsAndDowns {

	public static void main(String[] args) {
		
		int[] arr = {42,44,57,79,50,49,8,3,-23};
		int extremum = findExtremum(arr);
		System.out.println(extremum);

	}
	static int binarySearch (int[] arr,boolean isHill, int start, int end) {
		
		if(start>=end) {
			return start;
		}
		
		int mid = (start+end)/2;
		
		if(isHill) {
			if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
				return mid;
			}

			if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
				return binarySearch(arr,isHill,mid+1,end);
			}
			
			if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) {
				return binarySearch(arr, isHill,start, mid-1);
			}
		}
		else {
			if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
				return mid;
			}

			if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
				return binarySearch(arr, isHill,start, mid-1);
			}
			
			if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) {
				return binarySearch(arr,isHill,mid+1,end);
			}
		}
		//will never happen
		return mid;


	}
	
	static int findExtremum(int[] arr) {
		boolean isHill;
		if(arr[0] > arr[1]) {
			isHill = false;
		}
		else isHill = true;
		System.out.println(isHill ? "Hill" : "Down");
		
		System.out.print("Extremum: ");
		int result = binarySearch(arr, isHill, 0, arr.length-1);
		return result;
	}

}