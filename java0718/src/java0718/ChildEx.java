package java0718;

public class ChildEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		anyMethod(parent);

//		Child child = (Child) parent;
//		child.method3();
		
		
		if(parent instanceof Child) {	// classCastException 방지
			System.out.println("타입 변환 가능");
			Child child = (Child) parent;
		}else {
			System.out.println("타입 변환 불가능");
		}

		
//		Other other = (Other)parent; // 참조 타입의 형변환은 상속관계에서만 가능하다!
//		Child child = (Child)parent;

	}

	public static void anyMethod(Parent parent) {
		parent.method2();
	}
	
}
