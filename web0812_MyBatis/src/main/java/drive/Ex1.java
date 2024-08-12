package drive;

import shop.Product;
import shop.ProductDAO;

public class Ex1 {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		Product product = new Product(37,"삼겹살","두툼한 삼겹살",15000,8); // 업데이트 할 내용
		dao.updateProduct(product);
		System.out.println("수정완료");

	}

}
