package java0730;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex5 {
	public static void main(String[] args) {	
		IntStream ii = IntStream.range(1, 5); // 1부터 4까지 포함
		IntStream ii2 = IntStream.rangeClosed(1, 5); //1부터 5까지 포함
//		ii.forEach(System.out::println);
//		ii2.forEach(a->{
//			System.out.println(a);
//		});
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		IntStream li3 = IntStream.range(1, count);
		System.out.println(li3.sum());
	}

}
