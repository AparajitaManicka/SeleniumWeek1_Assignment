package week1.assignment;

import java.util.Arrays;

public class ArrayPrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		for (int i = 0; i <= arr.length - 1; i++) {

			for (int j = i+1; j <= arr.length - 1; j++) {
				
				if (arr[j] == arr[i]) {
					
					
						System.out.println(arr[j]);
					
				}
				
			}
			
		
		}
	}
}
//14,17,18