package day10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordController {
	
	private List<Word> wordBook = new ArrayList<>();

	public void addWord() {
		//기존 단어 추가
		Word w = new Word("dog");
		List<String> tmp = new ArrayList<>();
		tmp.add("강아지");
		tmp.add("뽀삐");
		tmp.add("개");
		w.setMean(tmp);
		wordBook.add(w);
		Word w1 = new Word("cat");
		List<String> tmp1 = new ArrayList<>();
		tmp1.add("고양이");
		tmp1.add("나비");
		tmp1.add("야옹이");
		w1.setMean(tmp1);
		wordBook.add(w1);
		Word w2 = new Word("pig");
		List<String> tmp2 = new ArrayList<>();
		tmp2.add("돼지");
		tmp2.add("꿀꿀이");
		tmp2.add("저팔계");
		w2.setMean(tmp2);
		wordBook.add(w2);
				
	}
	

	public void insertWord(Scanner scan) {
		// 단어등록
		System.out.println("단어:");
		String word = scan.next();
		List<String> tmp = new ArrayList<>();
		
		String end = "a";

		while(!end.equals("y")) {
			System.out.println("의미:");
			tmp.add(scan.next());
			System.out.println("종료(y)");
			end = scan.next();
		}
		wordBook.add(new Word(word,tmp));
		System.out.println("등록완료");
	}

	public void searchWord(Scanner scan) {
		// 단어검색
		System.out.println("검색할 단어입력 >");
		String word = scan.next();
		int index = wordBook.indexOf(new Word(word));
		System.out.println(wordBook.get(index));
	}

	public void modifyWord(Scanner scan) {
		// 단어수정
		System.out.println("수정할 단어입력 >");
		String word = scan.next();
		int index = wordBook.indexOf(new Word(word));
		List<String> mean = wordBook.get(index).getMean();
		System.out.println(mean);
		System.out.println("몇번째 뜻을 수정할까요?(1,2,3..)");
		int i = scan.nextInt();
		System.out.println("수정의미 > ");
		String modify = scan.next();
		mean.set(i-1, modify);
		wordBook.set(index, new Word(word, mean));
		System.out.println("수정완료");
	}

	public void printWord() {
		// wordBook 출력
		for(Word w : wordBook) {
			System.out.println(w);
		}
		
	}

	public void removeWord(Scanner scan) {
		// 단어삭제
		System.out.println("삭제할 단어입력 >");
		String word = scan.next();
		wordBook.remove(new Word(word));
		System.out.println("삭제완료");
	}

	public void fileWord() throws IOException {
		// 파일로 출력
		// StringBuffer 객체 사용
		// .append : 기존 String 객체에 데이터 추가
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		String data = null;
		sb.append("--단어장--\r\n");
		
		for(Word w : wordBook) {
			sb.append(w);
			sb.append("\r\n"); //줄바꿈
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fs.close();
	}

}