package fishing;

import java.util.Scanner;

public class StateController {
	private Scanner scan;
	private StateService svc;
	private boolean flag;
	private String Spot;
	
	public StateController(User u) {
		scan = new Scanner(System.in);
		svc = new StateServiceImpl();
		flag = true;
		choiceSpot(u);
	}


	private void choiceSpot(User u) {
		System.out.println("--Fishing spot choice--");
		System.out.println("1.물웅덩이(입장 조건: normal 이상 | 입장료: 무료)|2.해변가(입장 조건: Standard 이상 | 입장료: 1000원)|3.바다(입장 조건: Premium 이상 | 입장료: 5000원)|4.깊은 바다(입장 조건: Elite| 입장료: 10000원)");
		System.out.println("번호 입력 >");
		
		while(flag) {
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				Spot = "A";
				svc.calc(Spot, u.getNum());
				System.out.println("입장료 무료");
				flag = false;
				break;
			case 2:
				if(u.getMoney() < 1000) {
					System.out.println("입장료를 지불할 돈이 없습니다... 돈 버세욧!");
				}else {					
					if(u.getFishrod().equals("Standard") || u.getFishrod().equals("Premium") || u.getFishrod().equals("Elite")) {					
						Spot = "B";
						svc.calc(Spot, u.getNum());
						System.out.println("입장료 1000원을 지불합니다");
						flag = false;
					}else {
						System.out.println("낚시대 등급이 맞지 않습니다.");
					}
				}
				break;
			case 3:
				if(u.getMoney() < 5000) {
					System.out.println("입장료를 지불할 돈이 없습니다... 돈 버세욧!");
				}else {					
					if(u.getFishrod().equals("Premium") || u.getFishrod().equals("Elite")) {	
						Spot = "C";
						svc.calc(Spot, u.getNum());
						System.out.println("입장료 5000원을 지불합니다");
						flag = false;
					}else {
						System.out.println("낚시대 등급이 맞지 않습니다.");
					}
				}
				break;
			case 4:
				if(u.getMoney() < 10000) {
					System.out.println("입장료를 지불할 돈이 없습니다... 돈 버세욧!");
				}else {					
					if(u.getFishrod().equals("Elite")) {	
						Spot = "D";
						svc.calc(Spot, u.getNum());
						System.out.println("입장료 10000원을 지불합니다");
						flag = false;
				}else {
					System.out.println("낚시대 등급이 맞지 않습니다.");
				}
				}
				break;
			default : System.out.println("입력하신 번호는 없는 번호입니다");
			}
		}
	}

//	public String CheckRod(User u) {
//		switch(u.getFishrod()) {
//		 case "normal":
//			 calc(Spot, u.getNum());
//			 break;
//		 case "Standard":
//			 calc(Spot, u.getNum());
//			 break;
//		 case "Premium":
//			 calc(Spot, u.getNum());
//			 break;
//		 case "Elite":
//			 calc(Spot, u.getNum());
//			 break;
//		 default:
//			System.out.println("낚시대 error");
//		}
//		
//		return null;
//	}
	
	
	
	
}
