package map.hashTable;

import java.util.*;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();

		map.put("spring", "213");
		map.put("summer", "22213");
		map.put("fall", "222213");
		map.put("winter", "234213");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.println("���̵� :");
			String id = sc.nextLine();
			System.out.println("��й�ȣ: ");
			String pw = sc.nextLine();
			
			System.out.println();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�."); break;
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}else {
				System.out.println("�Է��� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	
	}
	

}
