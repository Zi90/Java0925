package day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		// test.txt 파일을 읽어들여 map에 저장
		// 명단, 합계, 평균 출력
		// 읽어 들이는 파일은 모두 String
		// 계산을 위해서는 int로 변환이 필요
		// Integer.parseInt();
		// 80점 이상인 학생 명단

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		int sum = 0;
		
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			// name, score로 분리
			// 홍길동 78 공백을 기준으로 분리 substring
			String name = line.substring(0, line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			sum += score;
			map.put(name, score);
		}
		System.out.println(map);
		System.out.println("-------------");
		for(String name : map.keySet()) {
			System.out.println(name + ":" +map.get(name));
		}
		System.out.println("합계 : " + sum + " / 평균 : " +((double)sum /map.size()));
		
		System.out.println("-------------");
		System.out.println("-80점 이상 명단-");
		for(String name : map.keySet()) {
			if(map.get(name) >= 80) {
				System.out.println(name + ":" + map.get(name));
			}
		}
		br.close();
	}

}
