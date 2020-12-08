package exam04_wait_notify;

public class WaitNotifyEx {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
	
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
 