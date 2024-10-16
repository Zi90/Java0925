package jdbcStudent;

import java.util.List;
import java.util.Scanner;

public class StudentController {
	private Scanner scan;
	private Service svc;
	private boolean flag;
	
	public StudentController() {
		scan = new Scanner(System.in);
		svc = new StudentServiceImpl();
		flag = true;
		printMenu();
	}

	private void printMenu() {
		while(flag) {
			System.out.println("---------------------------------학생 관리 프로그램---------------------------------");
			System.out.println(" ____        ______    __  __      ____       ____       __  __      ______   \r\n"
					+ "/\\  _`\\     /\\__  _\\  /\\ \\/\\ \\    /\\  _`\\    /\\  _`\\    /\\ \\/\\ \\    /\\__  _\\  \r\n"
					+ "\\ \\,\\L\\_\\   \\/_/\\ \\/  \\ \\ \\ \\ \\   \\ \\ \\/\\ \\  \\ \\ \\L\\_\\  \\ \\ `\\\\ \\   \\/_/\\ \\/  \r\n"
					+ " \\/_\\__ \\      \\ \\ \\   \\ \\ \\ \\ \\   \\ \\ \\ \\ \\  \\ \\  _\\L   \\ \\ , ` \\     \\ \\ \\  \r\n"
					+ "   /\\ \\L\\ \\     \\ \\ \\   \\ \\ \\_\\ \\   \\ \\ \\_\\ \\  \\ \\ \\L\\ \\  \\ \\ \\`\\ \\     \\ \\ \\ \r\n"
					+ "   \\ `\\____\\     \\ \\_\\   \\ \\_____\\   \\ \\____/   \\ \\____/   \\ \\_\\ \\_\\     \\ \\_\\\r\n"
					+ "    \\/_____/      \\/_/    \\/_____/    \\/___/     \\/___/     \\/_/\\/_/      \\/_/\r\n"
					+ "");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1.학생등록|2.학생리스트|3.학생검색(내정보보기)|4.내정보수정|5.학생삭제|6.종료");
			System.out.println("번호 입력 >");
			int menu = scan.nextInt();
			
			switch(menu) {
				case 1: register(); break;
				case 2: list(); break;
				case 3: search(); break;
				case 4: modify(); break;
				case 5: delete(); break;
				case 6:
					flag = false;
					System.out.println("종료합니다.");
					break;
				default : System.out.println("잘못된 번호입니다.");
			}
			
		}
		
	}

	private void delete() {
		System.out.println("검색할 번호 입력 >");
		int sno = scan.nextInt();
		int isOk = svc.delete(sno);
		System.out.println("학생 삭제 " + (isOk > 0 ? "성공" : "실패"));
		
	}

	private void modify() {
		System.out.println("검색할 번호 입력 >");
		int sno = scan.nextInt();
		System.out.println("학생 학번 >");
		int sid = scan.nextInt();
		System.out.println("학생 이름 >");
		scan.nextLine();
		String sname = scan.nextLine();
		System.out.println("학생 생년월일(ex:240101) >");
		String birth = scan.next();
		System.out.println("학생 전화번호(ex:01012341234) >");
		String phone = scan.next();
		System.out.println("학생 주소 >");
		scan.nextLine();
		String address = scan.nextLine();
		
		Student s = new Student(sno, sid, sname, birth, phone, address);
		int isOk = svc.update(s);
		System.out.println("학생 등록 " +  (isOk > 0 ? "성공" : "실패"));
	}

	private void search() {
		System.out.println("검색할 번호 입력 >");
		int sno = scan.nextInt();
		Student s = svc.getStudent(sno);
		System.out.println(s);
	}

	private void list() {
		List<Student> list = svc.getList();
		for(Student s : list) {
			System.out.println(s.print());
		}
		
	}

	private void register() {
		System.out.println("학생 학번 >");
		int sid = scan.nextInt();
		System.out.println("학생 이름 >");
		scan.nextLine();
		String sname = scan.nextLine();
		System.out.println("학생 생년월일(ex:240101) >");
		String birth = scan.next();
		System.out.println("학생 전화번호(ex:01012341234) >");
		String phone = scan.next();
		System.out.println("학생 주소 >");
		scan.nextLine();
		String address = scan.nextLine();
		
		Student s = new Student(sid, sname, birth, phone, address);
		int isOk = svc.insert(s);
		System.out.println("학생 등록 " +  (isOk > 0 ? "성공" : "실패"));
		
	}

	
}
