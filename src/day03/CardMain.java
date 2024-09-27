package day03;

public class CardMain {

	public static void main(String[] args) {
		
		Card C = new Card();
		
		C.setShape('◆');
		C.setNum(1);
		C.print();
		System.out.println();
		C.setShape('♥');
		C.setNum(11);
		C.print();
		System.out.println();
		C.setShape('♠');
		C.setNum(12);
		C.print();
		System.out.println();
		C.setShape('♣');
		C.setNum(13);
		C.print();
		System.out.println();
		C.setShape('◆');
		C.setNum(2);
		C.print();
		System.out.println();
		C.setShape('#');
		C.setNum(10);
		C.print();
		System.out.println();
		C.setShape('$');
		C.setNum(14);
		C.print();

		System.out.println();
		System.out.println("--------------------------");

		CardPack cp = new CardPack();
		
		cp.shuffle();
		
		// cp.getPack() : CardPack의 멤버변수 배열 pack[] pack[0] = cp.getPack()[0]
		int cnt = 0;
		for(int i = 1; i <= 4; i++) {           
			for(int j = 1; j <= 13; j++) {
				cp.getPack()[cnt].print();
				cnt++;
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		System.out.println("딜러가 카드를 나누고 있습니다.");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		Card player3 = cp.pick();
		Card player4 = cp.pick();
		Card player5 = cp.pick();
		System.out.println("카드를 모두 나누었습니다.");
		System.out.print("player1 : ");
		player1.print();
		System.out.print(" / player2 : ");
		player2.print();
		System.out.print(" / player3 : ");
		player3.print();
		System.out.print(" / player4 : ");
		player4.print();
		System.out.print(" / player5 : ");
		player5.print();
	}

}
