package day02;

public class Lotto {
	
	public static void main(String[] args) {
		// 로또 번호 생성
		
		int lotto[] = new int[7]; // 당첨번호
		int user[] = new int[6]; // 사용자 로또 번호
		
		Lotto L = new Lotto();
		
		int cnt = 0;
		
		do {
			cnt++;
			L.resultArr(lotto, user);
			System.out.println("총 횟수 : " + cnt);
		}
		while(L.lottoArr(lotto, user) != 1);
		
	}
	/* 배열을 매개변수로 받아 1 ~ 45까지의 랜덤수를 채워서 생성(중복불가능 - 메서드 호출로 구현)
	 * 리턴할 필요가 없음. main에 있는 배열을 채우기.
	 */
	
	// 랜덤수 생성 메서드(중복 확인 메서드를 활용)
	public void randomArr(int arr[]) {
		int cnt = 0;
		while(cnt < arr.length) {
			int r = (int)(Math.random()*9) + 1;
			if(!containArr(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	/* 배열과 값을 주고 같은지 아닌지 확인하는 메서드
	 * 배열에 값이 있으면 true / 없으면 false
	 */
	
	// 중복 확인 메서드
	public boolean containArr(int arr[], int random) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		return false;
	}
	
	/* 배열(매개변수)의 값을 출력화는 메서드
	 * 1 2 3 4 5 6 [7] 당첨번호 출력방식
	 * 1 2 3 4 5 6 유저번호 출력방식
	 */
	
	// lotto, user 출력 메서드
	public void printArr(int arr[]) {
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}
		
		if (arr.length > 6) {
			int bonus = arr[arr.length - 1];
			System.out.print("[" + bonus + "]");
		}
	System.out.println();
	}
	
	/* 등수확인 메서드
	 * -- 당첨 기준
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 번호 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 4개 일치 : 5등
	 * 나머지는 꽝
	 */
	
	// 등수 확인 메서드(중복 확인 메서드를 활용)
	public int lottoArr(int arr1[], int arr2[]) {
		int cnt = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			if(containArr(arr2, arr1[i])) {
				cnt++;
			}
		}
		
		switch(cnt) {
			case 6:
				return 1;
			case 5:
				if(containArr(arr2, arr1[arr1.length - 1])) {
					return 2;
				}else {
					return 3;
				}
			case 4:
				return 4;
			case 3:
				return 5;
			default:
				return 6;
		}
	}
	
	// 등수 출력 메서드
	public void resultArr(int arr1[], int arr2[]) {
		// 랜덤수 채우기
		randomArr(arr1);
		randomArr(arr2);
		
		// lotto, user 입력된 수 출력하기
		printArr(arr1);
		printArr(arr2);
		
		// 등수 출력하기
		String text = lottoArr(arr1, arr2) == 6 ? "꽝입니다." : lottoArr(arr1, arr2) + "등 입니다.";
		System.out.println(text);
	}
	
}
