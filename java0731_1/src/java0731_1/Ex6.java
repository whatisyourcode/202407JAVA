package java0731_1;

import java.sql.Date;

public class Ex6 {

	public static void method(Object obj) {
		switch(obj) {
		case Integer i -> System.out.println(i);
		case String s -> System.out.println("\"" + s + "\"");
		case null, default -> System.out.println("unknown");
		}
	}
	
	public static void main(String[] args) {
		method(100);
		method("100");
		method(null);
		method(4.55);

	}

}
