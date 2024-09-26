package day01;

public class Test02 {

	public static void main(String[] args) {
		// main + ctrl + spacebar
		/* 국어 영어 수학 세 점수의 합계와 평균을 출력
		 * if문을 이용하여 평균 80점 이상이면 pass / fail
		 * */
		int kor = 78;
		int eng = 89;
		int math = 98;
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		String s = "";
		if(avg >= 80) {
			s = "pass";
		}else {
			s = "fail";
		}
		
		System.out.println("합계 : " + sum + " 평균 : " + avg + " 결과 : " + s);
	}
}
