package day05;

interface Power{
	void turnOn();
	void chDown();
	void chUp();
	void turnOff();
}

interface Remocon{
	void volUp();
	void volDown();
}

// 상속 + 구현
// class Tv enxtends A implements B, C {}

class Tv implements Power, Remocon{
	
	private boolean power;
	private int vol;
	private int ch;
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	@Override
	public void turnOn() {
		// 전원켜기
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	
	@Override
	public void turnOff() {
		// 전원켜기
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}

	@Override
	public void volUp() {
		vol++;
		System.out.println("vol : " + vol);
		
	}

	@Override
	public void volDown() {
		vol--;
		System.out.println("vol : " + vol);
		
	}
	
	@Override
	public void chUp() {
		ch++;
		System.out.println("ch : " + ch);
	}
	
	@Override
	public void chDown() {
		ch--;
		System.out.println("ch : " + ch);
	}
	
}

public class Interface01 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOn();
		t.volUp();
		t.volDown();
		t.chUp();
		t.chDown();
		t.turnOff();
		
		
		
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것.
		 * 추상 메서드 : 메서드의 선언부만 있고, 구현부가 없는 메서드
		 * 
		 * 인터페이스 키워드 : interface
		 * - 추상클래스 : 대부분 상속을 하기위해 사용
		 * - 인터페이스 : 메뉴얼 화 / 상속을 하기위해 사용
		 * - 기능요약서라고 함.
		 * - 상속키워드 : extends / 구현키웓, : implements
		 * - 인터페이스는 멤버변수를 포함하지 않기 때문에, 이 부분을 염두에 두고
		 * 	 메서드 정리를 해야함.
		 * 
		 * - 상속 : 다중상속 불가능
		 * - 구현 : 다중구현 가능
		 * - 상속 + 구현 동시에 가능
		 */

	}

}
