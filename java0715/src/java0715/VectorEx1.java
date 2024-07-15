package java0715;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
		list.add("홍길동");
		list.add("자바");
		list.add("Hello");
		
	
		// Iterator (자바 디자인 패턴에 의해서 만들어짐,반복자 역할) -> 모든 컬렉션은 iterator가 적용이 된다.
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		
	}
}