package sec02_exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		//how1
//		Thread thread = new BeepThread();
//		thread.start();
		
		//how2
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch (Exception e) {}
				}
			}
		};
		thread.start();
		
		
		//�� ���ڿ��� 5�� ����ϴ� �۾�
		for(int i=0;i<5;i++) {
			System.out.println("��!");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}

}
