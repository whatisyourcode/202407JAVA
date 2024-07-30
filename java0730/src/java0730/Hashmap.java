package java0730;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("신용권", 95);
		map.put("신용권", 90);
		map.put("홍길동", 90);
		System.out.println(map.size()); // 2
		System.out.println(map.get("신용권")); // 90 
		System.out.println(map.get("홍길동")); // 90 
		
		// keySet() -> key를 가지고 있는 꾸러미
		Set<String> kk = map.keySet();
		// iterator 대신 향상된 for문 사용.
		for(String str : kk) {
			System.out.println(str);
			System.out.println(map.get(str));
		}
		// entrySet() -> key,value 둘 다 가지고 있는 꾸러미
		Set<Map.Entry<String, Integer>> ee = map.entrySet();
		for(Map.Entry<String, Integer> kv : ee) {
			String k = kv.getKey();
			Integer v = kv.getValue();
			String msg = MessageFormat.format("키는 {0}이고,값은 {1}이다.", k,v);
			System.out.println(msg);
		}
	}

}
