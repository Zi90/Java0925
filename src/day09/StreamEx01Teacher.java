package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StreamEx01Teacher {

	public static void main(String[] args) {
		/* 여행사 상품
		 * 여행비용이 15세 이상은 100만원, 미만은 50만원으로 계산
		 * 
		 * 고객 5명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용계산 => 출력
		 * 2. 고객 명단 출력
		 * 고객 클래스를 생성하고, ArrayList 로 고객관리
		 * 
		 * 예) 
		 * 이름:이순신 나이:40 비용: 100
		 * 이름:신사임당 나이:38 비용:100
		 * 이름:홍길동 나이:30 비용:100
		 * 이름:이짱구 나이:10 비용:50
		 * 이름:이짱아 나이:5 비용:50
		 * 총 여행경비 : xxx
		 * 
		 * 20세 이상 고객명단 => 이름순으로 정렬
		 * 이름:신사임당 나이:38 비용:100
		 * 이름:이순신 나이:40 비용: 100
		 * 이름:홍길동 나이:30 비용:100
		 * 
		 * */
		ArrayList<CustomerTeacher> list = new ArrayList<>();
		list.add(new CustomerTeacher("이순신", 40));
		list.add(new CustomerTeacher("신사임당", 38));
		list.add(new CustomerTeacher("홍길동", 30));
		list.add(new CustomerTeacher("이짱구", 10));
		list.add(new CustomerTeacher("이짱아", 5));
		
		int sum = 0;
		System.out.println("--고객명단--");
		for(CustomerTeacher tmp : list){
			String name = tmp.getName();
			int age= tmp.getAge();
			int price = tmp.getPrice();
			sum += price;
			System.out.println(name+"("+age+")"+" 비용:"+price+"만원");
		}
		System.out.println("-------------");
		System.out.println("총지불비용:"+sum+"만원");
		//Comparator 구현이 없는 경우
		list.sort(new Comparator<CustomerTeacher>() {

			@Override
			public int compare(CustomerTeacher o1, CustomerTeacher o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		Collections.sort(list); // 클래스에 정렬이 구현되어 있을경우 사용가능
		System.out.println("--20대 이상 명단--");
		for(CustomerTeacher tmp : list) {
			if(tmp.getAge() >= 20) {
				System.out.println(tmp);
			}
		}
		
		System.out.println("----Stream 이용방법----");
		
		list.stream().forEach(s->System.out.println(s));
		
		int total = list.stream()
				.mapToInt(n-> n.getPrice())
				.sum();
		System.out.println("---총지불금액:"+total);
		
		//20세이상
		System.out.println("--20세 이상--");
		list.stream()
		.filter(s->s.getAge()>=20)
		.sorted()// 기존 클래스에서 구현
		.forEach(a->System.out.println(a));
		
		//익명클래스 사용할 경우 Comparator 대상값이 (매개변수가) 2개
		//클래스 내부에서 구현할 경우 Comparable 대상값이 (매개변수) 1개
		
		
		
		
		
		
	}

}