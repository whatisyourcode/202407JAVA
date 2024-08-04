package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class LoginDAO {
	// JDBC 관련 변수 
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String USER_UPDATE1 = "Select * from member where id =?";
	private String USER_UPDATE2 = "Update member set pw = ?, name = ? where id = ?";
	private String USER_SELECT = "Select * from member where id = ? AND pw = ? ";
	private String USER_INSERT = "Insert into member(id,pw,name) values(?,?,?)";
	private String USER_CHECK = "Select * from member where id = ?";

	
	public LoginDTO getID(String id) {
		LoginDTO dto = null;
		conn = JDBCUtil.getConnection();

		try {
			stmt = conn.prepareStatement(USER_UPDATE1);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			rs.next();
			dto = new LoginDTO(rs.getString("id"),rs.getString("pw"),rs.getString("name"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
			return dto;
	}
	
	public void updateID(String id,String pw,String name) {
		conn = JDBCUtil.getConnection();
		
		try {		
			stmt = conn.prepareStatement(USER_UPDATE2);
			stmt.setString(1, pw);
			stmt.setString(2, name);
			stmt.setString(3,id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		
	}
	
	public LoginDTO getID(String id,String pw) {
		LoginDTO dto = null;
		conn = JDBCUtil.getConnection();

		try {
			stmt = conn.prepareStatement(USER_SELECT);
			stmt.setString(1, id);
			stmt.setString(2, pw);
			rs = stmt.executeQuery();
			rs.next();
			dto = new LoginDTO(rs.getString("id"),rs.getString("pw"),rs.getString("name"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
			return dto;
	}
	

	
	public boolean idCheck(String id) {
		conn = JDBCUtil.getConnection();
		boolean check = false;
		try {
			stmt = conn.prepareStatement(USER_SELECT);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			rs.next();
			check = rs.getBoolean(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return check;
	}
	
	
	public LoginDTO signUp(String id,String pw,String name) {
		conn = JDBCUtil.getConnection();
		LoginDTO dto = new LoginDTO(id,pw,name);
		try {
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, dto.getId());
			stmt.setString(2, dto.getName());
			stmt.setString(3, dto.getPw());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		return dto;
	}
	

	
}
