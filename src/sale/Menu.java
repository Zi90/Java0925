package sale;

public class Menu {
	private int  menuId;
	private String menuName;
	private int price;
	
	public Menu() {}
	
	public Menu(int id, String menuName, int price) {
		menuId = id;
		this.menuName = menuName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", price=" + price + "]";
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
	
}
