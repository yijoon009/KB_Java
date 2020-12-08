package exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업실행");
		notify();	//현재 wait상태의 스레드를 실행대기로 깨워주는것
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업실행");
		notify();	
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
