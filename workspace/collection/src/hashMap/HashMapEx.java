package hashMap;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		// 객체에 값을 넣기
		map.put("홍길동", 100);
		map.put("김길동", 80);
		map.put("박길동", 90);
		map.put("이길동", 90);
		map.put("최길동", 100);
		
		// 출력
		System.out.println(map.get("홍길동")); // key 
		
		Set<String> key = map.keySet();  // 모든 key의 값을 구함 
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()) {
			String k = iter.next();
			int v = map.get(k);
			System.out.println(k+" "+v); 
		}		
		System.out.println("=============");
		
		//맵 전체출력하기
		Set<Map.Entry<String, Integer>> entryS = map.entrySet(); 
		Iterator<Map.Entry<String, Integer>> it = entryS.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> line = it.next();
			System.out.println(line);
		}
	}

}
