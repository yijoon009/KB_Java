package set.hashSet;

import java.util.*;

public class HashSetEx02 {

	public static void main(String[] args) {
		//배열 값 넣기 - 자료형 다양한 것
		Object[] objArr = {1, 1.1, "a", 'a', true, "a", 1};
		
		//objArr 배열의 자료를 HashSet에 넣기
		HashSet hashset = new HashSet(Arrays.asList(objArr));
		
//		HashSet<Object>	hs = new HashSet<>();
//		for(int i=0;i<objArr.length;i++) {
//			hs.add(objArr[i]);
//		}
		
		//출력하기
		Iterator<Object> iter = hashset.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
	}

}
