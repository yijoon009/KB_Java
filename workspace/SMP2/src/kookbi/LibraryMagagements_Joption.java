package kookbi;

import java.awt.HeadlessException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LibraryMagagements_Joption extends StudentManagements_Joption{
	//������
	//å�� ����Ʈ���ϰ�,
	//������ �л� ����� �˻��� �� ����
	Books books = null;
	ArrayList<Books> arBooks = new ArrayList<>();
	LinkedHashMap<Students, Books> arRentList = new LinkedHashMap<>();
	ImageIcon libraryMainImg = new ImageIcon("src/img/librarymain.gif");
	ImageIcon libraryInsertImg = new ImageIcon("src/img/libraryInsert.gif");
	
	int choice;
	String rentResult = "";
	public void libararyView () {
		boolean flag = false;
		String menu [] = {"å ���", "��ϵ� å ��ȸ", "å �˻�", "å �뿩", "å �ݳ�", "��������"};
		
		while (!flag) {
			choice = JOptionPane.showOptionDialog(null, "[�ڸ��� IT ��ī���� �������� �����ϼ̽��ϴ�.]\n"
					+ "�Ʒ��� �޴��� �����Ͽ� �������� �������ּ���", "������ ���� Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryMainImg, menu, null);
			if (choice == -1 || choice == 5) break;
			switch (choice) {
			//å ���
			case 0 :
				listUp();
				break;
			//��ϵ� å ��ü ��ȸ
			case 1 :
				bookList();
				break;
			//å �˻�
			case 2 :
				bookSearch();
				break;
			//å �뿩
			case 3 :
				rent();
				break;
			case 4 :
				returnBook(arRentList);
				break;
			}
		}
	}
	//å ���
	public void listUp () {
		boolean LUcheck = false;
		while (!LUcheck) {
			String [] yesOrno = {"YES", "NO"};
			choice = JOptionPane.showOptionDialog(null, "��[å ���]�� \nå ����� �����Ͻðڽ��ϱ�?", "�л��� ���", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, libraryInsertImg, yesOrno, null);
			if (choice == -1) break;
			switch (choice) {
			//å��� yes
			case 0 :
				String bookName = JOptionPane.showInputDialog("����� å ������ �����ּ���");
				String author = JOptionPane.showInputDialog(bookName + "�� ���ڸ� �����ּ���");
				int volume;
				try {
					volume = Integer.parseInt(JOptionPane.showInputDialog(bookName+ "�� ���������� �����ּ���"));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "���ڸ� �Է����ּ���");
					break;
					//return�ϸ� ���ɵ�?
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "�����Դϴ�. �ٽ��Է����ּ���");
					break;
				}
				books = new Books(bookName, author, volume);
				arBooks.add(books);
				JOptionPane.showMessageDialog(null, bookName + " å�� ������ �ԷµǾ����ϴ�.");
				break;
			//å��� no
			case 1 :
				JOptionPane.showMessageDialog(null, "å ����� �����մϴ�.");
				LUcheck = true;
				break;
			}
		}
	}
	//å ����Ʈ
	public void bookList() {
		String result = "";
		if (arBooks.size() == 0) {
			result = "�������� ��ϵ� å�� �����ϴ�.";
		} else {
			result += "��[������ �������� å ���]��\n";
			for (int i = 0; i < arBooks.size(); i++) {
				result += arBooks.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	//å �˻�
	public void bookSearch () {
		Iterator<Books> iter = arBooks.iterator();
		String result = "";
		if (arBooks == null) {
			result += "�������� ��ϵ� å�� �����ϴ�.";
		}else {
			String bookname = JOptionPane.showInputDialog("��[å ���� �˻�]��"
				+ "\n�˻��� å ������ ���ּ���.\n");
			while (iter.hasNext()) {
				Books temp = iter.next();
				if (bookname.equals(temp.getBookName())) {
					result += "[�˻��� �ڷ�� �Ʒ��� �����ϴ�.]\n";
					result += temp.toString();
				}
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	//å �뿩
	public void rent () {
		Iterator<Students> stIter = StudentsBook.keySet().iterator();
		Iterator<Books> bIter = arBooks.iterator();
		String result = "";
		boolean rentCheck = false;
		if (!(StudentsBook.size()==0) && !(arBooks.size() ==0)) {
			JOptionPane.showMessageDialog(null, "���� ��ϵ� �л��� �Դϴ�");
			list(StudentsBook);
			Integer number = 0;
			try {
				number = Integer.parseInt(JOptionPane.showInputDialog("å�� �뿩�� �л� �й��� ���ּ���"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "������ �ٽ� Ȯ�����ּ���");
				return;
			}
			while (stIter.hasNext()) {
				Students std = stIter.next();
				if(std.getNumber() == number) {
					JOptionPane.showMessageDialog(null, "���� �������� ��ϵ� å ����� �����帮�ڽ��ϴ�.");
					bookList();
					String book = JOptionPane.showInputDialog("�뿩�� å�� ������ �Է����ּ���");
					
					while (bIter.hasNext()) {
						Books temp = bIter.next();
						if (book.equals(temp.getBookName()) && temp.getRent().equals("�뿩 ����")) {
							arRentList.put(std, temp);
							JOptionPane.showMessageDialog(null, std.getName() +" �л����� "
									+ temp.getBookName() +" å �뿩�� �Ϸ�Ǿ����ϴ�.");
							temp.setRent("�뿩 ��");
						}else if (!book.equals(temp.getBookName())) {

						}else if (!temp.getRent().equals("�뿩����")) {
							JOptionPane.showMessageDialog(null, "�� å�� �뿩�������� �ʽ��ϴ�.");
							return;
						}
					}
				}else {
					JOptionPane.showMessageDialog(null, "����� �л��� �����ϴ�.");
					return;
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "������ ������ �ֽ��ϴ� �ٽ� �� �� Ȯ�����ּ���.");
		}
		bookList();
	}
	
	public void returnBook (LinkedHashMap<Students, Books> arRentList) {
		Iterator<Map.Entry<Students, Books>> iter = arRentList.entrySet().iterator();
		String result = "";
		if (arRentList.size() ==0) {
			result += "�뿩���� å�� �����ϴ�.";
		}else {
			String bookNum = JOptionPane.showInputDialog("[å �ݳ� �޴��Դϴ�.]\n"
					+ "�ݳ��Ͻ� å ��ȣ�� �Է����ּ��� (�Ϸù�ȣ�� 'Book-' �� �����Ͽ� ���ּž��մϴ�.)") ;
			while(iter.hasNext()) {
				java.util.Map.Entry<Students, Books> temp = iter.next();
				if(bookNum.equals(temp.getValue().getBookNum())) {
					JOptionPane.showMessageDialog(null, "�ݳ��� �Ϸ�Ǿ����ϴ�.");
					temp.getValue().setRent("�뿩 ����");
				}else {
					JOptionPane.showMessageDialog(null, "ã���ô� å�� �����ϴ�.");
					return;
				}
			}
		}
		bookList();
	}
}




