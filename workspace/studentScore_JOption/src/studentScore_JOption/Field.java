package studentScore_JOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Field {
	ArrayList<Account> acList = new ArrayList<>();
	ArrayList<Student> stuList = new ArrayList<>();
	Map<ArrayList<Account>,ArrayList<Student>> dataBase = new HashMap<>();
	Account ac;
	Student st;
	
	Matcher m;
	
	//���� ùȭ�� (ȸ������, �α���)
	public void startView() {
		int choice = 0;
		String[] menu = {"ȸ������", "�α���"};
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "�л����� ���α׷��� �����մϴ�.\n ���ο� ����ڴ� [ȸ������]��, ���� ����ڴ� [�α���]�� �����ּ���.", "�л����� ���α׷�", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, null, menu, null);
			if(choice== -1) System.exit(0);
			switch(choice) {
			case 0://ȸ������
				setUser();
				break;
			case 1://�α���
				login();
				break;
			}//end switch
		}//end while
	}
	
	//ȸ������
	public void setUser() {
		boolean id = true, pw = true, data = true, schoolCh = true, gradeCh = true, classCh = true;
		
		//ȸ������id
		do {
			String input = JOptionPane.showInputDialog("���̵� �Է����ּ���. (�������� ����, 8�� �̳� (���� ����  ����)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "���̵� �Է����ֽñ� �ٶ��ϴ�.");
				continue;
			}else if(input.length()>=8) {
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
							JOptionPane.showMessageDialog(null, "�̹� �����ϴ� ID�Դϴ�.");
						}else {
							ac = new Account();
							ac.setId(input);
							id = false;
						}
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "���̵�� ���� (���� ���� ����)���θ� �Է��ؾ� �մϴ�.");
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
			do{
				String school = JOptionPane.showInputDialog("�б����� �Է��ϼ���. (�ѱ�, ������ ����)");
				if(school.length()==0) {
					JOptionPane.showMessageDialog(null, "�б����� �Է��ϼ���.");
				}else if(!school.matches("^[0-9]$")) {
					ac.setSchool(school);
					schoolCh = false;
				}else {
					JOptionPane.showMessageDialog(null, "�б����� �ѱ�, �������θ� �Է� �����մϴ�.");
				}
			}while(schoolCh);
			
			do {
				String grade = JOptionPane.showInputDialog("�г��� �Է��ϼ���. (���ڸ� ����)");
				if(grade.length()==0) {
					JOptionPane.showMessageDialog(null, "�г��� �Է��ϼ���.");
				}else if(grade.matches("^[0-9]+$")){
					ac.setGrade(grade);
					gradeCh = false;
				}
			}while(gradeCh);

			do {
				String class_name = JOptionPane.showInputDialog("���� �Է��ϼ���.");
				if(class_name.length() == 0) {
					JOptionPane.showMessageDialog(null, "���� �Է��ϼ���.");
				}else {
					ac.setClass_name(class_name);
					classCh = false;
				}
			}while(classCh);
			data = false;
		}while(data);
		
		acList.add(ac);
		
	}//end setUser
	
	//�α���
	public void login() {
		boolean lg2 = true;
		Account user = null;
		
		//id check
		while(true) {
			String id = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
			for(Account data : acList) {
				if(id.equals(data.getId())) {
					//id���� pass
					do {
						String pw = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
						if(pw.equals(data.getPw())) {
							user = data;
							lg2 = false;
							menuView(user);
						}else {
							JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �õ����ּ���.");
						}
					}while(lg2);
				}else {
					//�´� id �ƴµ� �� �Ϸε���?
					JOptionPane.showMessageDialog(null, "�������� �ʴ� ID�ų�, Ʋ�� ID�Դϴ�.");
					continue;	//???
				}
			}
		}
	}//end login
		
	//�α��� ������ �޴� �����ֱ�
	public void menuView(Account user) {
		String[] menu = {"�Է�","����","���","����","����","�α׾ƿ�"};
		int act = 0;
		String introMsg = "�ĢĢĢĢĢĢ��л� ���� ���� ���α׷��ŢŢŢŢŢŢ�\n"+"�б� : " +user.getSchool()+"     �г� : "+user.getGrade()+"     �� : "+user.getClass_name();
		
		while(true){
			act = JOptionPane.showOptionDialog(null, introMsg + "\n������ ����� �������ּ���.", "�л����� ���α׷�",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, null);
			
			if(act==-1) System.exit(0);
			switch(act) {
			case 0://�Է�
				input(user);
				break;
			case 1://����
				delete();
				break;
			case 2://���
				show(user);
				break;
			case 3://����
				break;
			case 4:
				System.exit(0);
			case 5:
				startView();
			}
		}
	
	}
	
	//�л������Է�
	public void input(Account user) {
		String introMsg = "�ĢĢĢĢĢĢ��л� ���� ���� ���α׷��ŢŢŢŢŢŢ�\n"+"�б� : " +user.getSchool()+"     �г� : "+user.getGrade()+"     �� : "+user.getClass_name();

		boolean input = true, nameCh=true, s1Ch = true, s2Ch = true;
		do {
			//�л��̸� �Է�
			do{
				String name = JOptionPane.showInputDialog(introMsg + "\n\n�л� �̸��� �Է��ϼ���");
				if(name.length()==0) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է��� �ֽñ� �ٶ��ϴ�.");
				}else if(name.matches("^[��-�R]{2,5}$")) {
					st = new Student();
					st.setName(name);
					nameCh = false;
				}else {
					JOptionPane.showMessageDialog(null, "�̸��� �ѱ۷θ� �ۼ����ּ���.");
				}
			}while(nameCh);
			
			//�߰���� �Է�
			do {
				String s1 = JOptionPane.showInputDialog(introMsg + "\n\n�߰���� ������ �Է��ϼ���.");
				if(!s1.matches("^[0-9]$")) {
					st.setMid(Integer.parseInt(s1));
					s1Ch = false;
				}else {
					JOptionPane.showMessageDialog(null, "���ڸ� �Է��ϼ���.");
				}
			}while(s1Ch);
			
			//�⸻��� �Է�
			do {
				String s2 = JOptionPane.showInputDialog(introMsg + "\n\n�⸻��� ������ �Է��ϼ���.");
				if(!s2.matches("^[0-9]$")) {
					st.setFin(Integer.parseInt(s2));
					s2Ch = false;
				}else {
					JOptionPane.showMessageDialog(null, "���ڸ� �Է��ϼ���.");
				}
			}while(s2Ch);
			
			st.setSum(st.getMid()+st.getFin());
			st.setAvg(st.getSum()/ 2.0);
			
			//��� ���ϱ�
//			for (int i = 0; i < stuList.size()-1; i++) {
//				if(st.getSum()>st.getSum()) {
//					st.setRank()++;
//					
//				}
//			}
			stuList.add(st);
			input = false;
		}while(input);
	}//end input
	
	//����
	public void delete() {
		
	}

	//���(��ó�� 
	public void show(Account user) {
		String introMsg = "�ĢĢĢĢĢĢ��л� ���� ���� ���α׷��ŢŢŢŢŢŢ�\n"+"�б� : " +user.getSchool()+"     �г� : "+user.getGrade()+"     �� : "+user.getClass_name()+"\n";
		JOptionPane.showMessageDialog(null, stuList.toString());
		
	}
}
















