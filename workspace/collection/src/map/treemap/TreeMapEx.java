package map.treemap;

import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<>();
		score.put(new Integer(87), "홍길동");
		score.put(new Integer(99), "이길동");
		score.put(new Integer(65), "김길동");
		score.put(new Integer(86), "박길동");
		
//		Map.Entry<Integer, String> entry = null;
//		entry = score.firstEntry();
//		System.out.println("가장 낮은 점수: "+entry);
//		entry = score.lastEntry();
//		System.out.println("가장 높은 점수: "+entry);
//		entry = score.lowerEntry(new Integer(95));
//		System.out.println("95점 아래 점수 : "+entry);
//		entry = score.higherEntry(new Integer(95));
//		System.out.println("95점 위 점수 : "+entry);
		
		//오름차순
		//treemap에 달아주고 출력하면 자동으로 중위오더로 검색해서 출력되므로 오름차순
		Set<Map.Entry<Integer, String>> ss = score.entrySet();
		for(Map.Entry<Integer, String> dds : ss) {
			System.out.println(dds.getKey() + "  "+ dds.getValue());
		}
		
		//내림차순
		//descending메소드 이용
		NavigableMap<Integer, String> dm = score.descendingMap();
		Set<Map.Entry<Integer, String>> ds = dm.entrySet();
		for(Map.Entry<Integer, String> dds : ds) {
			System.out.println(dds.getKey() + "  "+ dds.getValue());
		}
		
		//dm변수를 이용해서 오름차순을 만들고 싶다.
		//내림차순 -> 한번 더 내림차순 -> 오름차순으로 적용된다.
		NavigableMap<Integer, String> sm = dm.descendingMap();
        Set<Map.Entry<Integer, String>> sss= sm.entrySet();
        for( Map.Entry<Integer, String> dds   : sss) {
           System.out.println(dds.getKey() + dds.getValue());
        } 

		
		
	}

}
