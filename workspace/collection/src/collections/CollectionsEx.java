package collections;

import java.util.*;

public class CollectionsEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("��ö��");
		list.add("����");
		list.add("ȫ��");
		list.add("���Ͽ�");
		
		System.out.println(list);
		//��������
//		Collections.sort(list);
		//��������
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(1);
		set.add(120);
		set.add(155);
		set.add(17);
		for(int s : set) {
			System.out.println(s);
		}
		System.out.println("=====");
		//set -> list�� ����ȯ
		//1. �޼ҵ� Ȯ�� 2. �����ڷ� �����ϱ�
		List<Integer> setTolist = new ArrayList<Integer>(set);
		Collections.sort(setTolist);
		for(int s : setTolist) {
			System.out.println(s);
		}
		
		//Map�� �ִ°� sort�ϱ�
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", new Integer(100));
		map.put("v", new Integer(80));
		map.put("d", new Integer(77));
		map.put("j", new Integer(14));
		//Map�� list�� ����
		//1. �޼ҵ� Ȯ�� 2. �����ڷ� �����ϱ�
		//entrySet() -> getkey() -> 
		ArrayList list3 = new ArrayList(map.values()); //���2
		Collections.sort(list3);
		System.out.println(list3);
		
		// ��뿹3 �������� �����ϱ� - Collections.sort(list, Collections.reverseOrder());
		String[] exam = { "Nice", "to", "meet", "you"};
		List<String> list4 = Arrays.asList(exam); // �迭�� ����Ʈ�� ��ȯ
		Collections.sort(list4, Collections.reverseOrder()); // ����Ʈ ��������
		System.out.println(list4);
	}

}
