package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListEx01 {

    public static void main(String[] args) {
        /* 하루 일과를 저장하는 list를 생성
         * 출력 for / 향상된 for / Iterator 출력
         * import 다축키 : ctrl+shift+o
         */
        
        List<String> list = new ArrayList<>(); // 변수명을 list로 변경
        list.add("기상");
        list.add("씻기");
        list.add("아침밥 먹기");
        list.add("양치 하기");
        list.add("학원 가기");
        list.add("입실");
        list.add("오전 수업");
        list.add("점심밥 먹기");
        list.add("양치 하기");
        list.add("오후 수업");
        list.add("퇴실");
        list.add("자습");
        list.add("귀가");
        list.add("저녁밥 먹기");
        list.add("씻기");
        list.add("게임 하기");
        list.add("취침");
        
        System.out.println("--- 하루 일과 ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("---------------");
        for (String tmp : list) {
            System.out.println(tmp);
        }
        
        System.out.println("---------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String tmp = it.next();
            System.out.println(tmp);
        }
        
        // 정렬 list.sort(Comparator 구현체);
        System.out.println(list);
        // 오름차순
        Collections.sort(list);
        System.out.println(list);
        
        // 내림차순
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순
            }
        });
        
        System.out.println(list);
        
        // 같은 Object가 2개 이상이더라도 앞에 있는 하나만 삭제
        List<String> ex = new ArrayList<>();
        list.add("양치 하기");
        list.removeAll(ex);
        System.out.println(list);
    }
}
