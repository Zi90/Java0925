package jdbcStudent;

import java.util.List;

public class StudentServiceImpl implements Service {
	private DAO dao;
	public StudentServiceImpl() {
		dao = new StudentDAOImpl();
	}

	@Override
	public int insert(Student s) {
		// TODO Auto-generated method stub
		System.out.println("학생 등록 serviceImpl success");
		return dao.insert(s);
	}

	@Override
	public List<Student> getList() {
		System.out.println("학생 리스트 serviceImpl success");
		return dao.selectList();
	}

	@Override
	public Student getStudent(int sno) {
		System.out.println("학생 정보 serviceImpl success");
		return dao.selectStudent(sno);
	}

	@Override
	public int update(Student s) {
		System.out.println("학생 수정 serviceImpl success");
		return dao.update(s);
	}

	@Override
	public int delete(int sno) {
		System.out.println("학생 삭제 serviceImpl success");		
		return dao.delete(sno);
	}

}
