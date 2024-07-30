package java0730;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,62,31,1,54,31};
//		Set<Integer> set3 = new HashSet<>(arr);  // 배열을 set으로 변환 불가능.
		List<Integer> list3 = Arrays.asList(arr); // 배열을 list로 변환 후
		Set<Integer> set3 = new HashSet<>(list3); // Set으로 변환.
		System.out.println(set3);
		
		List<Integer> list1 = Arrays.asList(1,62,31,1,54,31); // 리터럴 값으로 ArrayList 생성
		List<String> list2 = Arrays.asList("홍길동", "김길동", "홍길동");
		
		System.out.println(list1);
		System.out.println(list2);
		
		Set<Integer> set1 = new HashSet<>(list1); // list를 set으로 변환(중복 제거)
		System.out.println(set1); 
		Set<String> set2 = new HashSet<>(list2);
		System.out.println(set2);
	}
}