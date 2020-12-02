package array;

import java.util.Arrays;

public class BinarySearchTest {
	public static void main(String[] args) {
		/*
		 * sort를 쓸때 주의할 점
		 *  - 정수형만 있을 때, 비교할 값이 정수 뿐이라 바로 sort로 정수형을 비교
		 *  - Member형(객체)일 경우, 번호(int), 이름(String), 번호(String)중 무엇으로 sort할지 몰라서
		 *    미리 Member 클래스 안에서 compareTo 메소드를 통해 기준을 정해줘야 한다.
		 *    (String일 경우) return tel.compareTo(o.tel);
		 *    (int일 경우) return Integer.compare(sno, o.sno);
		 *    
		 *    */		
		
		
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
//		int index = Arrays.binarySearch(scores, 97);
//		System.out.println("찾는 자료의 index는 "+index);
//		System.out.println(scores[index]);
		
		try {
			int index = Arrays.binarySearch(scores, 100);
			System.out.println("찾는 자료의 index는 "+index);
			System.out.println(scores[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("찾는 자료 없음");
		}
		
		
		String[] name = {"홍길동","박동수", "김민수"};
		Arrays.sort(name);
		
		Member m1 = new Member(3, "홍길동", "1101");
		Member m2 = new Member(5, "김길동", "1241");
		Member m3 = new Member(17, "박길동", "2101");
		Member[] member = {m1, m2, m3};
		Arrays.sort(member);
		int index=0;
		try {
			index = Arrays.binarySearch(member, "2101");
		} catch (Exception e) {
			System.out.println(index);
		} 
		
		
	}
}
class Member implements Comparable<Member>{
	int sno;
	String name;
	String tel;
	
	public Member() {;}

	
	public Member(int sno, String name, String tel) {
		super();
		this.sno = sno;
		this.name = name;
		this.tel = tel;
	}


	@Override
	public int compareTo(Member o) {
//		return Integer.compare(sno, o.sno);
		return tel.compareTo(o.tel);

	}
	
	
}