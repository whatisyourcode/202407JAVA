package du.db;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {
	@Select("select count(*) from members where email = #{email} and password = #{password}")
	public int isMember(MemberDto memberDto);
	
	@Select("select * from members where email = #{email} and password = #{password}")
	public MemberDto findMember(MemberDto memberDto);
	
	@Insert("insert into members(member_id,name,email,password) "
			+ "values(members_seq.nextval,#{name},#{email},#{password})")
	public void insertMember(MemberDto memberDto);

	@Select("SELECT * FROM (SELECT E.*, ROWNUM AS RN"
			+ "	FROM (SELECT * FROM members"
			+ "	ORDER BY member_id DESC) E ) WHERE RN BETWEEN #{start} AND #{listsize} ")
	public List<MemberDto> selectList(@Param("start") int start, @Param("listsize") int listsize);
	
	@Select("select * from members where member_id = #{member_id}")
	public MemberDto selectOne(@Param("member_id") int member_id);
	
	@Delete("delete from members where member_id = #{member_id}")
	public void deleteMember(@Param("member_id") int member_id);
}