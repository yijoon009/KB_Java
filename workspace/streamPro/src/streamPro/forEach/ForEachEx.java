package streamPro.forEach;

import java.util.*;
import java.util.stream.Stream;


public class ForEachEx {

	public static void main(String[] args) {
		
		//반복자 iterator
		List<String> list = Arrays.asList("홍길동","김자바","박하");
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		
		//반복자 forEach()
		List<String> list2 = Arrays.asList("이순신","장영길","박하");
		Stream<String> str = list2.stream();
		str.forEach(name->System.out.println(name));
		
		
		
		
		
		
	}

}
