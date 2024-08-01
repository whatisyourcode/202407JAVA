package sec01.exam07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEx {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:/Temp/Board1.csv");
		String line = "";
		
		BufferedReader br = new BufferedReader(reader); // 보조 스트림
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
		
//		Reader reader = new FileReader("C:/Temp/test7.txt");		
//		while(true) {
//			int data = reader.read();
//			if(data == -1) break;
//			System.out.println((char)data);
//		}
//		reader.close();
	}

}
