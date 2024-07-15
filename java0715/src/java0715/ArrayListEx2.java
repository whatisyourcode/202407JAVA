package java0715;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Object> list2 = new ArrayList<Object>();

		
// 		list.add(123); // String 외 다른 타입이 들어가면 안되게 한다
		list2.add(123); // 어떠한 타입이 들어와도 된다.(Object) 

		
//		// 향상된 for문
//		for(String str : list) {
//			System.out.println(str);
//		}
	
		// Iterator (자바 디자인 패턴에 의해서 만들어짐,반복자 역할) -> 모든 컬렉션은 iterator가 적용이 된다.
		Iterator<Object> it = list2.iterator();
		while(it.hasNext()) {
			Object str = it.next();
			int num = (int)str + 100;
			System.out.println(num);
		}
	}
}
