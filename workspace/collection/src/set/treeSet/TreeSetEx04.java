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
		
		
		System.out.println("c~f사이 단어검색");
//		NavigableSet<String> rangeSet = treeset.subSet("c", true, "f", true);
//		NavigableSet<String> rangeSet = treeset.headSet("c", false);	//"c" 문자열보다 아래의(~c) 문자열
		NavigableSet<String> rangeSet = treeset.tailSet("c", true);	//"c" 문자열보다 위의 (c,d~)문자열
		
		for(String word : rangeSet) {
			System.out.println(word);
		}
		
		
		
	}

}
