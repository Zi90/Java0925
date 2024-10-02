package day05;

class Product {
	private String name = new String();
	private int price;
	
	public Product() {}
	
	public String toString(int id) {
		return "(" + id + ")" + "[" + name + " : " + price + "원]";
	}
	
	public void Scanner(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
