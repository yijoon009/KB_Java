package linkedList;

import java.util.LinkedList;

public class LinkedListEx3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add(0, "a");
		list.add("b");
		list.add("c");
		list.add(2, "d");
		System.out.println(list);
	}

}
