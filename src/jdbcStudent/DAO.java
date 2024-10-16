package jdbcStudent;

import java.util.List;

public interface DAO {

	int insert(Student s);

	List<Student> selectList();

	Student selectStudent(int sno);

	int update(Student s);

	int delete(int sno);

}
