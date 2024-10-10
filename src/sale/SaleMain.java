package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		// 키오스크
		/* menu
		 * 1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)
		 * 4.메뉴보기(전체메뉴보기)|5.주문|6.주문내역출력(영수증)
		 * 7.전체판매내역|8.종료
		 * 
		 * menu Class 생성
		 * 제품ID
		 * 제품명
		 * 가격
		 * 
		 * Order Class 생성 menu 상속
		 * 주문번호
		 * 제품ID
		 * 제품명
		 * 수량
		 * 가격
		 * 금액
		 * 
		 * SaleController
		 * Menu List => List<Menu> menu = new ArrayList<>();
		 * OrderList => List<Order> order = new ArrayList<>();
		 */
		
		SaleController sc = new SaleController();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)");
			System.out.println("4.메뉴보기(전체메뉴보기)|5.주문|6.주문내역출력(영수증)");
			System.out.println("7.전체판매내역|8.종료");
			System.out.println("menu >");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				sc.insertSale(scan);
				break;
			case 2:
				sc.deleteSale(scan);
				break;
			case 3:
				sc.modifySale(scan);
				break;
			case 4:
				sc.printSale();
				break;
			case 5:
				sc.selectOrder(scan);
				break;
			case 6:
				sc.printOrder(scan);
				break;
			case 7:
				sc.printAllSale(scan);
			case 8:
				System.out.println("키오스크를 종료합니다.");
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 8);
		
		scan.close();
		
	}

}
