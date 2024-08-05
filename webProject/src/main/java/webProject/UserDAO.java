package webProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class UserDAO {
	// JDBC 관련 변수 
		private Connection conn = null;
		private PreparedStatement stmt = null;
		private ResultSet rs = null;
		
		private String USER_SELECT = "select * from user where name = ?";
		private String USER_UPDATE = "update user set password =? , tel = ? ,address = ?, gender = ? where id = ?";
		private String USER_INSERT = "Insert into user(name,password,tel,gender,address) values(?,?,?,?,?)";
		private String USER_CHECK = "Select * from user where name = ?";
		private String USER_LOGIN = "Select * from user where name = ? AND password = ?";
		
		public void userSignUp(UserDTO dto) {
			conn = JDBCUtil.getConnection();
			try {
				stmt = conn.prepareStatement(USER_INSERT);
				stmt.setString(1, dto.getName());
				stmt.setString(2, dto.getPassword());
				stmt.setString(3, dto.getTel());	
				stmt.setString(4, dto.getGender());
				stmt.setString(5, dto.getAddress());
				stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCUtil.close(stmt ,conn);
			}
		}
		
		public void userSet(UserDTO dto) {
			conn = JDBCUtil.getConnection();
			try {
				stmt = conn.prepareStatement(USER_UPDATE);
				stmt.setString(1, dto.getPassword());
				stmt.setString(2, dto.getTel());
				stmt.setString(3, dto.getAddress());
				stmt.setString(4, dto.getGender());
				stmt.setInt(5, dto.getId());
				stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				JDBCUtil.close(stmt, conn);
			}
		}
		
		public UserDTO userGetOne(String name) {
			conn = JDBCUtil.getConnection();
			UserDTO dto = null;
			try {
				stmt = conn.prepareStatement(USER_CHECK);
				stmt.setString(1, name);
				rs = stmt.executeQuery();
				rs.next();
				dto = new UserDTO(rs.getInt("id"),rs.getString("name"),rs.getString("password"),rs.getString("tel"),
						rs.getString("gender"),rs.getString("address"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCUtil.close(rs, stmt, conn);
			}
			return dto;
		}
		
		public boolean userCheck(String name) {
			conn = JDBCUtil.getConnection();
			boolean check = false;
			try {
				stmt = conn.prepareStatement(USER_CHECK);
				stmt.setString(1, name);
				rs = stmt.executeQuery();
				rs.next();
				check = rs.getBoolean(1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			return check;
		}
		
		public UserDTO userLogin(String name,String password) {
			conn = JDBCUtil.getConnection();
			UserDTO dto = null;
			
			try {
				stmt = conn.prepareStatement(USER_LOGIN);
				stmt.setString(1,name);
				stmt.setString(2,password);
				rs = stmt.executeQuery();
				rs.next();
				dto = new UserDTO(rs.getInt("id"),rs.getString("name"),rs.getString("password"),rs.getString("tel"),
						rs.getString("gender"),rs.getString("address"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCUtil.close(rs, stmt, conn);
			}
			return dto;
		}
		

}
