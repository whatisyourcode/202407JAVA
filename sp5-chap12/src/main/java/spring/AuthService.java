package spring;

public class AuthService {
	
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public AuthInfo authenticate(String email, String password) {
		Member member = memberDao.selectByEmail(email);
		// 해당 객체가 없으면 예외 처리 
		if(member == null) {
			throw new WrongIdPasswordException();
		}
		// 해당 객체의 비밀번호가 맞지 않을 경우('비밀번호가 맞지 않다'라는 출력은 금지)
		if(!member.matchPassword(password)) {
			throw new WrongIdPasswordException();
		}
		
		return new AuthInfo(member.getId(),
				member.getEmail(),
				member.getName());
	}
}
