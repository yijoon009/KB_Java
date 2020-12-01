package kookbi;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.util.Map.Entry;

public class StudentManagements_Joption{

	Scanner sc = new Scanner(System.in);
	final public int SUBJECTS = 3;
	String arSubjects[] = {
			"C���", "JAVA", "Spring", "���"
	};
	ArrayList<Integer> arScores = null;
	LinkedHashMap<Students, ArrayList<Integer>> StudentsBook = new LinkedHashMap<>();
	ImageIcon mainImg = new ImageIcon("src/img/giphy.gif");
	ImageIcon insertImg = new ImageIcon("src/img/insert.gif");
	ImageIcon updateImg = new ImageIcon("src/img/source.gif");
	
	int choice;
	
	public void studentView () {
		String menu [] = {"�л��� ���", "�л��� �˻�", "�л��� ����", "�л��� ����", "�л��� ��ȸ", "���л� ��ȸ", "����� ����� ��ȸ", "��������"};
		
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���̿� ���Ű��� ȯ���մϴ�]\n"
					+ "�Ʒ��� �޴��� �����Ͽ� �л����� �������ּ��� :)", "�л��� ���� Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, mainImg, menu, null);
			if (choice == -1|| choice == 7) break;
			
			switch (choice) {
			case 0:
				insert();
				break;
			case 1:
				search();
				break;
			case 2:
				delete();
				break;
			case 3:
				update();
				break;
			case 4:
				list (StudentsBook);
				break;
			case 5:
				list_scholarship(StudentsBook);
				break;
			case 6:
				list_fail_students(StudentsBook);
				break;
			case 7: 
				break;
			}
		} 
	}
	//�Է� �޼ҵ�
	void insert () {
		boolean check = true;
		while (check) {
			String [] yesOrno = {"YES", "NO"};
			
			choice = JOptionPane.showOptionDialog(null, "��[�л��� ���]�� \n�л� ����� �����Ͻðڽ��ϱ�?", "�л��� ���", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, insertImg, yesOrno, null);
			
			boolean flag = false;
			if (choice == -1) break;
			switch (choice) {
			case 0 :
				String name = JOptionPane.showInputDialog("����� �л� �̸��� �����ּ���");
				int age;
				
				try {
					age = Integer.parseInt(JOptionPane.showInputDialog(name + "�л��� ���̸� �Է����ּ���"));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
					break;
				}
				
				int total= 0, avg = 0;
				int c_score = 0, java_score = 0, spring_score = 0;
				arScores = new ArrayList<>();
				try {
					c_score = Integer.parseInt(JOptionPane.showInputDialog(name + " �л��� C��� ������ �Է����ּ���"));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
					break;
				}
				if(c_score < 0 || c_score > 100) {
					JOptionPane.showMessageDialog(null, "������ 0������ 100�� �����Դϴ�.");
					break;
				}
				
				try {
					java_score = Integer.parseInt(JOptionPane.showInputDialog(name + " �л��� JAVA ������ �Է����ּ���"));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
					break;
				}
				if(java_score < 0 || java_score > 100) {
					JOptionPane.showMessageDialog(null, "������ 0������ 100�� �����Դϴ�.");
					break;
				}
				
				try {
					spring_score = Integer.parseInt(JOptionPane.showInputDialog(name + " �л��� Spring ������ �Է����ּ���"));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
					break;
				}
				if(spring_score < 0 || spring_score > 100) {
					JOptionPane.showMessageDialog(null, "������ 0������ 100�� �����Դϴ�.");
					break;
				}
				arScores.add(c_score);
				arScores.add(java_score);
				arScores.add(spring_score);
				
				Students std = new Students(name, age);
			
				//������� ���
				for (int j = 0; j < SUBJECTS; j++) {
					total +=arScores.get(j);
				}
				avg = (total / SUBJECTS);
				arScores.add(avg);
				StudentsBook.put(std, arScores);
				JOptionPane.showMessageDialog(null, name + "�л��� ������ �ԷµǾ����ϴ�.");
				list(StudentsBook);
				continue;
				
			case 1 : 
				JOptionPane.showMessageDialog(null, "�л� ����� ����մϴ�.");
				check = false;
				break;
			}
		}
	}
	
	void search () {
		Iterator<Students> iter = StudentsBook.keySet().iterator();
		if (StudentsBook.size() ==0 ) {
			JOptionPane.showMessageDialog(null, "��ϵ� �л��� ������ �ϳ��� �����ϴ�.");
			return;
		}
		String name = JOptionPane.showInputDialog("��[�л� �˻�]��"
				+ "\n�˻��� �л��� �̸��� ���ּ���.");
		String result = "";
		
		while(iter.hasNext()) {
			Students std = iter.next();
			if(name.equals(std.getName())) {
				
				result += "====[�˻� ���]====\n" + std.show()+"\n"
				+ arSubjects[0] + " : " + StudentsBook.get(std).get(0) + "�� "
				+ arSubjects[1] + " : " + StudentsBook.get(std).get(1) + "�� "
				+ arSubjects[2] + " : " + StudentsBook.get(std).get(2) + "�� "
				+ arSubjects[3] + " : " + StudentsBook.get(std).get(3) + "��\n";
				
				if (StudentsBook.get(std).get(3) >= 85) {
					result += "\n�����մϴ�. " + name + "�л��� ���л��Դϴ�.";
				} else if (StudentsBook.get(std).get(3) <= 60) {
					result += "\n"+ name+ "�л��� ����� ������Դϴ�. �й��ϼ���.";
				} else {

				}
			}else {
				result += "�˻��� �л��� �����ϴ�.";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	void update () {
		boolean flag = false;
		if(!(StudentsBook.size() == 0))list(StudentsBook);
		int num = 0, choice = 0;
		String result = "";
		String [] updateMenu = {"�Ż����� ����", "���� ����"};
		Iterator<Students> iter = StudentsBook.keySet().iterator();
		while (iter.hasNext()) {
			num = Integer.parseInt(JOptionPane.showInputDialog("������ �л��� ��ȣ�� �Է����ּ���."));
			Students std = iter.next();
			if (num == std.getNumber()) {
				flag = true;
				choice = JOptionPane.showOptionDialog(null, "��[��������]�� \n" + std.getName() + "�л��� � ������ �����ϰڽ��ϱ�?", "�л��� ����", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, updateImg, updateMenu, null);
				switch (choice) {
				case 0 :
					JOptionPane.showMessageDialog(null, "[�Ż����� ����]"
							+ "\n�̸�, ���̸� ������� �Է��ϼ���.");
					std.setName(JOptionPane.showInputDialog("������ �̸��� �����ּ���"));
					try {
						std.setAge(Integer.parseInt(JOptionPane.showInputDialog("������ ���̸� �����ּ���")));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ��� \n�Է��� ����մϴ�.");
						break;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "�����Դϴ�. \n�Է��� ����մϴ�.");
						break;
					}
					JOptionPane.showMessageDialog(null, "�Ż����� ���� �Ϸ�");
					break;
				case 1: 
					int total = 0, avg = 0;
					int updateCScore = 0, updateJAVAScore =0, updateSpringScore =0;
					JOptionPane.showMessageDialog(null, "[���� ����] \n�� ������ ������ ������ �Է����ּ���.");
					try {
						updateCScore = Integer.parseInt(JOptionPane.showInputDialog(std.getName() + " �л��� C��� ������ �Է����ּ���"));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
						break;
					}
					if(updateCScore < 0 || updateCScore > 100) {
						JOptionPane.showMessageDialog(null, "������ 0������ 100�� �����Դϴ�.");
						break;
					}
					
					try {
						updateJAVAScore = Integer.parseInt(JOptionPane.showInputDialog(std.getName() + " �л��� JAVA ������ �Է����ּ���"));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
						break;
					}
					if(updateJAVAScore < 0 || updateJAVAScore > 100) {
						JOptionPane.showMessageDialog(null, "������ 0������ 100�� �����Դϴ�.");
						break;
					}
					
					try {
						updateSpringScore = Integer.parseInt(JOptionPane.showInputDialog(std.getName() + " �л��� Spring ������ �Է����ּ���"));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "���ڷ� �Է����ּ���");
						break;
					}
					if(updateSpringScore < 0 || updateSpringScore > 100) {
						JOptionPane.showMessageDialog(null, "������ 0������ 100�� �����Դϴ�.");
						break;
					}
					
					StudentsBook.get(std).set(0, updateCScore);
					StudentsBook.get(std).set(1, updateJAVAScore);
					StudentsBook.get(std).set(2, updateSpringScore);
					
					for (int j = 0; j < SUBJECTS; j++) {
						total +=StudentsBook.get(std).get(j);
					}
					avg = (total / SUBJECTS);
					StudentsBook.get(std).set(3, avg);
					JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�");
					break;
				default :
					flag = false;
					JOptionPane.showMessageDialog(null, "���� ����");
				}
			}
		}
		if (!flag) {
			JOptionPane.showMessageDialog(null, "������ �л��� ��ȣ�� �ٽ� Ȯ���� �ּ���");
		}
		if(!(StudentsBook.size() == 0))list(StudentsBook);
	}
	
	void delete () {
		int num = 0;
		if (StudentsBook.size() == 0) {
			JOptionPane.showMessageDialog(null, "��ϵ� �л��� �����ϴ�.");
			return;
		}
		Students delStd = null;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("��[�л��� ����]��"
					+ "\n������ �л��� ��ȣ�� �Է����ּ��� : "));
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "��ȣ�� �Է����ּ���");
			return;
		}
		Iterator<Students> iter = StudentsBook.keySet().iterator();
		while (iter.hasNext()) {
			Students std = iter.next();
			if (num == std.getNumber()) {
				delStd =std;
			}
		}
		if(delStd == null) {
			JOptionPane.showMessageDialog(null, "ã�� �л��� �����ϴ�. �ٽ� �й��� Ȯ�����ּ���");
		}else {
			StudentsBook.remove(delStd);
			JOptionPane.showMessageDialog(null, "�ش� ��ȣ�� �л��� ���� �Ǿ����ϴ�.");
			if (!(StudentsBook.size() == 0)) {
				list(StudentsBook);
			}
		}
	}
	
	void list (LinkedHashMap<Students, ArrayList<Integer>> book) {
		Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
		int size = StudentsBook.size();
		String result = "��[�ڸ��� IT ��ī���� �л�]��\n";
		if (size == 0) {
			JOptionPane.showMessageDialog(null, "��ϵ� �л��� �����ϴ�. �ٽ� Ȯ�����ּ���.");
			return;
		}else {
			while (iter.hasNext()) {
				Entry<Students, ArrayList<Integer>> temp = iter.next();
				result += temp.getKey().show() + "\n";
				result += "|  C���  |  JAVA  |  Spring  |  ���  | \n";
				for (int score : temp.getValue()) {
					result += "      "+ score + "�� ";
				}
				result += "\n";
			}
			JOptionPane.showMessageDialog(null, result);
		}
	}
	
	void list_scholarship (LinkedHashMap<Students, ArrayList<Integer>> book) {
		Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
		int size = StudentsBook.size();
		int avg = 0;
		boolean flag = false;
		String result = "";
		if (size == 0)  {
			result += "��ϵ� �л��� �����ϴ�. �ٽ� Ȯ�����ּ���.";
			return;
		}else {
			result += "��[�ڸ��� IT ��ī���� ���л�]��"
					+ "\n(���л��� ������� 85�� �̻��� �л����Դϴ�.)";
			while (iter.hasNext()) {
				Entry<Students, ArrayList<Integer>> std = iter.next();
				avg = std.getValue().get(3);
				if (avg >= 85) {
					result += "�����л� : " + std.getKey().getName()+"��";
					flag = true;
				}
			}
		}
		if (!flag) {
			result += "���л��� �����ϴ�.\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	void list_fail_students (LinkedHashMap<Students, ArrayList<Integer>> book) {
		Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
		int size = StudentsBook.size();
		int avg = 0;
		String result = "";
		boolean flag = false;
		if (size == 0) {
			result = "��ϵ� �л��� �����ϴ�. �ٽ� Ȯ�����ּ���.";
		}else {
			result += "��[����� �����]��"
					+ "\n(����� ����ڴ� ������� 60�� �Ʒ��� �л����Դϴ�.)";
			while (iter.hasNext()) {
				Entry<Students, ArrayList<Integer>> std = iter.next();
				avg = std.getValue().get(3);
				if (avg <= 60) {
					result += "������� ����� : " + std.getKey().getName()+"��";
					flag = true;
				}
			}
		}
		if (!flag) {
			result += "����� ����ڴ� �����ϴ�.\n";
		}
		JOptionPane.showMessageDialog(null, result);
		
	}
}