package studentScore_JOption;

import javax.swing.JOptionPane;

public class Main  {
	public static void main(String[] args) throws AuthenticationException_mine{
		
		
		Field f = new Field();
		
		int choice = 0;
		
		String[] menu = {"ȸ������", "�α���"};
		choice = JOptionPane.showOptionDialog(null, "�л����� ���α׷��� �����մϴ�.\n ���� �̿��ڸ� [�α���], ���ο� �̿��ڴ� [ȸ������]�� �����ּ���.", "�л����� ���α׷�", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, null, menu, null);
	
		if(choice== -1) System.exit(0);;
		switch(choice) {
		case 0://ȸ������
			f.setUser();
			break;
		case 1://�α���
			break;
		}
		
	}
	
}