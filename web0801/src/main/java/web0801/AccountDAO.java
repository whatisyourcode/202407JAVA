package web0801;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;


public class AccountDAO {
	// JDBC 관련 변수 
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String ACCOUNT_ONE = "Select * from account where name = ?";
	private String ACCOUNT_INSERT = "insert into account(name,ssn,tel,balance) values(?,?,?,?)";
	
	// 로그인
	public AccountDTO getOne(String name){
		AccountDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACCOUNT_ONE);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			if(rs.next()) {
				dto = new AccountDTO(rs.getInt("id"),rs.getString("name"),
						rs.getString("ssn"),rs.getString("tel"),rs.getInt("balance"));
			} 
			System.out.println(dto.getName());
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
			return dto;
		}
	// 회원가입
	public void insertAccount(AccountDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACCOUNT_INSERT);
			stmt.setString(1, dto.getName());
			stmt.setString(2, dto.getSsn());
			stmt.setString(3, dto.getTel());
			stmt.setInt(4, dto.getBalance());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}

	}
	
	}

