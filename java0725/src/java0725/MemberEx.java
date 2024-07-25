package java0725;

public class MemberEx {

	public static void main(String[] args) {
		String str1 = new String("blue");
		String str2 = new String("blue");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// str1 == str2 : 객체 비교
		if(str1.equals(str2)) { // 문자열 비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		Member member1 = new Member("blue");
		Member member2 = new Member("blue");
		
		if(member1.equals(member2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

	}

}
