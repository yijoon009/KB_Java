package set.treeSet;

import java.util.*;

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(99));
		scores.add(new Integer(79));
		scores.add(new Integer(50));
		scores.add(new Integer(80));
		scores.add(new Integer(95));
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 : " +score);
		score = scores.last();
		System.out.println("가장 높은 점수 : " +score);
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래의 점수 : " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수 : " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수 : " + score);
		
		score = scores.ceiling(new Integer(95));
		System.out.println("95점이거나 바로 위 점수 : " + score);
		
		while(!scores.isEmpty()) {
			//가장 낮은점수 찍어주고 버림
			score = scores.pollFirst();
			System.out.println(score);
					
		}
		
		
	}

}
