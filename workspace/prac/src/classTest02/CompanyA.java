package classTest02;

import java.util.Scanner;

public class CompanyA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program pr = new Program();
		int choice=0;
		
		while(true) {
			System.out.println("1. �Է�\n2. ���\n3.����");
			choice = sc.nextInt();
			if(choice==1) {
				pr.input();
			}else if(choice==2) {
				
			}else {
				System.out.println("���� �Ϸ�!!");
				break;
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
