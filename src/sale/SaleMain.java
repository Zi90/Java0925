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
		 * Menu Class 생성 => 메뉴 1개에 대한 정보
		 * 제품ID
		 * 제품명
		 * 가격
		 * 
		 * 1. 관리자 제품에 대한 정보를 입력
		 * 2. 주문자가 제품을 주문 (제품ID, 수량)
		 * 3. 주문ID에 해당하는 Menu를 찾아서 이름과 가격을 가져오기
		 * 4. Order 클래스에 제품ID, 제품명, 수량, 가격, 수량*가격 저장
		 * 
		 * Order Class 생성 menu 상속 => 한 주문에 대한 정보
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
		// 미리 몇 가지 메뉴 추가 메서드 호출
		sc.addMenu();
		
		int menu = 0;
		
		do {
			System.out.println("1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)|7.전체판매내역");
			System.out.println("4.메뉴보기(전체메뉴보기)|5.주문|6.주문내역출력(영수증)");
			System.out.println("8.종료");
			System.out.println("menu >");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				sc.add(scan);
				break;
			case 2:
				sc.delete(scan);
				break;
			case 3:
				sc.update(scan);
				break;
			case 4:
				sc.printMenu();
				break;
			case 5:
				sc.orderPick(scan);
				break;
			case 6:
				sc.orderPrint(scan);
				break;
			case 7:
				sc.totalOrderPrint();
				break;
			case 8:
				System.out.println("키오스크를 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 8);
		
		scan.close();
		
	}

}
