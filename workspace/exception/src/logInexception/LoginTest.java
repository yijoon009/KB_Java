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
			System.out.println("5�� �� �ڵ��α׾ƿ� �մϴ�.");
		}
	}
	
	private static void login() throws NotExistIDException, WarningPasswordException {
		if(!id.equals("admin")) {
			//���� �߻���Ű��
			throw new NotExistIDException("���ܹ߻� ���ܹ߻� ���̵� Ʋ�Ƚ��ϴ�.");
		}
		if(!password.equals("admin1234")) {
			throw new WarningPasswordException("��й�ȣ Ʋ�Ƚ��ϴ�. ");
		}
	}
	
	private static void input() {
		System.out.print("���̵�� ");
	    id = sc.next();
	    System.out.print("��й�ȣ��");
	    password = sc.next();
	}
}
