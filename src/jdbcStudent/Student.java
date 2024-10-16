package jdbcStudent;

public class Student {
//	sno int auto_increment,
//	sid int not null,
//	sname varchar(50) not null,
//	birth varchar(20),
//	phone varchar(20),
//	address text,
//	regdate datetime default now()
	
	private int sno;
	private int sid;
	private String sname;
	private String birth;
	private String phone;
	private String address;
	private String regdate;
	
	public Student() {}
	
	// 학생 등록
	public Student(int sid, String sname, String birth, String phone, String address) {
		this.sid = sid;
		this.sname = sname;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
	}
	
	// 학생 리스트
	public Student(int sno, int sid, String sname) {
		this.sno = sno;
		this.sid = sid;
		this.sname = sname;
	}
	
	// 학생 상세 보기
	public Student(int sno, int sid, String sname, String birth, String phone, String address, String regdate) {
		this.sno = sno;
		this.sid = sid;
		this.sname = sname;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
		this.regdate = regdate;
	}
	
	// 학생 수정
	public Student(int sno, int sid, String sname, String birth, String phone, String address) {
		this.sno = sno;
		this.sid = sid;
		this.sname = sname;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public String print() {
		return sno + ". [" + sid + "] " + sname; 
	}
	
	@Override
	public String toString() {
		return sno + ". [" + sid + "] " + sname + " | " + birth + " | " + phone + " | " + address + " | " + regdate;
	}
	
}
