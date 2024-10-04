package lotto;

import java.util.Scanner;

public class LottoController{
	// 당첨번호는 여러 개 배열로 저장
	private LottoExtend lotto[] = new LottoExtend[5];
	private int lCount = 0;
	// 사용자 번호는 1개
	private Lotto user = new Lotto();
	
	private int st = 0; // 회차 값
	
	public void createLotto(Scanner scan) {
		// 수동 로또번호 입력
		System.out.println("로또번호입력(중복X, 1 ~ 45, 숫자 6개) >");
		int tmp[] = new int[6];
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = scan.nextInt();
		}
		if(isDuplicated(tmp)) {
			System.out.println("오류발생. 다시 입력하세요");
		}else {
			user.insertNumbers(tmp);
			user.st = this.st+1;
			System.out.println(user);
		}
	}

	// 수동으로 입력되는 로또번호의 중복체크, 범위체크
	public boolean isDuplicated(int arr[]) {
		// 중복확인
		for(int i = 0; i < arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		
		// 범위확인
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0 || arr[i] > 45) {
				return true;
			}
		}
		return false;
		
	}
	
	public void createLottoAuto() {
		// 자동 로또번호 입력
		user.randomLotto();
		user.st = this.st+1;
		System.out.println(user);
	}

	public void insertLotto(Scanner scan) {
		// 당첨번호 수동생성
		System.out.println("당첨번호입력(중복X, 1 ~ 45, 숫자 7개) >");
		int tmp[] = new int[6];
		
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = scan.nextInt();
		}
		
		int bonus = scan.nextInt();
		
		if(isDuplicated(tmp)) {
			System.out.println("오류발생. 다시 입력하세요");
		}else {
			LottoExtend tmpLotto = new LottoExtend();
			tmpLotto.insertNumbers(tmp, bonus);
			this.st++;
			tmpLotto.st = st;
			lotto[lCount] = tmpLotto;
			lCount++;
			System.out.println(tmpLotto);
		}
	}	
	
	public boolean checkBonus(int arr[], int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public void checkLotto() {
		// 당첨확인
		int cnt = 0;
		LottoExtend tmpLotto = new LottoExtend();
		
		for(int i = 0; i < user.numbers.length; i++) {
			for(int userNum : user.numbers) {
				if(userNum == lotto[lCount-1].numbers[i]) {
					cnt++;
				}
			}
		}
		
		System.out.println(lotto[lCount-1].toString());
		switch(cnt) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			if(checkBonus(user.numbers, lotto[lCount-1].getBonus())) {
				System.out.println("2등");
				break;
			}else {
				System.out.println("3등");
				break;
			}
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		default:
			System.out.println("꽝");
			break;
		}
	}

	public void printLotto() {
		// 역대 당첨번호 리스트 확인
		System.out.println("--당첨번호리스트--");
		for(int i =0; i < lCount; i++) {
			System.out.println(lotto[i]);
		}
		
	}
		
}
