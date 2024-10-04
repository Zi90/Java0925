package student;

public class Subject {
	/* 과목 정보 : 과목코드, 과목명, 학점, 시수, 교수명, 시간표, 강의장
	 * 멤버변수 / 생성자 / getter / setter / toString(과목정보출력)
	 */
	
	private String subCode;
	private String subName;
	private int subPoint;
	private int subTime;
	private String subProfessor;
	private String subScheduler;
	private String subRoom;
	
	// 생성자
	public Subject() {};
	
	// 과목코드 / 과목명만 받는 생성자
	public Subject(String subCode, String subName) {
		this.subCode = subCode;
		this.subName = subName;
	}

	public Subject(String subCode, String subName, int subPoint, int subTime, String subProfessor, String subScheduler,
			String subRoom) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subPoint = subPoint;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subScheduler = subScheduler;
		this.subRoom = subRoom;
	}

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubPoint() {
		return subPoint;
	}

	public void setSubPoint(int subPoint) {
		this.subPoint = subPoint;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}

	public String getSubRoom() {
		return subRoom;
	}

	public void setSubRoom(String subRoom) {
		this.subRoom = subRoom;
	}
	
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subPoint=" + subPoint + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subScheduler=" + subScheduler + ", subRoom=" + subRoom
				+ "]";
	}
	
}
