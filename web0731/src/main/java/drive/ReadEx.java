package drive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import board.BoardDAO;
import board.BoardDTO;

public class ReadEx {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:/Temp/Board1.csv");
		String line = "";
		BoardDTO dto = null;
		BoardDAO dao = new BoardDAO();
		BufferedReader br = new BufferedReader(reader); // 보조 스트림
		while ((line = br.readLine()) != null) {
			String[] data = line.split(", ");
			dto = new BoardDTO(0,data[0],data[1],data[2],null,0);
			dao.insertBoard(dto);
			System.out.println("데이터 입력 완료");
		}
		br.close();

		
//		Reader reader = new FileReader("C:/Temp/test7.txt");		
//		while(true) {
//			int data = reader.read();
//			if(data == -1) break;
//			System.out.println((char)data);
//		}
//		reader.close();
	}

}
