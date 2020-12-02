package studentScore_JOption;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Field {
	ArrayList<Account> acList = new ArrayList<>();
	WrongInputException wi = new WrongInputException();
	Account ac;
	Student st = new Student();
	
	Matcher m;
	int cnt;
	
	//ȸ������
	public void setUser() throws AuthenticationException_mine{
		
		boolean id = true, pw = true, data = true;
		
		//ȸ������id
		do {
//			
			String input = JOptionPane.showInputDialog("���̵� �Է����ּ���. (8�� �̳�, ���� + ���� ����  ����)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "���̵� �Է����ֽñ� �ٶ��ϴ�.");
				continue;
			}
			if(input.length()>=8) {
				JOptionPane.showMessageDialog(null, "8�� �̳��� �Է����ֽñ� �ٶ��ϴ�.");
				continue;
			}
			if(input.matches("^[a-zA-Z]{1}[a-zA-Z0-9]+$")) {
				//ù ȸ�������� ���, �ߺ��˻� �ʿ� ����
				if(acList.size()==0) {
					ac = new Account();
					ac.setId(input);
					id = false;
				}else {
					//id�ߺ��˻�
					for(Account alid : acList) {
						if((input.equals(alid.getId()))){
							//					if((user.getId()).equals(input)){
							JOptionPane.showMessageDialog(null, "�̹� �����ϴ� ID�Դϴ�.");
						}else {
							ac = new Account();
							ac.setId(input);
							id = false;
						}
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "���̵�� ���� (���� ����)���θ� �Է��ؾ� �մϴ�.");
			}
		}while(id);
		
		//ȸ������pw
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
				ac.setPw(input);
				pw = false;
			}
		}while(pw);
		
		//ùȭ�� �б�,�г�,�� �Է�
		do {
			//���� �б��� ��ȿ���˻� ����.
			ac.setSchool(JOptionPane.showInputDialog("�б� �̸��� �Է��ϼ���."));
			ac.setClass_name(JOptionPane.showInputDialog("���� �Է��ϼ���."));
			ac.setGrade(JOptionPane.showInputDialog("�г��� �Է��ϼ���."));
			data = false;
		}while(data);
		
		acList.add(ac);
		
	}//end setUser
	
	//�α���
	public void login() {
		String id = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
		for(Account data : acList) {
			if(id.equals(data.getId())) {
				String pw = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
				if(pw.equals(data.getPw())) {
					input();
				}
			}
		}
	}//end login
	
	//�л������Է�
	public void input() {
		String name = JOptionPane.showInputDialog("�л� �̸��� �Է��ϼ���");
		if(name.length()==0) {
			JOptionPane.showMessageDialog(null, "�̸��� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
		if(name.matches("^[��-�R]{2,4}$")) {
			
		}
	}//end input
}
















