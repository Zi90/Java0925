package day09;

import java.util.ArrayList;
import java.util.Comparator;

public class Stream03 {

	public static void main(String[] args) {
		/* Student 클래스로 리스트 구성
		 * Student 이름, 점수만 가지는 클래스
		 * 
		 * 학생 5명을 추가하고, 콘솔에 출력
		 * 홍길동 : 80
		 */

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("hong", 89));
		list.add(new Student("kim", 79));
		list.add(new Student("lee", 74));
		list.add(new Student("park", 95));
		list.add(new Student("choi", 78));
		
		// 스트림을 이용하여 콘솔에 출력
		list.stream().forEach(n -> {
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name + "=>" + score);
		});
		
		// list의 점수 합계 / 전체 인원수
		int sum = list.stream().mapToInt(n -> n.getScore()).sum();
		long cnt = list.stream().count();
		System.out.println("점수합계 : " + sum + " 인원수 : " + cnt);
		
		System.out.println("-----------");
		// 이름순으로 정렬하여 출력
		
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// o2 => 내림차순
				return o1.getName().compareTo(o2.getName());
			}
			
		}).forEach(System.out::println);
		
	}

}
