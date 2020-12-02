
import java.util.Scanner;

// 핸드폰 매장 신규회원 클래스 생성, 
// 속성 기능을 구분해서 클래스 만들기
	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		AccountMethod am = new AccountMethod();
		
		int act;
		while ( true ) {
			try {
			do {
				System.out.println("**Welcome to, Hogu Phone Shop**");
				System.out.println("1.Sign Up Contract | 2. 점검중 ----");
				System.out.println("--------------------------------");
				act = sc.nextInt();
			} while(act < 1 && act > 4);
			switch(act) {
			case 1: am.contractCategory(); break;
			case 2: continue;
			case 3: continue;
			case 4: am.endSystem(); 
				}
			
			}catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		
	}

}
