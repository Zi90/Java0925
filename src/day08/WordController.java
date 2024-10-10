package day08;

import java.util.HashMap;
import java.util.Scanner;

public class WordController {

		private HashMap<String, String> map = new HashMap<>();
		
	public void insertWord(Scanner scan) {
		char isActive = 'y';
		String word = "";
		String mean = "";

		do {
			map.put("hello", "안녕");
			map.put("apple", "사과");
			map.put("cat", "고양이");

			if(isActive == 'y') {
				System.out.println("단어 >");
				scan.nextLine();
				word = scan.nextLine();
				System.out.println("의미 >");
				mean = scan.next();
				if(word != null && mean != null) {
					map.put(word, mean);
				}else {
					System.out.println("빈 값이 있습니다.");
				}
			}else {
				if(isActive == 'n') {
					System.out.println("단어 등록을 종료합니다.");
				}else {
					System.out.println("y 또는 n만 가능합니다.");
				}
			}
			System.out.println("단어를 등록하시겠습니까? (y/n) >");
			isActive = scan.next().charAt(0);
			
		}while(isActive != 'n');
		
	}
	
	public void searchWord(Scanner scan) {
		char isActive = 'y';
		String word = "";
		int cnt = 0;
		
		do {
			if(isActive == 'y') {
				System.out.println("단어 >");
				scan.nextLine();
				word = scan.nextLine();
				if(word != null) {
					for(String key : map.keySet()) {
						if(key.equals(word)) {
							System.out.println(key + " : " + map.get(key));
						}else {
							cnt++;
							if(cnt == map.size()){
								System.out.println("일치하는 단어가 없습니다.");
							}
						}
					}
				}else {
					System.out.println("빈 값이 있습니다.");
				}
			}else {
				if(isActive == 'n') {
					System.out.println("단어 검색을 종료합니다.");
				}else {
					System.out.println("y 또는 n만 가능합니다.");
				}
			}
			System.out.println("단어를 검색하시겠습니까? (y/n) >");
			isActive = scan.next().charAt(0);
			
		}while(isActive != 'n');
	}
	
	public void modifyWord(Scanner scan) {
		char isActive = 'y';
		String word = "";
		String mean = "";
		int cnt = 0;
		
		do {
			if(isActive == 'y') {
				System.out.println("단어 >");
				scan.nextLine();
				word = scan.nextLine();
				if(word != null) {
					for(String key : map.keySet()) {
						if(key.equals(word)) {
							System.out.println("의미 >");
							mean = scan.nextLine();
							map.put(key, mean);
							System.out.println(key + " 단어의 의미가 수정되었습니다!");
						}else {
							cnt++;
							if(cnt == map.size()){
								System.out.println("일치하는 단어가 없습니다.");
							}
						}
					}
				}else {
					System.out.println("빈 값이 있습니다.");
				}
			}else {
				if(isActive == 'n') {
					System.out.println("단어 수정을 종료합니다.");
				}else {
					System.out.println("y 또는 n만 가능합니다.");
				}
			}
			System.out.println("단어를 수정하시겠습니까? (y/n) >");
			isActive = scan.next().charAt(0);
			
		}while(isActive != 'n');
	}
	
	public void printWord(Scanner scan) {
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}
	
	public void deleteWord(Scanner scan) {
		char isActive = 'y';
		String word = "";
		String mean = "";
		int cnt = 0;
		
		do {
			if(isActive == 'y') {
				System.out.println("단어 >");
				scan.nextLine();
				word = scan.nextLine();
				if(word != null) {
					mean = map.remove(word);
					if(mean == null) {
						System.out.println("없는 단어입니다.");
					}else {
						System.out.println(word + " 단어가 삭제되었습니다!");						
					}
						
				}else {
					System.out.println("빈 값이 있습니다.");
				}
			}else {
				if(isActive == 'n') {
					System.out.println("단어 삭제를 종료합니다.");
				}else {
					System.out.println("y 또는 n만 가능합니다.");
				}
			}
			System.out.println("단어를 삭제하시겠습니까? (y/n) >");
			isActive = scan.next().charAt(0);
			
		}while(isActive != 'n');
	}
	
	
}
