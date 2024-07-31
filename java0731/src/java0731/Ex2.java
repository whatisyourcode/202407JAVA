package java0731;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class Ex2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties(); // HashMap 하위 클래스
		String path = Ex2.class.getResource("database.properties").getPath(); // p506
		path = URLDecoder.decode(path,"utf-8"); 
		System.out.println(path);
		properties.load(new FileReader(path));
		String driver = properties.getProperty("driver"); // 키 값인 driver로 값 가져오기
		System.out.println("driver : " + driver );
		String username = properties.getProperty("username"); // 키 값인 username로 값 가져오기
		System.out.println(username);
		String date = properties.getProperty("date"); // 키 값인 date로 값 가져오기
		System.out.println(date);
	}

}
