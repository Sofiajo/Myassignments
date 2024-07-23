package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] a = {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
		
		//  sorted values 1,2,3,4,6,7 
		
		
	for (int i = 0; i < a.length; i++) {
		
		int j= i+1;
		
		//j =   1,2,3,4,5,6,7
		//a[i]= 1,2,3,4,6,7
		
		if (a[i] != j) {
			
			System.out.println("Missing number is:" +j);
			
			break;
			
		}
		
			
	}

	}

}

