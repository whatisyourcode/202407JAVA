package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");

		byte[] array = {10, 20, 30, 40, 50};
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//		
//		os.write(a);
//		os.write(b);
//		os.write(c);
		
//		os.write(array);
		os.write(array,1,3); // 1번 인덱스부터 3개를 출력
		os.flush();
		os.close();
	}

}
