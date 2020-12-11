package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List al = new ArrayList();	//객체생성 다형성
		
		//값 넣기 - 정수 10, 20, 30
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(new Integer(30));
	}
}	
