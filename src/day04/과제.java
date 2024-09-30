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
	private String price = new String();
	private int cnt;
	
	public Product() {}
	
	private String [] ProductList = new String[10];
	
	@Override
	public String toString() {
		System.out.println("--상품정보--");
		return "[" + name + " : " + price + "]";
	}
	
//	public void printList() {
//		if(ProductList.length == 0 || cnt == 0) {
//			System.out.println("상품이 없습니다.");
//			return;
//		}
//		for(int i=0;i<cnt;i++) {
//			System.out.print(ProductList[i]);
//		}
//		System.out.println();
//	}
	
	public void Scanner(String name, String price) {
		if(cnt >= 10) {
			System.out.println("더이상 수강하실 수 없습니다.");
			return;
		}
		this.name = name;
		this.price = price;
		
		cnt++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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
		
		boolean check = true;
		int cnt = 0;
		String word = "";
		String word1 = "";
		String word2 = "";
		
		do {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			word = scan.next();
			if(word.equals("y")) {
				System.out.println("상품을 등록해주세요. ex:사탕 500");
				word1 = scan.next();
				word2 = scan.next();
				if(cnt == 10) {
					System.out.println("상품을 다 등록했습니다.");
				}else if(word1 != null && word2 != null) {
					Product a = new Product();
					a.Scanner(word1, word2);
					p[cnt] = a;
					cnt++;
				}
			}else {
				System.out.println("종료합니다.");
				check = false;
			}
			
		}while(check);
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(p[i].toString());
		}
		
        scan.close();

	}

}
