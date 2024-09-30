package day03;

/* 학생 클래스 생성
 * 멤버변수 : 지점, 이름, 과정, 전화번호
 * 생성자 :
 * - 지점과 이름만 받는 생성자
 * - 지점, 이름, 과정, 전화번호를 받는 생성자 (생성자 호출로 호출)
 * 메서드 : 해당 내용을 출력하는 메서드 print()
 * - getter / setter
 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
 * 1. 기본값 : 기본적으로 지정되는 값 int = 0 / String = null
 * 2. 명시적 초기값 : 사용자가 멤버변수를 선언함과 동시에 값을 지정
 * 3. 초기화 블럭 : { } 멤버변수들의 초기화
 * 4. 생성자 : 객체 생성 시 초기화를 해서 생성
 * 
 * 초기값의 우선순위 (순위가 높은 값을 덮어쓰여짐)
 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자
 */

public class Student {
	private String gigum = "incheon"; // 기본값
	private String name; // 기본값 기본적으로 주는 null / 0의 값
	private String process;
	private String phone;
	
	{
		// 초기화 블럭 영억
		name = "student";
		process = "JAVA";
		phone = "010-0000-0000";
	}
	
	
	public Student() {} // 기본생성자
	
	public Student(String gigum, String name, String process, String phone) {
		this.gigum = gigum;
		this.name = name;
		this.process = process;
		this.phone = phone;
	}
	
	public void saveInfo(String gigum, String name, String process, String phone) {
		this.gigum = gigum;
		this.name = name;
		this.process = process;
		this.phone = phone;
	}
	
	public void printInfo() {
		 System.out.println("학생 정보");
		 System.out.println(gigum + " | " + name + " | " + process + " | " + phone + " | ");
	}

	// @Override : 이노테이션(애너테이션) => 작은 기능이 있는 정의어
	// override(오버라이드) : 부모의 메서들를 자식이 가져와서 재정의 하는 기능
	// 생성자, getter / setter, toString => 자동생성해줌.
	@Override
	public String toString() {
		return "Student [gigum=" + gigum + ", name=" + name + ", process=" + process + ", phone=" + phone + "]";
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
