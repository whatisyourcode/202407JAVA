package project1;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member md = null;
		Member[] list = {
				new Member("박창현","941128","010-3392-5181"),
				new Member("김성식","941005","010-4050-3210"),
				new Member("홍성훈","941201","010-4422-5050")
		};
		for (Member member : list) {
			System.out.println(member);
		}
		int find = -1; // 찾기 전 또는 못 찾았을 때
		
		for(int i=0; i<list.length; i++) {
			if(list[i].name.equals("김성식") && list[i].ssn.equals("941005")) {
				find = i;
				md = list[i];
				break;
			}
		}
		System.out.println("인덱스 : "+find);
		System.out.println(md);
	}

}
