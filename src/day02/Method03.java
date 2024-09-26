package day02;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		// 정수 하나를 주면
		// 해당 정수의 구구단을 출력하는 메서드 (리턴 없음.)
		
		Method03 m = new Method03();
		
		for(int i = 2; i <= 9; i ++) {
			m.mul(i);
			System.out.println();
		}
	
		

	}
	
	public void mul(int num) {
		int result = 0;
		
		for(int i = 1; i <= 9; i++) {
			result = num * i;
			System.out.print(num + " ✖ " + i + " = " + result + " ");
		}
	}

}
