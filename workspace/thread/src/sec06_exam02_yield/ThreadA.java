package sec06_exam02_yield;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾� ����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
	
}
