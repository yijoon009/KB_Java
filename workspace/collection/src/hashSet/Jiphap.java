package hashSet;

import java.util.*;

public class Jiphap {
	public static void main(String[] args) {
		HashSet setA = new HashSet<>();
		HashSet setB = new HashSet<>();
		HashSet setHab = new HashSet<>();
		HashSet setKyo = new HashSet<>();
		HashSet setCha = new HashSet<>();
		
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		System.out.println("A= "+setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println("B= "+setB);
		
		Iterator iter = setB.iterator();
		while(iter.hasNext()) {
			Object tmp = iter.next();
			if(setA.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
		
		
		
		
	}
}
