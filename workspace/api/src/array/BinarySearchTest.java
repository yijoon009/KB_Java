package array;

import java.util.Arrays;

public class BinarySearchTest {
	public static void main(String[] args) {
		/*
		 * sort�� ���� ������ ��
		 *  - �������� ���� ��, ���� ���� ���� ���̶� �ٷ� sort�� �������� ��
		 *  - Member��(��ü)�� ���, ��ȣ(int), �̸�(String), ��ȣ(String)�� �������� sort���� ����
		 *    �̸� Member Ŭ���� �ȿ��� compareTo �޼ҵ带 ���� ������ ������� �Ѵ�.
		 *    (String�� ���) return tel.compareTo(o.tel);
		 *    (int�� ���) return Integer.compare(sno, o.sno);
		 *    
		 *    */		
		
		
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
//		int index = Arrays.binarySearch(scores, 97);
//		System.out.println("ã�� �ڷ��� index�� "+index);
//		System.out.println(scores[index]);
		
		try {
			int index = Arrays.binarySearch(scores, 100);
			System.out.println("ã�� �ڷ��� index�� "+index);
			System.out.println(scores[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ã�� �ڷ� ����");
		}
		
		
		String[] name = {"ȫ�浿","�ڵ���", "��μ�"};
		Arrays.sort(name);
		
		Member m1 = new Member(3, "ȫ�浿", "1101");
		Member m2 = new Member(5, "��浿", "1241");
		Member m3 = new Member(17, "�ڱ浿", "2101");
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