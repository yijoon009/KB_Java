package studentScore_JOption;

import javax.swing.JOptionPane;

public class Main  {
	public static void main(String[] args) throws AuthenticationException_mine{
		
		
		Field f = new Field();
		
		int choice = 0;
		
		String[] menu = {"회원가입", "로그인"};
		
		while(true) {
				
			choice = JOptionPane.showOptionDialog(null, "학생관리 프로그램을 시작합니다.\n 새로운 사용자는 [회원가입]을, 기존 사용자는 [로그인]을 눌러주세요.", "학생관리 프로그램", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, null, menu, null);
		
			if(choice== -1) System.exit(0);;
			switch(choice) {
			case 0://회원가입
				f.setUser();
				break;
			case 1://로그인
				f.login();
				break;
			}//end switch
		}//end while
		
	}//end main
	
}
