package java0715;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<String> list; // String list[]; 
		list = new ArrayList<String>(); // new String[10];
//		ArrayList<String> list2 = new ArrayList<String>();
//		ArrayList<String> list3 = new ArrayList<>(); // 자바 1.5 이후 버전
//		// 인터페이스		   =  클래스(다형성)
//		List<String> list4 = new ArrayList<>();
		
		list.add("홍길동");
		list.add("자바");
		list.add("Hello");
		
		// 향상된 for문
		for(String str : list) {
			System.out.println(str);
		}
	
		// Iterator (자바 디자인 패턴에 의해서 만들어짐,반복자 역할) -> 모든 컬렉션은 iterator가 적용이 된다.
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
