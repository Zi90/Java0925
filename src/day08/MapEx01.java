package day08;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * -- 단어장 --
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * map 저장 후 출력
		 */

		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		int size = 0;
		String Eng = "";
		String Kor = "";
		
		do {
			size++;
			System.out.println("영단어 >");
			// 공백허용 scan.nextLine(); => enter 완료 + 값
			// enter 콘솔입력 시 완료
			// nextLine() : enter값으로 인지하는 케이스는
			// 다른 입력값 -> nextLine()이 오는 케이스
			Eng = scan.nextLine();
			System.out.println("뜻 >");
			Kor = scan.next();
			scan.nextLine(); // 완료의 enter 처리할 수 있는 값
			map.put(Eng, Kor);
			System.out.println(Eng + " : " + Kor);
		}while(size != 5);
		
		System.out.println("-- 단어장 --");
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		
		
		
	}

}
