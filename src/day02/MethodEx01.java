package day02;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --menu--
		 * 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료
		 * > 메뉴 선택 1
		 * > 숫자 입력 1 5
		 * 결과 : 1 + 5 =6
		 * (더하기 메서드를 호출하여 연산결과를 출력)
		 * 4, 5번은 두 번째 숫자가 0이면 0으로 나눌 수 없습니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		MethodEx01 m = new MethodEx01();
		
		int operator = 0;
		int value1 = 0;
		int value2 = 0;
		
		System.out.println("--menu--");
		System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료");
		
		do {
			System.out.println("> 메뉴 선택");
			operator = scan.nextInt();
			
			if(operator == 6) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println("> 숫자 입력(ex:2 5)");
			value1 = scan.nextInt();
			value2 = scan.nextInt();

			switch(operator) {
			case 1:
				System.out.println("결과 : " + value1 + " ➕ " + value2 + " = " + m.sum(value1, value2));
				break;
			case 2:
				System.out.println("결과 : " + value1 + " ➖ " + value2 + " = " + m.sub(value1, value2));
				break;
			case 3:
				System.out.println("결과 : " + value1 + " ✖ " + value2 + " = " + m.mul(value1, value2));
				break;
			case 4: ;
				System.out.println(value2 == 0 ? "0을 나눌 수 없습니다." : "결과 : " + value1 + " ➗ " + value2 + " = " + m.div(value1, value2));
				break;
			case 5:
				System.out.println(value2 == 0 ? "0을 나눌 수 없습니다." : "결과 : " + value1 + " % " + value2 + " = " + m.mod(value1, value2));
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
			
		} while(true);
		
		scan.close();
		
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
		return num1 / num2;			
	}
	
	public int mod(int num1, int num2) {
		return num1 % num2;			
	}
	
}
