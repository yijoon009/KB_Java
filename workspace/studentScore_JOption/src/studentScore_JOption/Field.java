package studentScore_JOption;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Field {
	Account[] acAr = new Account[20];
	WrongInputException wi = new WrongInputException();
	Account ac = new Account();
	Matcher m;
	
	public void setUser() throws AuthenticationException_mine{
		boolean id = true, pw = true;
		
		do {
			String input = JOptionPane.showInputDialog("아이디를 입력해주세요. (8자 이내, 영문만 가능)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "아이디를 입력해주시길 바랍니다.");
				continue;
			}
			if(input.length()>=8) {
				JOptionPane.showMessageDialog(null, "8자 이내로 입력해주시길 바랍니다.");
				continue;
			}
			Pattern p = Pattern.compile("[0-9]");
			m = p.matcher(input);
			if(m.find()) {
				JOptionPane.showMessageDialog(null, "아이디는 영문으로만 입력해야 합니다.");
			}else {
				id = false;
			}
		}while(id);
		do {
			String input = JOptionPane.showInputDialog("비밀먼호를 입력해주세요. (숫자만 가능)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력해주시길 바랍니다.");
				continue;
			}
			Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
			m = p.matcher(input);
			if(m.find()) {
				JOptionPane.showMessageDialog(null, "비밀번호는 숫자로만 입력해야 합니다.");
			}else {
				pw = false;
			}
		}while(pw);
		
		
		
		
//		boolean id_check = true, pw_check = true;
//		try {
//			Account acc = new Account();
//			
//			
//			do {
//				try {
//					String id = JOptionPane.showInputDialog("ID를 입력해주세요. (영어 + 숫자 조합)");
//					acc.setId(id);
//					wi.id_pwCheck(acc.getId());
//					id_check = false;
//				} catch (Exception e) {
//					JOptionPane.showMessageDialog(null, e);
//				}
//			}while(id_check);
//			do {
//				try {
//					String pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요. (영어 + 숫자 조합)")
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//			}while(pw_check);
//		} catch (Exception e1) {
//			JOptionPane.showMessageDialog(null, e1);
//		}
		
	}
	
}
