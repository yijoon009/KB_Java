package kookbi;

//2020.11.04 ���

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
public class Backup_Managements {
		Scanner sc = new Scanner(System.in);
		final public int SUBJECTS = 3;
//		ArrayList<Students> arStudents = null;
		ArrayList<Integer> arScores = null;
		LinkedHashMap<Students, ArrayList<Integer>> StudentsBook = new LinkedHashMap<>();
		
		public void view () {
			int choice = 0;
			do {
				System.out.println("<�ڸ��� IT ��ī���� �л��� ���� �ý���>"
						+ "\n1. �л��� ���"
						+ "\n2. �л��� �˻�"
						+ "\n3. �л��� ����"
						+ "\n4. �л��� ����"
						+ "\n5. �л��� ��ȸ"
						+ "\n6. ���л� ��ȸ"
						+ "\n7. ����� ����� ��ȸ"
						+ "\n8. �ý��� ����");
				System.out.print("\n����Ͻ� �޴��� ��ȣ �Է� : ");
				try {
					choice = sc.nextInt();
				} catch (Exception e) {
					System.out.println("���ڸ� 1~8������ �Է����ּ���.");
					break;
				}
				sc.nextLine();
				
				if (choice == 8) break;
				switch (choice) {
				case 1:
					insert();
					break;
				case 2:
					search();
					break;
				case 3:
					delete();
					break;
				case 4:
					update();
					break;
				case 5:
					list (StudentsBook);
					break;
				case 6:
					list_scholarship(StudentsBook);
					break;
				case 7:
					list_fail_students(StudentsBook);
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} while(true) ;
		}
		
		void insert () {
			while (true) {
				System.out.print("��[�л��� ���]��"
						+ "\n�л� ����� �����Ͻðڽ��ϱ�? (y/n) : ");
				String choice = "";
				choice = sc.nextLine();
				boolean flag = false;
				if (choice.equals("y") || choice.equals("Y")) {
					System.out.print("����� �л� �̸��� �����ּ���. : ");
					String name = sc.nextLine();
					System.out.print(""+ name + "�л��� ���� : ");
					int age = sc.nextInt();
					sc.nextLine();
					int total= 0, avg = 0, score = 0;
					arScores = new ArrayList<>();
					System.out.println(name + "�л��� ������ �Է��ϼ���.\n" + 
							"C��� JAVA Spring  ������� �����ּ���.\n" + 
							"����> 100 80 70");
					for (int i = 0; i < SUBJECTS; i++) {
						score = sc.nextInt();
						if (score < 0 || score > 100) {
							flag = true;
							System.out.println("������ 0�� ~ 100�� �����Դϴ�. ó������ ���ư��ϴ�. \n" );
							continue;
						} else {
							arScores.add(score);
						}
					}if (flag) {
						break;
					}
					Students std = new Students(name, age);
//					arStudents = new ArrayList<>();
//					arStudents.add(std);
					//������� ���
					for (int j = 0; j < SUBJECTS; j++) {
						total +=arScores.get(j);
					}
					avg = (total / SUBJECTS);
					arScores.add(avg);
					StudentsBook.put(std, arScores);
					System.out.println(name + "�л��� ������ �ԷµǾ����ϴ�.\n");
					sc.nextLine();
					list(StudentsBook);
					continue;
				} else if (choice.equals("n") || choice.equals("N")) {
					System.out.println("�л� ����� ����մϴ�.");
					break;
				}
			}
		}
		
		void search () {
			Iterator<Students> iter = StudentsBook.keySet().iterator();
			String name = null;
			System.out.println("��[�л� �˻�]��");
			System.out.print("�˻��� �л��� �̸� : ");
			name = sc.nextLine();
			System.out.println("====[�˻� ���]====");
			while(iter.hasNext()) {
				Students std = iter.next();
				if(name.equals(std.getName())) {
					std.show();
					System.out.println("===C���===JAVA===Spring===���===");
					for(int score: StudentsBook.get(std)) {
						System.out.print("=="+ score + "��==");
					}
					if (StudentsBook.get(std).get(3) >= 85) {
						System.out.println("\n�����մϴ�. " + name + "�л��� ���л��Դϴ�.");
					} else if (StudentsBook.get(std).get(3) <= 60) {
						System.out.println("\n"+name+ "�л��� ����� ������Դϴ�. �й��ϼ���.");
					} else {
						System.out.println("\n");
					}
				}
			}
		}
		
		void update () {
			boolean flag = false;
			list(StudentsBook);
			int num = 0, choice = 0;
			System.out.print("������ �л��� ��ȣ : ");
			num = sc.nextInt();
			Iterator<Students> iter = StudentsBook.keySet().iterator();
			while (iter.hasNext()) {
				Students std = iter.next();
				if (num == std.getNumber()) {
					flag = true;
					System.out.println("1. �Ż����� ����"
							+ "\n2. ��������");
					choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
					case 1 :
						System.out.println("[�Ż����� ����]"
								+ "\n�̸�, ���̸� ������� �Է��ϼ���.");
						std.setName(sc.next());
						std.setAge(sc.nextInt());
						sc.nextLine();
						System.out.println("�Ż����� ���� �Ϸ�");
						break;
					case 2: 
						int total = 0, avg = 0;
						System.out.println("�� ������ ������ ������� �Է��ϼ���. "
								+ "\n(C��� JAVA Spring)");
						for (int i = 0; i < SUBJECTS; i++) {
							StudentsBook.get(std).set(i, sc.nextInt());
						}
						for (int j = 0; j < SUBJECTS; j++) {
							total +=StudentsBook.get(std).get(j);
						}
						avg = (total / SUBJECTS);
						StudentsBook.get(std).set(3, avg);
						sc.nextLine();
						System.out.println("�����Ϸ�");
						break;
					default :
						flag = false;
						System.out.println("���� ����");
					}
				}
			}
			if (!flag) {
				System.out.println("������ �л��� ��ȣ�� �ٽ� Ȯ���� �ּ���.");
			}
			list(StudentsBook);
		}
		
