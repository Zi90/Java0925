package day03;

public class Class03 {

	public static void main(String[] args) {

		// Tv 클래스 생성
		/* 멤버변수 : brand, power, ch, vol
		 * 메서드 :
		 * power()
		 * chUp() / chDown() : 1씩 증가 20까지 있음. 20이 넘어가면 다시 0번으로 돌아오는 순환구조
		 * volUP() / volDown() : 1씩 증가 / 1씩 감소 10까지 있음 10이 넘어가면 10, 0이면 음소거 출력
		 */
		
		// final : 변경할 수 없는 값을 지정. 대문자로 쓰는 것을 원칙으로 함.
		
		Tv T = new Tv();
		
//		T.setBrand("LG");
		T.chUp();
		T.power();
		T.chUp();
		T.chDown();
		T.chDown();
		T.chDown();
		T.chUp();
		T.chUp();
		T.volDown();
		T.volDown();
		T.power();
		

	}
}

	class Tv {
		private final String BRAND = "LG";
		private boolean power;
		private int ch;
		private int vol;
		
		public Tv() {
			this.vol = 1;
		}
		
//		public void brand(String brand) {
//			this.brand = brand;
//		}
//		
//		public void print() {
//			System.out.println(brand);
//		}
		
		public void power() {
			if (this.power) {
				this.power = false;
				System.out.println("TV가 꺼졌습니다.");				
			}else{
				this.power = true;
				System.out.println("TV가 켜졌습니다.");
			}
		}
		
		public void chUp() {
			if (power) {
				ch++;
				if (ch > 20) {
					ch = 0;
				}
				System.out.println("현재 채널은 " + ch + "입니다.");
			}else {
				System.out.println("TV가 꺼져있습니다.");								
			}
		}
		
		public void chDown() {
			if (power) {
				ch--;
				if (ch < 0) {
					ch = 20;
				}				
				System.out.println("현재 채널은 " + ch + "입니다.");
			}else {
				System.out.println("TV가 꺼져있습니다.");								
			}
		}
		
		public void volUp() {
			if (power) {
				vol++;
				if (vol > 10) {
					vol = 10;
					System.out.println("음량의 최대치입니다.");
				}else {
					System.out.println("현재 음량은 " + vol + "입니다.");					
				}
			}
		}
		
		public void volDown() {
			if (power) {
				vol--;
				if (vol < 0) {
					vol = 0;
					System.out.println("음소거입니다.");
				}else {
					System.out.println("현재 음량은 " + vol + "입니다.");					
				}
			}
		}

//		public String getBrand() {
//			return brand;
//		}
//
//		public void setBrand(String brand) {
//			this.brand = brand;
//		}

		public boolean isPower() {
			return power;
		}

		public void setPower(boolean power) {
			this.power = power;
		}

		public int getCh() {
			return ch;
		}

		public void setCh(int ch) {
			this.ch = ch;
		}

		public int getVol() {
			return vol;
		}

		public void setVol(int vol) {
			this.vol = vol;
		}
		
	}
