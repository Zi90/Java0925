package day04;

import day04.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setPhone("010-1111-1111");
		s.printInfo();
		s.printCompany();
		s.printCourse();
		
		Student s1 = new Student("hong", "010-1111-2222", "incheon");
		s1.printInfo();
		s1.printCompany();
		s1.insertCourse("java", "5 Month");
		s1.insertCourse("python", "1 Month");
		s1.printCourse();
		
		Student s2 = new Student("park", "010101", "010-2222-2222", "25", "seoul");
		s2.printInfo();
		s2.printCompany();
		s2.insertCourse("java", "5 Month");
		s2.insertCourse("HTML", "1 Month");
		s2.insertCourse("React", "1 Month");
		s2.printCourse();
		
		Student[] std = new Student[8];
		std[0] = s;
		std[1] = s1;
		std[2] = s2;
		
		// 5명 정보를 추가
		std[3] = new Student("kim", "010202", "010-2222-3333", "25", "incheon");
		std[3].insertCourse("java", "5 Month");
		std[3].insertCourse("HTML", "1 Month");
		std[3].insertCourse("React", "1 Month");
		std[4] = new Student("choi", "010206", "010-2222-3333", "24", "seoul");
		std[4].insertCourse("java", "5 Month");
		std[4].insertCourse("HTML", "1 Month");
		std[4].insertCourse("React", "1 Month");
		std[5] = new Student("lee", "030502", "010-2222-3333", "23", "incheon");
		std[5].insertCourse("java", "5 Month");
		std[5].insertCourse("HTML", "1 Month");
		std[5].insertCourse("React", "1 Month");
		std[6] = new Student("kang", "020506", "010-2222-3333", "22", "seoul");
		std[6].insertCourse("java", "5 Month");
		std[6].insertCourse("HTML", "1 Month");
		std[6].insertCourse("React", "1 Month");
		std[7] = new Student("ha", "000207", "010-2222-3333", "21", "seoul");
		std[7].insertCourse("java", "5 Month");
		std[7].insertCourse("HTML", "1 Month");
		std[7].insertCourse("React", "1 Month");
		
		System.out.println("--------------------------------------------------------");
		// 학생 전체 명단 출력 (학생정보만)
		for(int i = 0; i < std.length; i++) {
			std[i].printInfo();
		}
		
		System.out.println("--------------------------------------------------------");
		// hong 학생의 학생정보, 학원정보, 수강정보 출력
		String searchName = "hong";
		for(int i = 0; i < std.length; i++) {
			if (std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompany();
				std[i].printCourse();
			}			
		}
				
		System.out.println("--------------------------------------------------------");
		// incheon 지점의 학생 명단 출력 (학생정보만)
		String searchBranch = "incheon";
		for(int i = 0; i < std.length; i++) {
			if(std[i].getBranch() != null) {  // nullPointException 방지용
				if (std[i].getBranch().equals(searchBranch)) {
					std[i].printInfo();
				}			
			}
		}
		
		System.out.println("--------------------------------------------------------");
		// java 과목을 수강하는 학생명단 출력(학생정보, 학원정보, 수강정보전부 출력)
		String searchCourse = "java";
		System.out.println("---"+searchCourse+"과목 수강학생 정보---");
		//전체 학생 배열에서 개개인의 과목 배열로 2중 검색
		int cnt=0;
		while(cnt < std.length) {
			for(int i=0; i<std[cnt].getCourse().length; i++) {
				if(std[cnt].getCourse()[i] != null) {
					if(std[cnt].getCourse()[i].equals(searchCourse)) {
						std[cnt].printInfo();
						std[cnt].printCompany();
						std[cnt].printCourse();
					}
				}
			}
			cnt++;
		}
		
		System.out.println("--------------------------------------------------------");
		// 수강하지 않는 학생 명단 출력 (학생정보만)
		System.out.println("---수강과목이 없는 학생 정보---");
		cnt=0;
		while(cnt < std.length) {
			if(std[cnt].getCourse()[0] == null) {
				std[cnt].printInfo();
			}
			cnt++;
		}
	}

}
