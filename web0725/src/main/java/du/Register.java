package du;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8"); // 요청에 관한 텍스트 인코딩을 UTF-8로 설정
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String tel = request.getParameter("tel");
	
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null; 
		PreparedStatement pstmt = null;
		String sql ="insert into account(name, ssn, tel, balance) values( ?, ?, ?, ? )";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("Mysql 접속 성공!");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, ssn);
			pstmt.setString(3, tel);
			pstmt.setInt(4, 0);
			int ret = pstmt.executeUpdate();
			System.out.println(ret + "건 Insert 성공!") ;
			
			Account.name = name;
			Account.ssn = ssn;
			Account.tel = tel;
			Account.balance = 0;
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		
		response.setContentType("text/html;charset=utf-8"); // 응답에 관한 텍스트 인코딩을 UTF-8로 설정
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<h1>" + Account.name +"님 회원가입을 환영합니다 </h1>");
		out.println("</html>");
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
