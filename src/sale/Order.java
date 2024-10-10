package sale;

public class Order extends Menu{
	
	private int orderNum;
	private int cnt;
	private int totalPrice;
	
	public Order() {}
	public Order(int id, String name, int price, int cnt) {
		super(id, name, price);
		this.cnt = cnt;
		this.totalPrice = cnt * price;
	}
	
	// 출력메서드
	@Override
	public String toString() {
		return "Order [orderNum=" + orderNum + ", cnt=" + cnt + ", totalPrice=" + totalPrice + "]";
	}
	
	// getter & setter
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
