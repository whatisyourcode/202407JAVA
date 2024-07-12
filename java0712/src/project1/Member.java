package project1;

public class Member {

	String name;
	String ssn; // 주민번호 6자리 패스워드 
	String tel;
	
	public Member() {}
	
	public Member(String name,String ssn,String tel) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", ssn=" + ssn + ", tel=" + tel + "]";
	}
}
