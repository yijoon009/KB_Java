package inheritence_2;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	int choice;
	String subject;
	School[] schAr = new School[10];
	
	public void inputScore() {
		while(true) {
			System.out.print("1. �ʵ�� 2. �ߵ�� 3. ���� -> ");
			choice = sc.nextInt();
			System.out.println("������ �Է��ϼ���. ->");
			subject = sc.next();
			if(choice==1) {
				School s = new Elementary();
				inputElementary(s);
				s.subName = subject;
			}
		}
	}//end inputScore
	
	public void inputElementary(School s) {
		System.out.println("�߰�, �⸻, ������ ������ ������� �Է��ϼ���. ->");
		s.mid = sc.nextInt();
		s.fin = sc.nextInt();
		s.suhang = sc.nextInt();
	}//end inputElementary
	
	public void inputMid_High(School s2) {
		System.out.println("���Ӽ����� ������ �Է��ϼ���. -> ");
		s2.teacher = sc.next();
		System.out.println("�߰�, �⸻, ������, �⼮, ���������� ������� �Է��ϼ���. -> ");
		s2.mid = sc.nextInt();
		s2.fin = sc.nextInt();
		s2.suhang = sc.nextInt();
		s2.attend = sc.nextInt();
		s2.service = sc.nextInt();
	}//end inputMid_High
	
	
}
