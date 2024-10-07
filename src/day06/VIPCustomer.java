package day06;

public class VIPCustomer extends Customer{
	private double saleRatio; // 할인율 Gold, VIP만 존재
	private int agentID; // VIP만 존재
	
	public VIPCustomer() {}
	public VIPCustomer(int id, String name, int agentid) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 01.;
		agentID = agentid;
	}
	// 할인금액 리턴이 필요한 calcPrice 오버라이딩
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("담당 상담원 번호는 " + agentID + "입니다.");
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
		
}
