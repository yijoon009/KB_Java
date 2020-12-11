package collections;

import java.util.*;

public class CollectionsEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("김철수");
		list.add("영희");
		list.add("홍수");
		list.add("이하영");
		
		System.out.println(list);
		//오름차순
//		Collections.sort(list);
		//내림차순
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
		//set -> list로 형변환
		//1. 메소드 확인 2. 생성자로 생성하기
		List<Integer> setTolist = new ArrayList<Integer>(set);
		Collections.sort(setTolist);
		for(int s : setTolist) {
			System.out.println(s);
		}
		
		//Map에 있는것 sort하기
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", new Integer(100));
		map.put("v", new Integer(80));
		map.put("d", new Integer(77));
		map.put("j", new Integer(14));
		//Map을 list로 변경
		//1. 메소드 확인 2. 생성자로 생성하기
		//entrySet() -> getkey() -> 
		ArrayList list3 = new ArrayList(map.values()); //방법2
		Collections.sort(list3);
		System.out.println(list3);
		
		// 사용예3 역순으로 정렬하기 - Collections.sort(list, Collections.reverseOrder());
		String[] exam = { "Nice", "to", "meet", "you"};
		List<String> list4 = Arrays.asList(exam); // 배열을 리스트로 변환
		Collections.sort(list4, Collections.reverseOrder()); // 리스트 역순정렬
		System.out.println(list4);
	}

}
