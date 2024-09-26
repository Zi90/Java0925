package day01;

import java.util.Scanner;
// Scanner + ctrl + spacebar

public class Test03 {

	public static void main(String[] args) {
		/* Scanner 클래스 : 콘솔에서 값을 입력받을 때 사용
		 * (int)(Math.random()*개수)+시작값 : 시작값부터 개수만큼 정수형 랜덤값 생성
		 * */
		// 값을 입력받으려면 Scanner scan = new Scanner(System.in);
		
		// 주사위 값 랜덤 발생
//		int random = (int)(Math.random()*6)+1;
//		System.out.println(random);
		
		// 랜덤으로 주사위를 굴려 총 30칸을 이동하시오.
		// 주사위를 던지는 횟수를 출력.
		/* 주사위 게임
		 * 주사위는 Enter를 치면 던져짐.
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남음.
		 * 주사위 : 5
		 * 5칸 전진 => 22칸 남음
		 * ...
		 * 도착!! 총 던진 횟수 > ??
		 * */
		
		// for(횟수가 일정한 경우) / while(횟수가 일정하지 않는 경우)
//		for(int i = 0; i <= 10; i ++) {
//			// 처리 0부터 10까지 1씩 반복
//		}
//		
//		while(식) {
//			처리;
//			
//		}
		
		// Enter 인지 => Scanner 사용
		
		int finish = 30;
		int cnt = 0;
	
		Scanner scan = new Scanner(System.in);
		while(finish > 0) {
			cnt ++;
			System.out.println("주사위 굴리기(Enter)");
			scan.nextLine(); // next() : Enter 처리불가
			int random = (int)(Math.random()*6)+1;
			finish -= random;
			System.out.println("주사위 : " + random);
			if(finish > 0) {
				System.out.println(random +"칸 전진 => " + finish + "칸 남음.");				
			}else {
				System.out.println("도착!! 총 던진 횟수 > " + cnt);				
			}
		}
		
		// ctrl + shift + F : 들여쓰기 자동 정렬
	}
}
