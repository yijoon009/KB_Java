package programm;

import java.util.HashMap;
import java.util.Scanner;


public class Score {
	int person;
	Scanner sc;
	HashMap<Integer, Student> stu;
	int num=0;
	
	Score(){
		sc = new Scanner(System.in);
		stu = new HashMap<Integer,Student>();
	}
	
	public void Input(Student st) {
		sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		st.setName(name);
		
		System.out.println("중간고사 성적을 입력하세요: ");
		int s1 = sc.nextInt();
		st.setS1(s1);
		
		System.out.println("기말고사 성적을 입력하세요: ");
		int s2 = sc.nextInt();
		st.setS2(s2);
		
		st.setSum(s1, s2);

	
	
	}
}
