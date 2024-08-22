package du.service;

import java.util.ArrayList;
import java.util.List;

import du.db.BoardDao;
import du.db.BoardDto;
import du.db.MemberDao;
import du.db.MemberDto;
import du.db.Pagination;

public class MemberService {
	
    private static final int listSize = 3;
    private static final int paginationSize = 3;
	
	public List<MemberDto> getMemList(int pageNo) {
	       return new MemberDao().selectList((pageNo - 1) * listSize + 1, listSize);
	    }
	
	public ArrayList<Pagination> getPagination(int pageNo) {

	        ArrayList<Pagination> pgnList = new ArrayList<Pagination>();
	        
	        int numRecords = new BoardDao().getNumRecords();
	        int numPages = (int)Math.ceil((double)numRecords / listSize);

	        int firstLink = ((pageNo - 1) / paginationSize)
	                        * paginationSize + 1;
	        int lastLink = firstLink + paginationSize - 1;
	        if (lastLink > numPages) {
	            lastLink = numPages;
	        }

	        if (firstLink > 1) {
	            pgnList.add(
	                   new Pagination("이전", pageNo - paginationSize, false));
	        }

	        for (int i = firstLink; i <= lastLink; i++) {
	            pgnList.add(new Pagination("" + i, i, i == pageNo));
	        }

	        if (lastLink < numPages) {
	            int tmpPageNo = pageNo + paginationSize;
	            if (tmpPageNo > numPages) {
	                tmpPageNo = numPages;
	            }
	            pgnList.add(new Pagination("다음", tmpPageNo, false));
	        }
	        	
	        return pgnList;
	    }
	    
	public MemberDto getMsg(int member_id) {
        MemberDto dto = new MemberDao().selectOne(member_id);

        dto.setName(dto.getName().replace (" ",  "&nbsp;"));
        dto.setEmail(dto.getEmail().replace(" ",  "&nbsp;"));
        dto.setCreated_at(dto.getCreated_at().replace(" ",  "&nbsp;")
                                       .replace("\n", "<br>"));

        return dto;
    }
	
	
	public void registerMember(MemberDto dto) {
		new MemberDao().insertMember(dto);
	}
	
	public void deleteMember(int member_id) {
		new MemberDao().deleteMember(member_id);
	}
}
