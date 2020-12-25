package bakery;

import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadMaker maker = new BreadMaker();
		
		//������ ����� BreadMaker�ʵ忡 �ִ� BreadPlate �ʵ��� �ּҸ� bread ��ü�� �������ش�.
		//BreadMaker.java �ּ� ����
		BreadPlate bread = maker.getBreadPlate();
		
		Thread maker_thread = new Thread(maker);
		
		//2���� ��ư�� ����� ���� 2ĭ ���ڿ� �迭 ����
		String[] menu = {"�� �Ա�", "������"};
		
		//�� ����� ������ ����
		maker_thread.start();
		
		while(true) {
			//showOptionDialog() : ��ư�� ���� �� �ִ� ��ȭ����
			//����ڰ� Ŭ���� ��ư�� �ε����� �����Ѵ�
			int choice = JOptionPane.showOptionDialog(null, "", "�ĸ��ٰ�Ʈ", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, menu, null);
			
			if(choice == -1 || choice == 1) {
				/*������*/
				//���ø����̼� ��������(��ü����)
				System.exit(0);
			}else if(choice == 0) {
				/*���Ա�*/
				bread.eatBread();
			}
			
			
		}
		
	}
}





