package day01;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		String[] fileName = {"spring.java", "python.py", "react.jsx", "css.css", "String.java",
				"component.jsx", "text.txt"};
		
		// ex : 검색어를 입력 받아 fileName 배열에 검색어가 존재하면 해당 파일 이름을 출력
		/* 검색어 : java
		 * spring.java
		 * String.java
		 * 
		 * 검색어 : s
		 * spring.java
		 * css.css
		 * String.java
		 * 
		 * 검색어 : 가나다
		 * 검색결과가 없습니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("검색어를 입력해주세요.");
		 String word = scan.next();
		 
		 int cnt = 0;
		 for(String file : fileName) {
			 if(file.toLowerCase().contains(word.toLowerCase())) {
				 System.out.println(file);
				 cnt++;
			 }
		 }
		 if(cnt == 0) {
			 System.out.println("검색결과가 없습니다.");
		 }
	}
}
