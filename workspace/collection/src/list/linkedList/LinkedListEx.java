package list.linkedList;

import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<2000;i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간 : "+(endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i=0;i<2000;i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간 : "+(endTime-startTime));
		
		list2.add("1111");
		System.out.println(list2.get(200));
		list2.set(0, "5000");
		
		//전체출력
		Iterator<String> iter = list2.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
	}
}
