package hashMap;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		// ��ü�� ���� �ֱ�
		map.put("ȫ�浿", 100);
		map.put("��浿", 80);
		map.put("�ڱ浿", 90);
		map.put("�̱浿", 90);
		map.put("�ֱ浿", 100);
		
		// ���
		System.out.println(map.get("ȫ�浿")); // key 
		
		Set<String> key = map.keySet();  // ��� key�� ���� ���� 
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()) {
			String k = iter.next();
			int v = map.get(k);
			System.out.println(k+" "+v); 
		}		
		System.out.println("=============");
		
		//�� ��ü����ϱ�
		Set<Map.Entry<String, Integer>> entryS = map.entrySet(); 
		Iterator<Map.Entry<String, Integer>> it = entryS.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> line = it.next();
			System.out.println(line);
		}
	}

}
