package day06;

public class GoldCustomer extends Customer{
	private double saleRatio; //할인율 Gold, VIP만 존재
	
	public GoldCustomer() {}
	// => 제품을 구매할 때 10% 할인 / 보너스 포인트 2% 적립
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	// 할인금액 리턴이 필요한 calcPrice 오버라이딩
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}
