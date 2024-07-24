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
 * Servlet implementation class JdbcUpdate
 */
@WebServlet("/update")
public class JdbcUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");

		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<h1>서블릿 페이지</h1>");
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null; 
		PreparedStatement pstmt = null;
		String sql ="update dept set dname = ?, loc = ? where deptno = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("Mysql 접속 성공!");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setString(3, deptno);
			int ret = pstmt.executeUpdate();
			out.println(ret + "건 update 성공!") ;
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
