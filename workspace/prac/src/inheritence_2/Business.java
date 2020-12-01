package inheritence_2;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	int choice;
	String subject;
	School[] schAr = new School[10];
	
	public void inputScore() {
		while(true) {
			System.out.print("1. 초등부 2. 중등부 3. 고등부 -> ");
			choice = sc.nextInt();
			System.out.println("과목을 입력하세요. ->");
			subject = sc.next();
			if(choice==1) {
				School s = new Elementary();
				inputElementary(s);
				s.subName = subject;
			}
		}
	}//end inputScore
	
	public void inputElementary(School s) {
		System.out.println("중간, 기말, 수행평가 점수를 순서대로 입력하세요. ->");
		s.mid = sc.nextInt();
		s.fin = sc.nextInt();
		s.suhang = sc.nextInt();
	}//end inputElementary
	
	public void inputMid_High(School s2) {
		System.out.println("담임선생님 성함을 입력하세요. -> ");
		s2.teacher = sc.next();
		System.out.println("중간, 기말, 수행평가, 출석, 봉사점수를 순서대로 입력하세요. -> ");
		s2.mid = sc.nextInt();
		s2.fin = sc.nextInt();
		s2.suhang = sc.nextInt();
		s2.attend = sc.nextInt();
		s2.service = sc.nextInt();
	}//end inputMid_High
	
	
}
