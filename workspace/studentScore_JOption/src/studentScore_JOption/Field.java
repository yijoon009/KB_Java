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
			String input = JOptionPane.showInputDialog("���̵� �Է����ּ���. (8�� �̳�, ������ ����)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "���̵� �Է����ֽñ� �ٶ��ϴ�.");
				continue;
			}
			if(input.length()>=8) {
				JOptionPane.showMessageDialog(null, "8�� �̳��� �Է����ֽñ� �ٶ��ϴ�.");
				continue;
			}
			Pattern p = Pattern.compile("[0-9]");
			m = p.matcher(input);
			if(m.find()) {
				JOptionPane.showMessageDialog(null, "���̵�� �������θ� �Է��ؾ� �մϴ�.");
			}else {
				id = false;
			}
		}while(id);
		do {
			String input = JOptionPane.showInputDialog("��и�ȣ�� �Է����ּ���. (���ڸ� ����)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ֽñ� �ٶ��ϴ�.");
				continue;
			}
			Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
			m = p.matcher(input);
			if(m.find()) {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� ���ڷθ� �Է��ؾ� �մϴ�.");
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
//					String id = JOptionPane.showInputDialog("ID�� �Է����ּ���. (���� + ���� ����)");
//					acc.setId(id);
//					wi.id_pwCheck(acc.getId());
//					id_check = false;
//				} catch (Exception e) {
//					JOptionPane.showMessageDialog(null, e);
//				}
//			}while(id_check);
//			do {
//				try {
//					String pw = JOptionPane.showInputDialog("��й�ȣ�� �Է����ּ���. (���� + ���� ����)")
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//			}while(pw_check);
//		} catch (Exception e1) {
//			JOptionPane.showMessageDialog(null, e1);
//		}
		
	}
	
}
