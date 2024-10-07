package day06;

import java.util.Scanner;

/* customerID : 고객ID
 * customerName : 고객이름
 * customerGrade : 고객등급
 * bonusPoint
 * bonusRatio : 0.01 => 1%
 * 
 * 기본 customerGrade = Silver
 * 
 * 메서드
 * 1. 보너스 적립 계산 메서드
 * 	=> 구매 금액을 주고 적립 보너스를 계산하여 bonusPoint 누적
 * 	=> 보너스 적립, 할인여부를 체크하여 구매금액을 리턴
 * 
 * 2. 출력
 * 	=> 홍길동님은 VIP등급이며, 보너스 포인트는 5000점입니다.
 * 	   전담 상담사 번호는 1111입니다. <- VIP만 추가 (agentID) 
 */
public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	// 생성자
	public Customer() {}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	// 메서드
	// 가격 매개변수로 받아 => 포인트 적립, 할인가격 리턴
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price; // Silver등급은 할인이 없음.
	}
	
	// 출력메서드
	/* 홍길동님은 VIP등급이며, 보너스 포인트는 5000점입니다.
	 * 전담 상담사 번호는 1111입니다. <- VIP만 추가 (agentID) 
	 */
	public void customerInfo() {
		System.out.println(customerName + "님은 " + customerGrade + "등급이며, 보너스 포인트는 " + bonusPoint + "점 입니다.");
	}
	
	// getter & setter
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
}
