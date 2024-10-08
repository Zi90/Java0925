package day07;

import java.util.ArrayList;

public class ListEx03 {

	public static void main(String[] args) {
		/* 과제
		 * num의 값을 숫자 List를 생성하여 추가 => 출력
		 * 합계를 출력
		 * 70점 이상인 인원 수 출력
		 * 3/8명
		 */
		String num = "45,78,98,65,84,52,64,31";
		
		String[] numbers = num.split(",");
		ArrayList<Integer> list = new ArrayList<>();
		int n = 0;
		int sum = 0;
		int cnt = 0;
		
		for(String tmp : numbers) {
			n = Integer.parseInt(tmp);
			sum += n;
			list.add(n);
			if(n >= 70) {
				cnt++;
			}
		}
		System.out.println(list);
		System.out.println("합계 : " + sum + " | 합격 : " + cnt + "/" + list.size());

	}

}
