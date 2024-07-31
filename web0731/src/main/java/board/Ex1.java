package board;

import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.getBoardList();
		for(BoardDTO dto : list) {
			System.out.println(dto);
		}
	}

}
