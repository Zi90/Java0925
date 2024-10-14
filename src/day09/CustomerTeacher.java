package day09;

public class CustomerTeacher implements Comparable<CustomerTeacher> {

	//멤버변수 : 각 인원마다 가져야 할 고유 값
	private String name;
	private int age;
	private int price;
	
	//생성자
	public CustomerTeacher(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = (age>=15)? 100 : 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name+"("+age+")"+" 비용:"+price+"만원";
	}

	@Override
	public int compareTo(CustomerTeacher o) {
		// this 와 o 객체를 정렬
		return this.name.compareTo(o.name);
	}
}
