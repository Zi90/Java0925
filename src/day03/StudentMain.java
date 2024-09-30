package day03;

public class StudentMain {

	public static void main(String[] args) {
		
		Student S = new Student();
		
//		S.saveInfo("인천","홍길동","AWS 풀스택 개발과정","010-XXXX-XXXX");
//		S.printInfo();
		// toStirng이 없으면 객체의 주소가 출력
		Student s1 = new Student("인천", "김영철", "JAVA", "010-1111-2222");
		Student s2 = new Student("서울", "이순이", "AWS", "010-1111-3333");
		Student s3 = new Student("경기", "최순철", "JAVA", "010-1111-4444");
		Student s4 = new Student("제주", "박승이", "JAVA", "010-1111-5555");
		Student s5 = new Student("부산", "최수현", "JAVA", "010-1111-6666");
		Student s6 = new Student("서울", "홍박사", "AWS", "010-1111-1111");
		
		Student[] studentArr = new Student[6];
		studentArr[0] = s1;
		studentArr[1] = s2;
		studentArr[2] = s3;
		studentArr[3] = s4;
		studentArr[4] = s5;
		studentArr[5] = s6;
		
		// 전체 학생명단 출력
//		for(Student stemp : studentArr) {
//			System.out.println(stemp);
//		}
		
		// 홍길동의 정보를 출력 == 안 됨,
		// equals () : String 값이 같은지 확인하는 메서드	
		String searchName = "홍박사";
		for(Student stemp : studentArr) {
			if (stemp.getName().equals(searchName)) {
                System.out.println(stemp);
			}
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		// 인천 지점 학생들 명단 출력
		// 학생이 없다면 명단이 없습니다. 출력
		String searchGigum = "서울";
		int cnt = studentArr.length;
		for(Student stemp : studentArr) {
			cnt--;
			if (stemp.getGigum().equals(searchGigum)) {
                System.out.println(stemp);
			}
			else if(cnt == 0){
				System.out.println("학생이 명단에 없습니다.");
			}
		}

		System.out.println("-----------------------------------------------------------------");
		
		// 최수현의 Process AWS로 변경 => 출력
		searchName = "최수현";
		String searchProcess = "AWS";
		for(Student stemp : studentArr) {
			if (stemp.getName().equals(searchName)) {
				stemp.setProcess(searchProcess);
                System.out.println(stemp);
			}
		}
		
	}

}
