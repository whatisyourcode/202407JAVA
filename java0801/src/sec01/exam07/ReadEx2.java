package sec01.exam07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadEx2 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:/Temp/Board1.csv");
		String line = "";
		BoardDTO dto = null;
		List<BoardDTO> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(reader); // 보조 스트림
		while ((line = br.readLine()) != null) {
			String[] data = line.split(", ");
			dto = new BoardDTO(0,data[0],data[1],data[2],null,0);
			list.add(dto);
//			// 분리된 데이터 출력 
//			for(String element : data) {
//				dto(element);
//			}
//			System.out.println();
		}
		br.close();
		
		System.out.println(list);
		
//		Reader reader = new FileReader("C:/Temp/test7.txt");		
//		while(true) {
//			int data = reader.read();
//			if(data == -1) break;
//			System.out.println((char)data);
//		}
//		reader.close();
	}

}
