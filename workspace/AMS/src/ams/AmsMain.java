package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		
		//���������� new�� ������ ���� �޸𸮿��� ����
		//��, static ������ ���α׷� ����� �޸𸮿��� ����
		
		
		AmsField af = new AmsField();
		ImageIcon img = new ImageIcon("src/img/main.jpg");
		String[] arPlane = new String[5];
		
		String[] menu = {"�߰��ϱ�","�˻��ϱ�","�����ϱ�","�����ϱ�","��Ϻ���"};
		
		
		int choice = 0;
		String insertMsg = "[�߰��Ͻ� ������ �״�� �Է��ϼ��� (,����)]\n"
				+ "�װ���, ������ȣ, �ִ�°���(��), �����, ������";

		String searchMsg = "�˻��Ͻ� �װ��縦 �Է��ϼ���. \n";
		
		//title : ������ â ���� ���� �ߴ°�
		//messageType: �ڽ� �ȿ� �����ܰ�����
		//icon : ������,Ÿ���� �̹��� Ÿ���̾�� ��.
		//options: ��ư, �迭�� �����Ǿ� ����.0�� ù��° 1�� �ι�°,,,
		//initialValue : ��ó�� ��ư����, ���õ� ����
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, img, menu, null);
			
			System.out.println(choice);
			if(choice == -1) break;
			
			switch(choice) {
			//�߰��ϱ� ����
			case 0:
				arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
				af.insert(arPlane);
				break;
			//�˻��ϱ�
			case 1:
				String keyword = JOptionPane.showInputDialog(searchMsg);
				JOptionPane.showMessageDialog(null,af.search(keyword));
				break;
			//�����ϱ�
			case 2:
				break;
			//�����ϱ�
			case 3:
				break;
			//��Ϻ���
			case 4:
				JOptionPane.showMessageDialog(null, af.show());
				break;
			}//��ư�̶� default�� ����.
		}
		
		
		
		
		
		
		
		
		
		
	}
}
