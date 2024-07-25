package du;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public First() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		request.setCharacterEncoding("UTF-8"); // 요청에 관한 텍스트 인코딩을 UTF-8로 설정
		String name = request.getParameter("nn");
		String ssn = request.getParameter("snn");
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from account where name = ? and ssn = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("Mysql 접속 성공!");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, ssn);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id1 = rs.getInt("id");
				String name1 = rs.getString("name");
				String ssn1 = rs.getString("tel"); 
				String tel1 = rs.getString("balance");
				int balance1 = rs.getInt("balance");
				String str = String.format("%d, %s, %s, %s, %d\n",id1, name1, ssn1, tel1, balance1);
				System.out.println(str);
				Account.id = id1;
				Account.name = name1;
				Account.ssn = ssn1;
				Account.tel = tel1;
				Account.balance = balance1;
				flag = true;
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		

 		response.setContentType("text/html;charset=utf-8"); // 응답에 관한 텍스트 인코딩을 UTF-8로 설정
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		if(flag) {
			out.println("<h1>" + Account.name +"님 환영합니다 </h1>");
		}else {
			out.println("<h1> 다시 로그인 해주세요 </h1>");
		}
		out.println("</html>");
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
