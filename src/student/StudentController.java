package student;

import java.util.Scanner;

public class StudentController implements Program {
	
	// 멤버변수 추가 : Student 배열을 멤버변수로 추가
	private Student[] studentList = new Student[5];
	private int stdCnt = 0;
	
	@Override
	public void insertStudent(Scanner scan) {
		// 학생 추가 : 1명의 정보를 받아 Student 객체로 생성 후 배열에 추가
		System.out.println("학번>");
		String stdNum = scan.next();
		System.out.println("이름>");
		String stdName = scan.next();
		System.out.println("전화번호>");
		String stdPhone = scan.next();
		
		Student s = new Student(stdNum, stdName, stdPhone);
		// 만약 배열이 다차서 저장할 공간이 없을 경우
		if(stdCnt == studentList.length) {
			Student[] tmp = new Student[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
			studentList = tmp;
		}
		studentList[stdCnt] = s;
		stdCnt++;
		
	}

	@Override
	public void printStudent() {
		// 학생 배열 출력
		System.out.println("--전체 학생정보--");
		for(int i = 0; i < stdCnt; i++) {
//			System.out.println(studentList[i]); // toString
			studentList[i].stdPrint(); // 메서드 호출
		}
	}

	@Override
	// 해당 학번의 index 리턴
	public int searchStudent(Scanner scan) {
		// 학생검색 - 학번을 기준
		// 학번을 입력받아 배열에서 탐색 후 학생정보 + 수강정보 출력
		// 없으면 없다고 출력
		System.out.println("학번>");
		String searchNum = scan.next();
		
		for(int i = 0; i < stdCnt; i++) {
			if(searchNum.equals(studentList[i].getStdNum())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return i;
			}
		}
		System.out.println("검색할 학번이 없습니다.");
		return -1;
	}

	@Override
	public void modifyStudent(Scanner scan) {
		// 학생정보 수정
		int index = searchStudent(scan);
		if(index != -1) {
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("전화번호>");
		String phone = scan.next();
		studentList[index].setStdName(name);
		studentList[index].setStdPhone(phone);
		}
		
	}

	@Override
	public void deleteStudent(Scanner scan) {
		// 학생정보 삭제
		int index = searchStudent(scan);
		if(index != -1) {
		int copyCnt =studentList.length - index - 1;
		System.arraycopy(studentList, index+1, studentList, index, copyCnt);
		// 마지막 번지 null 처리
		studentList[studentList.length-1] = null;
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 수강과목의 정보를 입력받아 subject 객체를 생성하여 Student 클래스의 개인 추가 메서드 호출
	    // 누가 어떤 과목을 수강할지를 받아야 함.
		// 수강신청 학번을 먼저 검색 후 추가
		int index = searchStudent(scan);
		System.out.println("------------");
		System.out.println("과목코드>");
		String subCode = scan.next();
		System.out.println("과목이름>");
		String subName = scan.next();
		
		// 객체 생성 후 메서드 호출
		Subject sub = new Subject(subCode, subName);
		studentList[index].insertSubject(sub);
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 삭제할 수강코드를 입력받아 Student 클래스의 강의 삭제 메서드를 호출
		int index = searchStudent(scan);
		// 수강 과목이 없다면 받지 않기
		if(studentList[index].getCnt() != 0) {		
		System.out.println("------------");
		System.out.println("과목코드>");
		String subCode = scan.next();
		studentList[index].removeSubject(subCode);
		System.out.println(subCode + "과목 수강철회를 하였습니다.");
		}
	}

	public Student[] getStudentList() {
		return studentList;
	}

	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}
	
	

}