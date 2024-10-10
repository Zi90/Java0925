package day08;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아(Scanner) map에 저장 후 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복 (1 = 계속, 0 = 종료)
		 * 과목 / 점수 입력 > 국어 78
		 * 1 = 계속, 0 = 종료 > 1
		 * 영어 98
		 * ... 반복
		 */
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		double cnt = 0;
		int isActive = 1;
		String subject = "";
		int score = 0;
		int sum = 0;
		double avg = 0;
		
		do {
			System.out.println("1 = 계속, 0 = 종료 >");
			isActive = scan.nextInt();
			if(isActive == 1) {
				System.out.println("과목 / 점수 입력 >");
				subject = scan.next();
				score = scan.nextInt();
				map.put(subject, score);
				System.out.println(subject + " " + score);
				sum += score;
				cnt++;
			}else if(isActive != 0){
				System.out.println("잘못 입력되었습니다.");
			}
		}while(isActive != 0);
		avg = sum / cnt;
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		
		
		
		
	}

}
