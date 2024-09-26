package day02;

public class Class02 {

	public static void main(String[] args) {
		Car C = new Car();
		C.setName("소나타");
		C.setColor("블랙");
		C.setColor("2024");
		C.print();
		
		System.out.println( C.speedUp());
		C.power();
		System.out.println( C.speedUp());
		System.out.println( C.speedDown());
		System.out.println( C.speedDown());
	}

}

// Car 클래스 생성
// 멤버변수 : name, color, year, power, speed => private 선언 (getter / setter 생성)
// 소나타(블랙/2024) => 출력 메서드
// power : 시동 상태 나타내는 메서드(true / false)
// speed : 속도 up / down 메서드

class Car{
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	
	public void print() {
		System.out.println(name + "(" + color + "/" + year + ")");
	}
	
	public void power() {
		if(this.power == false) {
			this.power = true;
			System.out.println("시동이 켜졌습니다.");
		}else if(this.power == true) {
			this.power = false;
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	
	public int speedUp() {
		if(power == true) {
			speed += 10;
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
		return speed;
	}
	
	public int speedDown() {
		if(speed == 0) {
			System.out.println("더 내려갈 수 없습니다.");
		}else if(power == true){
			speed -= 10;
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
		return speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}