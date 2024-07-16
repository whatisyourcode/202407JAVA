package java0716;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("페르시안","검은색",9); // 고양이 [품종=페르시안, 색깔=검은색, 나이=0]
	
//		System.out.println(cat.age); // age 필드가 private이기 때문에 접근 불가.		
		System.out.println(cat); // toString() 으로 필드 확인 가능.
		
		cat.setAge(9);
		System.out.println(cat);
	}

}
