package list.linkedList;

import java.util.*;

public class LinkedListEx02 {
	public static void main(String[] args) {
		
		
		LinkedList<String> list1 = new LinkedList();
		/*
		 * 큐(Queue) 와 List의 인터페이스를 쓰는 LinkedList 
		 * 그래서 두 메소드를 사용할 수 있다. 선입선출 FIFO 
		 */
		//----------------
		//  ->  offer   last   null  c   ->  
		//----------------
		list1.add("b");
		list1.add(0,"a");
		list1.add("c");
		list1.add("c");
		list1.add(null);
		list1.addFirst("first");  // 첫번째로 넣기
		list1.addLast("last"); // 마지막에 넣기
		list1.push("push");  // add와 같은 기능, 선입선출에 의해 먼저 집어넣어진다.
		list1.offer("offer"); // 주어진 객체를 넣는다. 마지막에다 집어넣는 것 == addLast
		list1.pop(); // 객체 하나를 가져와서 제거한다. 객체를 큐에서 제거한다. 선입선출에 의해 선출  
		list1.poll(); // 객체 하나를 가져온다. 객체를 큐에서 제거한다.삭제
		list1.peek(); // 객체 하나를 가져온다. 객체를 큐에서 제거하지 않는다. 자료를 가지고 있다.
		// 선입선출 
		System.out.println("peek : "+list1.peek()+"\n\n");
		System.out.println("pop : "+list1.pop()+"꺼내고 버려버림 \n\n");
		System.out.println("poll : "+list1.poll()+"꺼내고 버린다. \n\n");
		int i =0 ;
		System.out.println(list1);
		Iterator<String> iter = list1.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			i++;
			System.out.println(s+" : "+i);
		}

		
//		List<String> list1 = new LinkedList<String>();
//		
//		list1.add("b");
//		list1.add("b");
//		list1.add("b");
//		list1.add("b");
//		
//		LinkedList<String> linkedlist = (LinkedList<String>) list1;
//		
//		
//		
//		
//		
//		linkedlist.addFirst("first");
//		linkedlist.addLast("last");
//		
//		linkedlist.push("push");
//		linkedlist.offer("offer");
//		linkedlist.rem
//		
//		//전체출력
//		Iterator<String> iter = linkedlist.iterator();
//		while(iter.hasNext()) {
//			String s = iter.next();
//			System.out.println(s);
//		}
//		
		
		
		
		
		
	}
}
