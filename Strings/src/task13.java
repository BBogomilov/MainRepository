/*
  To create a method that accepts two arrays of numbers and returns
an array containing all the elements of the two arrays so that in
the first part of the array elements are from the first array,
and in the second part - that of the second array.

  */
  
package homework5;

public class task13 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {7,8,9,10,11,12,20};
		int[] arr3 = func(arr1, arr2);

		for(int i=0; i<arr3.length; i++) {
			if(i == arr3.length-1) {
				System.out.print(arr3[i]);
			} else
		System.out.print(arr3[i] + ", ");
		}
	}
	
	static int[] func (int[] masiv1, int[] masiv2) {
		int[] masiv = new int[masiv1.length+masiv2.length];
		int j=0;
		
		for(int i=0; i<masiv.length; i++) {
			if(i<masiv1.length) {
			masiv[i] = masiv1[i];
			}
			else
				masiv[i] = masiv2[j++];
		}
		return masiv;
	}

}
