package set.hashSet;

import java.util.*;

public class HashSetEx02 {

	public static void main(String[] args) {
		//�迭 �� �ֱ� - �ڷ��� �پ��� ��
		Object[] objArr = {1, 1.1, "a", 'a', true, "a", 1};
		
		//objArr �迭�� �ڷḦ HashSet�� �ֱ�
		HashSet hashset = new HashSet(Arrays.asList(objArr));
		
//		HashSet<Object>	hs = new HashSet<>();
//		for(int i=0;i<objArr.length;i++) {
//			hs.add(objArr[i]);
//		}
		
		//����ϱ�
		Iterator<Object> iter = hashset.iterator();
		while(iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o);
		}
	}

}
