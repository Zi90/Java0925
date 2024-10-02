package day04;

import java.util.Scanner;

/* Product 클래스 생성 : 상품을 등록하는 클래스
 * 상품명(name), 가격(price)을 멤버변수로 생성
 * 상품을 추가 메서드
 * 상품출력 메서드 (toString 이용)
 * ex) 사탕 : 500
 * 과자 : 2000
 * 젤리 : 1000
 */

class Product {
	private String name = new String();
	private int price;
	
	public Product() {}
	
	@Override
	public String toString() {
		System.out.println("--상품정보--");
		return "[" + name + " : " + price + "]";
	}
	
	public void Scanner(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class 과제 {
	
	public static void main(String[] args) {
		/* 상품 10개를 등록할 수 있는 배열 생성
		 * 스캐너를 통해 상품을 등록
		 * 등록한 상품을 출력 
		 * 상품을 등록하시겠습니까? (y/n) y => 등록 n => 그만
		 */
		Product[] p = new Product[10];
		Scanner scan = new Scanner(System.in);
//		Product a = new Product(); // 1개의 객체를 변경해서 계속 배열에 추가 (연결링크만 복사됨)
		
		int cnt = 0;
		char word = 'y';
		String word1 = "";
		int word2 = 0;
		
		do {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			word = scan.next().charAt(0); // 1글자 입력
			if(word == 'y') {
				System.out.println("상품을 등록해주세요. ex:사탕 500");
				word1 = scan.next();
				word2 = scan.nextInt();
				if(cnt == 10) {
					System.out.println("상품을 다 등록했습니다.");
				}else if(word1 != null && word2 != 0) {
					Product a = new Product();           // 추가 메서드
					a.Scanner(word1, word2);
					p[cnt] = a;
					cnt++;
				}
			}else {
				if(word == 'n') {					
					System.out.println("종료합니다.");
				}else {
					System.out.println("y/n만 가능합니다.");
				}
			}
			
		}while(word != 'n'); // !(c. equals("n")) => String일 경우
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(p[i].toString());
		}
		
        scan.close();

	}

}
