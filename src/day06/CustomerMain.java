package day06;

/* Silver 고객 / Gold 고객(할인) / VIP 고객(할인)
 * - Silver 고객
 * 	=> 제품을 구매할 때 0% 할인 / 보너스 포인트 1% 적립
 * - Gold 고객
 * 	=> 제품을 구매할 때 10% 할인 / 보너스 포인트 2% 적립
 * - VIP 고객
 * 	=> 제품을 구매할 때 10% 할인 / 보너스 포인트 5% 적립
 * 	=> 전담 상담사
 * 
 * Customer / GoldCustomer / VIPCustomer 클래스 생성
 * GoldCustomer / VIPCustomer => Customer 클래스 상속
 */

public class CustomerMain {
	
	public static void main(String[] args) {
	// 업캐스팅 : 부모의 객체 배열에 자식 객체의 값을 넣을 수 있는 것은 업캐스팅이 가능하기 때문이다
	// 업캐스팅은 자동 형변환

	Customer[] customerList = new Customer[10];
	
	Customer cLee = new Customer(1001, "이정혁");
	Customer cHong = new Customer(1002, "홍길동");
	Customer cKim = new GoldCustomer(1003, "김철수");
	Customer cChoi = new GoldCustomer(1004, "최유진");
	int cnt = 0;
	
	customerList[cnt] = cLee;
	cnt++;
	customerList[cnt] = cHong;
	cnt++;
	customerList[cnt] = cKim;
	cnt++;
	customerList[cnt] = cChoi;
	cnt++;
	customerList[cnt] = new VIPCustomer(1005, "박영희", 1111);
	cnt++;
	customerList[cnt] = new VIPCustomer(1006, "김영수", 2222);
	cnt++;
	customerList[cnt] = new VIPCustomer(1007, "순이", 1111);
	cnt++;
	customerList[cnt] = new VIPCustomer(1008, "김영철", 2222);
	cnt++;
	
	System.out.println("-- 할인율과 포인트 계산 --");
	int price = 100000;
	// 모든 손님 대상
	// 홍길동님의 지불금액은 100000 / 포인트는 1000입니다.
	for(int i = 0; i < cnt; i++) {
		// 보너스 포인트 적립 => 금액 리턴
		int salePrice = customerList[i].calcPrice(price);
		System.out.println(customerList[i].getCustomerName() + "님의 지불금액은 " + salePrice + " / 포인트 " + customerList[i].getBonusPoint());
		System.out.println("--------------------");
	}
	
	// 다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
	// 자식 고유의 멤버변수나 메서드를 호출하고자 할 경우 사용
	// 다운캐스팅시 반드시 명시적으로 형변환 해야함.
	// agentID = 1111 => 3333 변경
	System.out.println("-------------");
	for(int i = 0; i < cnt; i++) {
		Customer c = customerList[i];
		if(c instanceof VIPCustomer) {
			VIPCustomer vip = (VIPCustomer)c;
			if(vip.getAgentID() == 1111) {
				vip.setAgentID(3333);			
				customerList[i].customerInfo();
			}
		}
	}
	
	// 고객 정보 출력
	for(int i = 0; i < cnt; i++) {
		customerList[i].customerInfo();
	}
	
	
	
	}
}
