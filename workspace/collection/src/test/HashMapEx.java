package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 98);
		map.put("green", 44);
		map.put("yellow", 88);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> e : entry) {
			if(e.getValue() > maxScore) {
				maxScore = e.getValue();
				name = e.getKey();
			}
			totalScore += e.getValue();
		}
		
		System.out.println("평균점수 : "+(totalScore/map.size()));
		System.out.println("최고점수 : "+ maxScore);
		System.out.println("최고점수 받은 아이디 : " + name);
		
	}
}

class Students implements Comparator<Students>{
	public String id;
	public int score;
	public Students(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	@Override
	public int compare(Students o1, Students o2) {
		if(o1.score < o2.score) return -1;
		else if(o1.score == o2.score) return 0;
		else return 1;
	}
	
}