package sec02_exam02_threadname;

public class ThreadNameEx {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: "+thread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA�� ������ ������: "+threadA.getName());
		threadA.start();
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadA�� ������ ������: "+threadB.getName());

		threadB.start();
	}
}
