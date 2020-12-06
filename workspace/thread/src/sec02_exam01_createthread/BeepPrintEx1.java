package sec02_exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintEx1 {

	public static void main(String[] args) {
		//how1
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
//		thread.start();
		
		//how2
//		Thread thread1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0;i<5;i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					}catch (Exception e) {}
//				}
//			}
//		});
//		thread1.start();
		
		//how 3
		Thread thread2 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				}catch (Exception e) {}
			}
		} );
		thread2.start();
		
		
		//띵 문자열을 5번 출력하는 작업
		for(int i=0;i<5;i++) {
			System.out.println("띵!");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}

}
