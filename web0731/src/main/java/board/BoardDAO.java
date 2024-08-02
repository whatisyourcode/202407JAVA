package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class BoardDAO {
	// JDBC 관련 변수 
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String BOARD_LIST = "Select * from board"; 
	private String BOARD_ONE = "Select * from board where num = ?";
	private String BOARD_INSERT = "insert into board(title, writer, content, regtime, hits) values(?,?,?,now(),0)";
	private String BOARD_UPDATE = "update board set writer = ?,title = ?, content= ?, regtime = now() where num = ?"; 
	private String BOARD_DELETE = "delete from board where num = ?";
	private String BOARD_INCREASE = "update board set hits = hits + 1 where num = ?";
	
	// 게시판 등록
	public void insertBoard(BoardDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, dto.getWriter());
			stmt.setString(2, dto.getTitle());
			stmt.setString(3, dto.getContent());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		
	}
	// view.jsp을 위한 게시판 1건 조회
	public BoardDTO getOne(int num) {
		BoardDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_ONE);
			stmt.setInt(1, num);
			rs = stmt.executeQuery();
			if(rs.next()) {
			dto = new BoardDTO(rs.getInt("num"),rs.getString("writer"),
					rs.getString("title"),rs.getString("content"),
					rs.getString("regtime"), rs.getInt("hits"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn); // 자원 반납
		}
		return dto;
	}
	
	
	// 게시판 목록 조회
	// DB에 있는 데이터를 sqlQuery로 불러와서 DTO 객체로 생성하여 ArrayList에 저장.
	public List<BoardDTO> getBoardList(){
		List<BoardDTO> list = new ArrayList<>();
		
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO(rs.getInt("num"),rs.getString("writer"),
						rs.getString("title"),rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"));
						list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn); // 자원 반납
		}
		
		return list;
	}
	// 게시판 데이터 수정
	public void updateBoard(BoardDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1,dto.getTitle());
			stmt.setString(2,dto.getWriter());
			stmt.setString(3,dto.getContent());
			stmt.setInt(4,dto.getNum());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		
	}
	
	// 게시판 데이터 삭제 
	public void deleteBoard(int num) {
		conn = JDBCUtil.getConnection();
	//	BoardDTO dto = null;
		try {
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, num);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public void increaseHits(int num) {
			conn = JDBCUtil.getConnection();
			try {
				stmt = conn.prepareStatement(BOARD_INCREASE);
				stmt.setInt(1,num);
				stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				JDBCUtil.close(stmt, conn);
			}
	
		
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 637b703adb40baefb55c98f682758336f4112676
