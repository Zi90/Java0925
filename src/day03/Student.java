package day03;

/* 학생 클래스 생성
 * 멤버변수 : 지점, 이름, 과정, 전화번호
 * 생성자 :
 * - 지점과 이름만 받는 생성자
 * - 지점, 이름, 과정, 전화번호를 받는 생성자 (생성자 호출로 호출)
 * 메서드 : 해당 내용을 출력하는 메서드 print()
 * - getter / setter
 */

public class Student {
	private String gigum = "incheon";
	private String name;
	private String process;
	private String phone;
	
	public Student() {}
	
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
