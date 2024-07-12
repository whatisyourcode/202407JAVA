package project1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex4 {

	public static void main(String[] args) {
		Member[] list = null;
		// 파일같은 외부 장치에서 객체 데이터들을 읽어 오는 역할 -> FileInputStream
		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (Member[]) ois.readObject();
			System.out.println("파일에서 객체를 가져왔습니다.");
			
	// InputOutput 예외 상황에 예외 처리, readObject()로 파일에 있는 데이터를 불러왔을 때 불러온 데이터 타입이 다를 경우 예외처리.
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Member member : list) {
			System.out.println(member);
		}
		
		
	}

}
