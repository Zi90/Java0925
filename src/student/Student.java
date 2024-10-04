package student;

public class Student {
	/* 한 학생이 가져야하는 정보
	 * 학번, 이름, 나이, 전화번호, 주소, 수강과목
	 * 멤버변수 / 생성자 / getter / setter / toString(학생정보출력)
	 * 수강신청 / 수강철회 / 수강과목 출력
	 */
	
	private String stdNum;
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private String stdAddress;
	private Subject[] subjectList = new Subject[5];
	private int cnt; // 배열의 index 역할
	
	// 생성자
	public Student() {}
	
	public Student(String stdNum, String stdName, String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}

	public Student(String stdNum, String stdName, int stdAge, String stdPhone, String stdAddress) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
		this.stdAddress = stdAddress;
	}

	// method
	// 학생정보 출력 메서드(toString 이용가능)
	public void stdPrint() {
		System.out.println("학생명:" + stdName + "(" + stdNum + ") / " + stdPhone);
	}
	
	// 수강과목을 출력 메서드 => 배열로 존재 (for)
	public void subPrint() {
		if(cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for(int i = 0; i < cnt; i ++) {
			System.out.println(subjectList[i]); // toString 호출
		}
	}
	
	// 수강신청 메서드 : subjectList subject 객체를 생성하여 추가
	// 수강과목 객체를 매개변수로 받아서 추가
	public void insertSubject(Subject sub) {
		// 배열이 다 찼다면.. 배열 늘려주기
		if(cnt == subjectList.length) {
			Subject[] tmp = new Subject[subjectList.length + 5];
			// 배열복사
			System.arraycopy(subjectList, 0, tmp, 0, cnt);
			subjectList = tmp;
		}
		
		subjectList[cnt] = sub;
		cnt++;
	}
	
	// 수강삭제 메서드
	// 수강코드 값을 매개변수로 받아서 삭제
	public void removeSubject(String subCode) {
		// 삭제할 콛의 위치값을 저장하는 변수
		int index = -1;
		if(subCode == null){
			return;
		}
		// 삭제할 코드의 위치 값 찾기
		for(int i = 0; i < cnt; i++) {
			if(subjectList[i].getSubCode().equals(subCode)) {
				index = i;
				break;
			}
			
		}
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		// 삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업
		for(int i = index; i < cnt - 1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		// 끝번지는 null처리
		subjectList[cnt - 1] = null;
		cnt--;
	}
	
	
	
	// getter / setter
	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}
	
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdPhone=" + stdPhone + "]";
	}
	
	
	
	
}
