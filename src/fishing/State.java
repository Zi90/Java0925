package fishing;

public class State {
//	state_id varchar(10),
//	state_name varchar(15) not null,
//	enter_fee int,
//	private String nickname;
//	private String fishrod;
//	private int money;
	private String state_name;
	private int enter_fee;
	
	public State() {}
	
	// 낚시터 장소 출력 -> state_id, state_name, enter_fee
	
//	public State(String nickname, String fishrod, int money) {
//		this.nickname = nickname;
//		this.fishrod = fishrod;
//		this.money = money;
//	}
	
	public State(String state_name, int enter_fee) {
		this.state_name = state_name;
		this.enter_fee = enter_fee;
	}

//	public String getNickname() {
//		return nickname;
//	}
//
//	public void setNickname(String nickname) {
//		this.nickname = nickname;
//	}
//
//	public String getFishrod() {
//		return fishrod;
//	}
//
//	public void setFishrod(String fishrod) {
//		this.fishrod = fishrod;
//	}
//
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		this.money = money;
//	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public int getEnter_fee() {
		return enter_fee;
	}

	public void setEnter_fee(int enter_fee) {
		this.enter_fee = enter_fee;
	}

//	public String printId() {
//		return nickname + "(" + money + ") / " +fishrod;
//	}
//	
//	public String printSpot() {
//		return state_name + "(" + enter_fee + ")";
//	}
	
}
