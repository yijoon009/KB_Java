package sec02_exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {

		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
		
		//�� ���ڿ��� 5�� ����ϴ� �۾�
		for(int i=0;i<5;i++) {
			System.out.println("��!");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}

}
