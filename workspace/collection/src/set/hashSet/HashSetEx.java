package set.hashSet;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		
		//³Ö±â
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add(null);
		
		for(String hs : hashSet) {
			System.out.println(hs);
		}
		
		Iterator<String> iter = hashSet.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}

}
