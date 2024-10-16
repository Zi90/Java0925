package jdbcStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.DatabaseConnection;

public class StudentDAOImpl implements DAO {
	public Connection conn;
	private PreparedStatement pst;
	private String query = "";
	
	public StudentDAOImpl() {
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}
	
	@Override
	public int insert(Student s) {
		System.out.println("insert DAOImpl success");
		query = "insert into student(sid, sname, birth, phone, address) values(?, ?, ?, ?, ?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, s.getSid());
			pst.setString(2, s.getSname());
			pst.setString(3, s.getBirth());
			pst.setString(4, s.getPhone());
			pst.setString(5, s.getAddress());
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Student> selectList() {
		System.out.println("학생 리스트 DAOImpl success");
		query = "select * from student order by sno desc";
		List<Student> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt("sno"), rs.getInt("sid"), rs.getString("sname")));
			}
			return list;
		} catch (SQLException e) {
			System.out.println("list error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student selectStudent(int sno) {
		System.out.println("student DAOImpl success");
		query = "select * from student where sno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, sno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				Student s = new Student(rs.getInt("sno"), rs.getInt("sid"), rs.getString("sname"), rs.getString("birth"), rs.getString("phone"), rs.getString("address"), rs.getString("regdate"));
				return s;
			}
		} catch (SQLException e) {
			System.out.println("student error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Student s) {
		System.out.println("update DAOImpl success");
		query = "update student set sid = ?, sname = ?, birth = ?, phone = ?, address = ?, regdate = now() where sno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, s.getSid());
			pst.setString(2, s.getSname());
			pst.setString(3, s.getBirth());
			pst.setString(4, s.getPhone());
			pst.setString(5, s.getAddress());
			pst.setInt(6, s.getSno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int sno) {
		System.out.println("delete DAOImpl success");
		query = "delete from student where sno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, sno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("delete error");
			e.printStackTrace();
		}
		return 0;
	}

}
