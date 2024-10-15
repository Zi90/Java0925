package jdbc;

import java.util.List;

public class ProductServiceImpl implements Service {
	/* service <-> DAO */
	// 생성자로 DAO 객체와 연결
	private DAO dao; // interface
	public ProductServiceImpl() {
		dao = new ProductDAOImpl(); // DAO 구현체
	}
	
	@Override
	public int insert(Product p) {
		// 실제 구현 영역
		System.out.println("상품등록 serviceImpl Success");
		// DAO에게 DB 저장을 요청
		// dao 요청시 메서드명은 sql구문과 비슷하게 작성하는 것이 일반적
		return dao.insert(p);
	}

	@Override
	public List<Product> getList() {
		// TODO Auto-generated method stub
		System.out.println("list serviceImpl Success");
		return dao.selectList();
	}

}
