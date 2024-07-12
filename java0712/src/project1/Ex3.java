package project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex3 {

	public static void main(String[] args) {
		Member[] list = {
				new Member("박창현","941128","010-3392-5181"),
				new Member("김성식","941005","010-4050-3210"),
				new Member("홍성훈","941201","010-4422-5050")
		}; // 외부 장치나 오류가 날 수 있는 파일 코드를 try구문안에 넣어서 사용
		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat"); 			
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
				// ObjectOutputStream 직렬화 필요! -> 객체를 파일에 일렬로 넣으려면 직렬화가 필요하다. 
				// Membeer 클래스 Serializable 인터페이스 상속 받아야 함.
			
			oos.writeObject(list); // error.직렬화 필요!
			System.out.println("객체를 파일에 저장했습니다.");
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
