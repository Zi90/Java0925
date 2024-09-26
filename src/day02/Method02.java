package day02;

public class Method02 {

	public static void main(String[] args) {
		// 사칙연산 (+ - * / %) 각각의 메서드 생성
		// div, mod => 나누는 값이 0이면 Exception 발생
		// method에서 return은 메서드의 종료
		Method02 m = new Method02();
		System.out.println(m.sum(30,20));
		System.out.println(m.sub(30,20));
		System.out.println(m.mul(30,20));
		double result1 = m.div(30,20);
		if (result1 != -1) {
			System.out.println(m.div(30,20));
		}
		int result2 = m.mod(30,20);
		if (result2 != -1) {
			System.out.println(m.mod(30,20));		}
		
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public double div(double num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return -1;
		}
		return num1 / num2;			
	}
	
	public int mod(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return -1;
		}
		return num1 % num2;			
	}
	
}
