package logInexception;

import java.util.Scanner;

public class LoginTest {
	static String id;
	static String password;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			input();
			login();
		} catch (NotExistIDException | WarningPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("5초 후 자동로그아웃 합니다.");
		}
	}
	
	private static void login() throws NotExistIDException, WarningPasswordException {
		if(!id.equals("admin")) {
			//예외 발생시키기
			throw new NotExistIDException("예외발생 예외발생 아이디가 틀렸습니다.");
		}
		if(!password.equals("admin1234")) {
			throw new WarningPasswordException("비밀번호 틀렸습니다. ");
		}
	}
	
	private static void input() {
		System.out.print("아이디는 ");
	    id = sc.next();
	    System.out.print("비밀번호는");
	    password = sc.next();
	}
}
