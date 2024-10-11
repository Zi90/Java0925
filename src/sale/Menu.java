package sale;

import java.util.Objects;

public class Menu {
	private int  menuId; // 기본키 역할
	private String menuName;
	private int price;
	
	public Menu() {}
	
	// equals용 생성자
	public Menu(int id) {
		this.menuId = id;
	}
	
	public Menu(int id, String menuName, int price) {
		menuId = id;
		this.menuName = menuName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return  menuId + "." + menuName + " : " + price + "원";
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(menuId, menuName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return menuId == other.menuId; // id만 일치해도 true
	}
	
}
