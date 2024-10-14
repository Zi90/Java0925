package day09;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamEx01 {
	
	private String name;
	private int age;
	private int cost;
	
	public StreamEx01() {};
	
	public StreamEx01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public StreamEx01(String name, int age, int cost) {
		this.name = name;
		this.age = age;
		this.cost = cost;
	}

	public static void main(String[] args) {
		/* 과제
		 * 여행사 상품
		 * 여행 비용이 15세 이상은 100만원, 미만은 50만원으로 계산
		 * 고객 5명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용계산 => 출력
		 * 2. 고객 명단 출력
		 * 고객 클래스로 생성하고, ArrayList로 고객관리
		 * 
		 * 예)
		 * 이름 : 이순신 나이 : 40 비용 : 100
		 * 이름 : 신사임당 나이 : 38 비용 : 100
		 * 이름 : 홍길동 나이 : 30 비용 100
		 * 이름 : 이짱구 나이 : 10 비용 : 50
		 * 이름 : 이짱아 나이 : 5 비용 : 50
		 * 총 여행 경비 : XXX
		 * 
		 * 20세 이상 고객명단 => 이름순으로 정렬
		 */
		
		ArrayList<StreamEx01> list = new ArrayList<>();

		list.add(new StreamEx01("신형만", 40));
		list.add(new StreamEx01("봉미선", 40));
		list.add(new StreamEx01("신짱구", 10));
		list.add(new StreamEx01("신짱아", 1));
		list.add(new StreamEx01("흰둥이", 1));
		
		list.stream().filter(n -> n.getAge() >= 15).forEach(m -> m.setCost(100));
		list.stream().filter(n -> n.getAge() < 15).forEach(m -> m.setCost(50));
		
		list.stream().forEach(n -> {
			String name = n.getName();
			int age = n.getAge();
			int cost = n.getCost();
			System.out.println("이름 : " + name + " | 나이 : " + age + " | 비용 : " + cost + "만원");
		});
		
		int sum = list.stream().mapToInt(n -> n.getCost()).sum();
		System.out.println("총 여행경비 : " + sum + "만원");
		
		System.out.println("--- 20세 이상 고객명단 ---");
		list.stream().filter(n -> n.getAge() >= 20).sorted(new Comparator<StreamEx01>() {

			@Override
			public int compare(StreamEx01 o1, StreamEx01 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(n -> System.out.println("이름 : " + n.getName() + " | 나이 : " + n.getAge() + " | 비용 : " + n.getCost() + "만원"));
		
		
		
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " | 나이 : " + age + " | 비용 : " + cost;
	}
	
}
