package sec02_exam02_threadname;

public class ThreadNameEx {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+thread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA를 생성한 스레드: "+threadA.getName());
		threadA.start();
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadA를 생성한 스레드: "+threadB.getName());

		threadB.start();
	}
}
