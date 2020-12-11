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
		System.out.println("���� ���� ���� : " +score);
		score = scores.last();
		System.out.println("���� ���� ���� : " +score);
		
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ��� ���� : " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95�� ���� ���� : " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : " + score);
		
		score = scores.ceiling(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �� ���� : " + score);
		
		while(!scores.isEmpty()) {
			//���� �������� ����ְ� ����
			score = scores.pollFirst();
			System.out.println(score);
					
		}
		
		
	}

}
