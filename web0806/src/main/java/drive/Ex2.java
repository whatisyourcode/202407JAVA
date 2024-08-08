package drive;

import dept.DeptDAO;
import dept.DeptDTO;

public class Ex2 {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		DeptDTO dto = new DeptDTO(50,"DEVELOP","SEOUL");
		dao.insertDept(dto);
		System.out.println("입력 성공!");
	}

}
