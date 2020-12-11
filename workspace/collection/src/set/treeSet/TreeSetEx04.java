package set.treeSet;

import java.util.*;

public class TreeSetEx04 {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("apple");
		treeset.add("forever");
		treeset.add("description");
		treeset.add("ever");
		treeset.add("zoo");
		treeset.add("base");
		treeset.add("guess");
		treeset.add("cherry");
		treeset.add("f");
		
		
		System.out.println("c~f���� �ܾ�˻�");
//		NavigableSet<String> rangeSet = treeset.subSet("c", true, "f", true);
//		NavigableSet<String> rangeSet = treeset.headSet("c", false);	//"c" ���ڿ����� �Ʒ���(~c) ���ڿ�
		NavigableSet<String> rangeSet = treeset.tailSet("c", true);	//"c" ���ڿ����� ���� (c,d~)���ڿ�
		
		for(String word : rangeSet) {
			System.out.println(word);
		}
		
		
		
	}

}
