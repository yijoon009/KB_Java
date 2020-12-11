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
		t2.add("���");
		t2.add("!!");
		
		//�����ڵ� ������� ���ĵǾ ��µȴ�
		System.out.println(t2);
		//bd���� ��� ������
		System.out.println(t2.subSet("bd", "���"));
		//�տ��� �����ϰ� �ڿ��� ������
		System.out.println(t2.subSet("bd",true, "���",false));
		//�տ��� �����ϰ� �ڿ��� ����
		System.out.println(t2.subSet("bd",true, "���",true));
		
	}
}
