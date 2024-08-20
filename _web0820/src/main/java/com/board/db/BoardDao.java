package com.board.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class BoardDao {

	// SqlSessionFactory를 SqlMapConfig를 통하여 생성한다.
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public BoardDao() {
		// SqlSessionFactory에서 session을 할당받는다.
		// 이 때 openSession에 true를 주어야 자동 커밋이 된다.
		// default는 false이다.
		session = sqlsession_f.openSession(true);
	}
	
	public int getNumRecords() {
		return session.selectOne("BoardMapper.getNumRecords");
	}
	
	public List<BoardDto> selectList(int start, int listsize) {
		// session을 통해 쿼리를 실행하고 값을 받아온다.
		HashMap<String,Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("listsize", listsize);
		return session.selectList("BoardMapper.selectList",map);
	}

	public void insertOne(BoardDto dto) {
		session.insert("BoardMapper.insertBoard", dto);
	}
	


	public BoardDto selectOne(int num, boolean hitsIncreased) {
		if(hitsIncreased) {
			updateHits(num);
		}
		
		return session.selectOne("BoardMapper.selectOne", num);
	}

	public int countBoard2() {
		BoardMapper bm = session.getMapper(BoardMapper.class);
		return bm.countBoard();
	}
	
	
	private void updateHits(int num) {
		session.update("BoardMapper.updateHits", num);
	}
	
	public void updateOne(BoardDto dto) {
		session.update("BoardMapper.updateOne", dto);
	}

	public boolean deleteOne(int num) {
		try {
			session.delete("BoardMapper.deleteOne", num);
		} catch(Exception e) {
			System.out.println("여기!!!");
			//e.printStackTrace();
			return true;
		}
		return false;
		
	}
	
	public void decreaseStock(int id) {
		session.update("ProductMapper.decreaseStock", id);
	}
	
	public int countProducts(int id) {
		return session.selectOne("ProductMapper.countProducts", id);
	}
}
