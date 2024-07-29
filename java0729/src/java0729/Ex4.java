package java0729;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex4 {	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // 사용자 정의로 포맷 형식 지정
		String strNow = sdf.format(date);
		System.out.println(strNow);
		
		// LocalDateTime은 객체를 생성하지 않고 Static 메서드 처럼 사용할 수 있다.
//		LocalDateTime now1 = LocalDateTime.now();
//		System.out.println(now1);
//		String strNow2 = sdf.format(now1);
//		System.out.println(strNow2); // error. LocalDateTime 클래스는 SimpleDateFormat 으로 포맷 형식 지정을 못한다.
		
		LocalDateTime now2 = LocalDateTime.now();
		String strNow1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일").format(now2);
		System.out.println(strNow1);
	
	}

}
