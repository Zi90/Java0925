package day03;
/* 카드 한 묶음을 나타내는 클래스
 * ◆, ♥, ♠, ♣
 * ◆1~13, ♥1~13, ♠1~13, ♣1~13
 * 52장의 카드를 담을 수 있는 배열 (카드 한묶음 배열) - 멤버변수
 * 
 * 생성자 - 52장의 카드를 순서대로 생성되게 만들기
 * 메서드 :
 * - 카드 출력기능 : Card class => print() 사용
 * - 카드 초기화 기능 :
 * - 카드 한 장을 나눠주는 기능
 * - 카드를 섞는 기능
 */
public class CardPack {
	private Card pack[] = new Card[52];
	// 카드의 index를 체크하기 위한 변수
	private int cnt = 0;
	
	public CardPack() {
		// 52장의 카드를 생성하여 배열에 넣기
		// num : 1 ~ 13 / shape ◆ ♥ ♠ ♣
		char shape = '◆';
		
		for (int i = 1; i <= 4; i++) {
			switch(i) {
			 case 1:
				 shape = '◆';
				 break;
			 case 2:
				 shape = '♥';
				 break;
			 case 3:
				 shape = '♠';
				 break;
			 case 4:
				 shape = '♣';
				 break;
			}
			for(int j = 1; j <= 13; j++) {
				Card C = new Card();
				C.setShape(shape);
				C.setNum(j);
				pack[cnt] = C;
				cnt++;
			}
		}
	}
	
	// 카드를 섞는 기능.
	// shuffle() 리턴타입 : void 매개변수 : X
	// 랜덤번지를 한 뽑아서 순서대로 0번지부터 서로 교환
	public void shuffle() {
		for(int i = 0; i < pack.length; i++) {
			int random = (int)(Math.random()*pack.length);
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	
	public Card pick() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
