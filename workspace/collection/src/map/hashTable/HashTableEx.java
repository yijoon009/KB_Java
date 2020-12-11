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
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.println("아이디 :");
			String id = sc.nextLine();
			System.out.println("비밀번호: ");
			String pw = sc.nextLine();
			
			System.out.println();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다."); break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("입력한 아이디가 존재하지 않습니다.");
			}
		}
	
	}
	

}
