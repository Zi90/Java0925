package day11;

class JoinTest extends Thread{
	int start;
	int end;
	int total;

	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			System.out.println(i);
			this.total += i;
		}
	}

}


public class Thread03 {

	public static void main(String[] args) {
		// 1 ~ 50, 51 ~ 100까지의 합을 구하는 두 개의 Thread를 생성
		// 그 결과를 확인
		// Thread.sleep() : 기다렸다가 실행
		// millisecond 단위  1초=1000
		
		// 두 개의 Thread가 실행되고 난 후
		// Thread-0 1~50까지의 합계 출력
		// Thread-1 51~100까지의 합계 출력
		// Thread-0 + Thread-1의 합계 출력
		System.out.println("main thread start");
		
		JoinTest th1 = new JoinTest(1, 50);
		JoinTest th2 = new JoinTest(51, 100);

		th1.start();		
		try {
			th1.join();
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		try {
			th2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("---------------------");
		System.out.println("thread1 total > " + th1.total);
		System.out.println("thread2 total > " + th2.total);
		System.out.println("thread1 + thread2 total > " + th1.total + th2.total);
	}

}
