package sec06.exam03.package2;

import sec06.exam03.package1.A;
import sec06.exam03.package1.B;

public class C {
	A a;
	B b;
	
	void method() {
		a.x = 100;	// a의 x 필드가 public 이어야만 접근 가능
	}
}