		void delete () {
			int num = 0;
			Students delStd = null;
			System.out.println("��[�л��� ����]��"
					+ "\n������ �л��� ��ȣ�� �Է����ּ��� : ");
			num = sc.nextInt();
			sc.nextLine();
			
			Iterator<Students> iter = StudentsBook.keySet().iterator();
			while (iter.hasNext()) {
				Students std = iter.next();
				if (num == std.getNumber()) {
					delStd =std;
				}
			}
			if(delStd == null) {
				System.out.println("ã�� �л��� �����ϴ�. �ٽ� Ȯ�����ּ���.");
			}else {
				StudentsBook.remove(delStd);
				System.out.println("�ش� ��ȣ�� �л��� ���� �Ǿ����ϴ�.");
				list(StudentsBook);
			}
		}
		
		void list (LinkedHashMap<Students, ArrayList<Integer>> book) {
			Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
			int size = StudentsBook.size();
			if (size == 0) {
				System.out.println("��ϵ� �л��� �����ϴ�. �ٽ� Ȯ�����ּ���.");
			}else {
				System.out.println("��[�ڸ��� IT ��ī���� �л�]��");
				while (iter.hasNext()) {
					Entry<Students, ArrayList<Integer>> temp = iter.next();
					temp.getKey().show();
					System.out.println("===C���===JAVA===Spring===���===");
					for (int score : temp.getValue()) {
						System.out.print("=="+ score + "��==");
					}
					System.out.println("\n");
				}
			}
		}
		
		void list_scholarship (LinkedHashMap<Students, ArrayList<Integer>> book) {
			Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
			int size = StudentsBook.size();
			int avg = 0;
			boolean flag = false;
			if (size == 0)  {
				System.out.println("��ϵ� �л��� �����ϴ�. �ٽ� Ȯ�����ּ���.");
			}else {
				System.out.println("��[�ڸ��� IT ��ī���� ���л�]��"
						+ "\n(���л��� ������� 85�� �̻��� �л����Դϴ�.)");
				while (iter.hasNext()) {
					Entry<Students, ArrayList<Integer>> std = iter.next();
					avg = std.getValue().get(3);
					if (avg >= 85) {
						System.out.println("�����л� : " + std.getKey().getName()+"��");
						flag = true;
					}
				}
			}
			if (!flag) {
				System.out.println("���л��� �����ϴ�.\n");
			}
		}
		
		void list_fail_students (LinkedHashMap<Students, ArrayList<Integer>> book) {
			Iterator<Map.Entry<Students, ArrayList<Integer>>> iter = book.entrySet().iterator();
			int size = StudentsBook.size();
			int avg = 0;
			boolean flag = false;
			if (size == 0) {
				System.out.println("��ϵ� �л��� �����ϴ�. �ٽ� Ȯ�����ּ���.");
			}else {
				System.out.println("��[����� �����]��"
						+ "\n(����� ����ڴ� ������� 60�� �Ʒ��� �л����Դϴ�.)");
				while (iter.hasNext()) {
					Entry<Students, ArrayList<Integer>> std = iter.next();
					avg = std.getValue().get(3);
					if (avg <= 60) {
						System.out.println("������� ����� : " + std.getKey().getName()+"��");
						flag = true;
					}
				}
			}
			if (!flag) {
				System.out.println("����� ����ڴ� �����ϴ�.\n");
			}
		}
	}

