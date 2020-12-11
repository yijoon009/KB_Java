package map.treemap;

import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<>();
		score.put(new Integer(87), "ȫ�浿");
		score.put(new Integer(99), "�̱浿");
		score.put(new Integer(65), "��浿");
		score.put(new Integer(86), "�ڱ浿");
		
//		Map.Entry<Integer, String> entry = null;
//		entry = score.firstEntry();
//		System.out.println("���� ���� ����: "+entry);
//		entry = score.lastEntry();
//		System.out.println("���� ���� ����: "+entry);
//		entry = score.lowerEntry(new Integer(95));
//		System.out.println("95�� �Ʒ� ���� : "+entry);
//		entry = score.higherEntry(new Integer(95));
//		System.out.println("95�� �� ���� : "+entry);
		
		//��������
		//treemap�� �޾��ְ� ����ϸ� �ڵ����� ���������� �˻��ؼ� ��µǹǷ� ��������
		Set<Map.Entry<Integer, String>> ss = score.entrySet();
		for(Map.Entry<Integer, String> dds : ss) {
			System.out.println(dds.getKey() + "  "+ dds.getValue());
		}
		
		//��������
		//descending�޼ҵ� �̿�
		NavigableMap<Integer, String> dm = score.descendingMap();
		Set<Map.Entry<Integer, String>> ds = dm.entrySet();
		for(Map.Entry<Integer, String> dds : ds) {
			System.out.println(dds.getKey() + "  "+ dds.getValue());
		}
		
		//dm������ �̿��ؼ� ���������� ����� �ʹ�.
		//�������� -> �ѹ� �� �������� -> ������������ ����ȴ�.
		NavigableMap<Integer, String> sm = dm.descendingMap();
        Set<Map.Entry<Integer, String>> sss= sm.entrySet();
        for( Map.Entry<Integer, String> dds   : sss) {
           System.out.println(dds.getKey() + dds.getValue());
        } 

		
		
	}

}
