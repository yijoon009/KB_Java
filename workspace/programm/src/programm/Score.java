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
		
		System.out.println("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		st.setName(name);
		
		System.out.println("�߰���� ������ �Է��ϼ���: ");
		int s1 = sc.nextInt();
		st.setS1(s1);
		
		System.out.println("�⸻��� ������ �Է��ϼ���: ");
		int s2 = sc.nextInt();
		st.setS2(s2);
		
		st.setSum(s1, s2);

	
	
	}
}
