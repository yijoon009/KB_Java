package classTest02;

import java.util.Scanner;

public class CompanyA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program pr = new Program();
		int choice=0;
		
		while(true) {
			System.out.println("1. 입력\n2. 출력\n3.종료");
			choice = sc.nextInt();
			if(choice==1) {
				pr.input();
			}else if(choice==2) {
				
			}else {
				System.out.println("좋은 하루!!");
				break;
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
