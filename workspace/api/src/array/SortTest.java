package array;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] scores = {99,98,87,100};
		Arrays.sort(scores);
		for(int score : scores) {
			System.out.println(score);
		}
		
		Member1 m1 = new Member1();
		m1.sname = "rla";
		m1.sno = 10;
		m1.stel = "110-22";
		
		
		
	}
}

class Member1 implements Comparable<Member>{
	int sno;
	String sname;
	String stel;
	
	public Member1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Member1(int sno, String sname, String stel) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.stel = stel;
	}



	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
	}



}