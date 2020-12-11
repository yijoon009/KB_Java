package list.linkedList;

import java.util.*;

public class LinkedListEx02 {
	public static void main(String[] args) {
		
		
		LinkedList<String> list1 = new LinkedList();
		/*
		 * ť(Queue) �� List�� �������̽��� ���� LinkedList 
		 * �׷��� �� �޼ҵ带 ����� �� �ִ�. ���Լ��� FIFO 
		 */
		//----------------
		//  ->  offer   last   null  c   ->  
		//----------------
		list1.add("b");
		list1.add(0,"a");
		list1.add("c");
		list1.add("c");
		list1.add(null);
		list1.addFirst("first");  // ù��°�� �ֱ�
		list1.addLast("last"); // �������� �ֱ�
		list1.push("push");  // add�� ���� ���, ���Լ��⿡ ���� ���� ����־�����.
		list1.offer("offer"); // �־��� ��ü�� �ִ´�. ���������� ����ִ� �� == addLast
		list1.pop(); // ��ü �ϳ��� �����ͼ� �����Ѵ�. ��ü�� ť���� �����Ѵ�. ���Լ��⿡ ���� ����  
		list1.poll(); // ��ü �ϳ��� �����´�. ��ü�� ť���� �����Ѵ�.����
		list1.peek(); // ��ü �ϳ��� �����´�. ��ü�� ť���� �������� �ʴ´�. �ڷḦ ������ �ִ�.
		// ���Լ��� 
		System.out.println("peek : "+list1.peek()+"\n\n");
		System.out.println("pop : "+list1.pop()+"������ �������� \n\n");
		System.out.println("poll : "+list1.poll()+"������ ������. \n\n");
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
//		//��ü���
//		Iterator<String> iter = linkedlist.iterator();
//		while(iter.hasNext()) {
//			String s = iter.next();
//			System.out.println(s);
//		}
//		
		
		
		
		
		
	}
}
