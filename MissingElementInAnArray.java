package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementInAnArray {
			
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 7, 6, 8};
		 Arrays.sort(arr);
			int length = arr.length;
			
			for (int i = arr[0]; i<arr.length; i++)
		
				{
				if(i!= arr[i-1])
				System.out.println(i);
						
				break;		
			}
		}
				
	}