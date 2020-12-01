package inheritence_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Business bs = new Business();
		int act = 0;
		
		
		
		while(true) {
			System.out.print("1. 입력 2. 출력 3. 종료 ->");
			act = sc.nextInt();
			switch(act) {
			case 1:
				bs.inputScore();
				break;
			case 2:
				System.out.println(bs.printScore(bs.schAr));
				break;
			case 3:
				System.exit(0);
			}
		}
	
	
	
	
	
	
	
	
	}

}
