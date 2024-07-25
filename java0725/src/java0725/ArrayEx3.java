package java0725;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
//		int[] array = {1,1,4,5,7,8,9,14,42,32};// 정렬이 된상태
		int[] array = {3,200,100,15,20,24,52,31,245};
		int found = Arrays.binarySearch(array, 20);
		System.out.println(found);
		
	}

}
