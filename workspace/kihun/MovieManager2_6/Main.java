package MovieManager2_6;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws AuthenException {
		
		Scanner sc = new Scanner(System.in);
		
		Account au = new Account();
		
		int ch = 0;
		
		while(true) {
			do {
				System.out.println("---------------------------------------------------------");
				System.out.println("1.입력 |2.수정 |3. 회원탈퇴 |4. 회원전체출력 |5.아이디 검색"
						+ " |6.종료   |");
				System.out.println("---------------------------------------------------------");
				System.out.print("> ");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 6 );
			
			switch(ch) {
			case 1: au.insert(); break;
			case 2: au.update(); break;
			case 3: au.delete(); break;
			case 4: au.selectAll(); break;
			case 5: au.searchId();break;
			case 6: DBConn.close(); System.exit(0);
			}
			
			
		}
		
		
	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
