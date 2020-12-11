package set.treeSet;

import java.util.*;

public class ThreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(10);
		treeset.add(0);
		treeset.add(5);
		treeset.add(3);
		treeset.add(8);
		treeset.add(7);
		treeset.add(-10);
		treeset.add(0);
		
		System.out.println(treeset);
		
		TreeSet<String> t2 = new TreeSet<>();
		t2.add("a");
		t2.add("Da");
		t2.add("bd");
		t2.add("B");
		t2.add("ca");
		t2.add("A");
		t2.add("기억");
		t2.add("!!");
		
		//유니코드 순서대로 정렬되어서 출력된다
		System.out.println(t2);
		//bd부터 기억 전까지
		System.out.println(t2.subSet("bd", "기억"));
		//앞에꺼 포함하고 뒤에꺼 미포함
		System.out.println(t2.subSet("bd",true, "기억",false));
		//앞에꺼 포함하고 뒤에꺼 포함
		System.out.println(t2.subSet("bd",true, "기억",true));
		
	}
}
