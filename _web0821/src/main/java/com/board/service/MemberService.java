package com.board.service;

import com.board.db.MemberDao;
import com.board.db.MemberDto;

public class MemberService {
	public void registerMember(String email,String pw,String name,String tel,String gender) throws Exception {

	    if (	email == null || email.length()  == 0 ||
	            pw   == null || pw.length()   == 0 ||
	            name  == null || name.length() == 0 || 
	            tel  == null || tel.length() == 0 ||
	            gender == null || gender.length() == 0) {

	           throw new Exception("모든 항목이 빈칸 없이 입력되어야 합니다.");
	    	}
	    	MemberDto dto = new MemberDto();
	    	dto.setEmail(email);
	    	dto.setPw(pw);
	    	dto.setName(name);
	    	dto.setTel(tel);
	    	dto.setGender(gender);
	    
	    	new MemberDao().insertOne(dto);
	    
   }
	
   public MemberDto loginMember(String email,String pw) {
	   return new MemberDao().selectOne(email, pw);
   }
}
