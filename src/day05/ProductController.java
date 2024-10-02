package day05;

import java.util.Scanner;

public class ProductController {
	// Product 배열 생성
	// 추가, 삭제, 수정, 리스트보기
	
	private Product[] menu = new Product[10];
	private int cnt; // index 역할

	public void printProduct() {
		if(cnt == 0) {
			System.out.println("[등록된 상품이 없습니다.]");
		}else {
			for(int i = 0; i < cnt; i++) {
				System.out.println(menu[i].toString(i+1));
			}				
		}
	}
	
	public void insertProduct(Scanner scan) {
		char word = 'y';
		String word1 = "";
		int word2 = 0;
		
		do {
			System.out.println("[상품을 등록하시겠습니까? (y/n)]");
			word = scan.next().charAt(0); // 1글자 입력
			if(word == 'y') {
				System.out.println("[상품을 등록해주세요. ex:사탕 500]");
				word1 = scan.next();
				word2 = scan.nextInt();
				if(cnt == menu.length) {
					// 5개 더 많은 길이의 배열을 생성
					Product[] tmp = new Product[menu.length+5];
					// 배열 복사 기존 배열의 0번지부터 새배열의 0번지부터 복사 cnt 개수만큼 복사
					System.arraycopy(menu, 0, tmp, 0, cnt);
					menu = tmp;
				}
				if(word1 != null && word2 != 0) {
					Product a = new Product();           // 추가 메서드
					a.Scanner(word1, word2);
					menu[cnt] = a;
					cnt++;
				}
			}else {
				if(word == 'n') {					
					System.out.println("[상품등록을 종료합니다.]");
				}else {
					System.out.println("[y/n만 가능합니다.]");
				}
			}
			
		}while(word != 'n');
	}
	
	public void deleteProduct(Scanner scan) {
		char word = 'y';
		int number = 0;
		
		do {
			System.out.println("[상품을 삭제하시겠습니까? (y/n)]");
			word = scan.next().charAt(0); // 1글자 입력
			if (cnt == 0) {
				System.out.println("등록된 상품이 없습니다.");
				word = 'n';
				System.out.println("[상품삭제를 종료합니다.]");
			}else if(word == 'y') {
				System.out.println("[상품 번호를 입력해주세요.]");
				number = scan.nextInt();
				if(number > 0 && number <= cnt) {
					 for (int i = number - 1; i < cnt - 1; i++) {
		                    menu[i] = menu[i + 1];
		                }
		                cnt--;
		                System.out.println("[상품이 삭제되었습니다.]");
		            } else {
		                System.out.println("[상품 입력값이 올바르지 않습니다.]");
		            }
			}else {
				if(word == 'n') {					
					System.out.println("[상품삭제를 종료합니다.]");
				}else {
					System.out.println("[y/n만 가능합니다.]");
				}
			}
			
		}while(word != 'n');
		
		// arraycopy를 이용한 방법 => 속도가 빠름(성능이 우수)
//		int copyCnt = menu.length - index - 1;
//		System.arraycopy(menu, index+1, menu, index, copyCnt);
		
		
		
	}

	public void modifyProduct(Scanner scan) {
		char word = 'y';
		String word1 = "";
		int word2 = 0;
		int number = 0;
		
		do {
			System.out.println("[상품을 수정하시겠습니까? (y/n)]");
			word = scan.next().charAt(0); // 1글자 입력
			if (cnt == 0) {
				System.out.println("등록된 상품이 없습니다.");
				word = 'n';
				System.out.println("[상품수정을 종료합니다.]");
			}else if(word == 'y') {
				System.out.println("[상품 번호를 입력해주세요.]");
				number = scan.nextInt();
				System.out.println("[상품을 수정해주세요. ex:사탕 500]");
				word1 = scan.next();
				word2 = scan.nextInt();
				if(word1 != null && word2 != 0 && number > 0 && number <= cnt) {
					Product a = new Product();           // 추가 메서드
					a.Scanner(word1, word2);
					menu[number-1] = a;
				} else {
					System.out.println("[상품 입력값이 올바르지 않습니다.]");
				}
			}else {
				if(word == 'n') {					
					System.out.println("[상품수정을 종료합니다.]");
				}else {
					System.out.println("[y/n만 가능합니다.]");
				}
			}
			
		}while(word != 'n');
		
	}
	
	public Product[] getMenu() {
		return menu;
	}
	public void setMenu(Product[] menu) {
		this.menu = menu;
	}
}
