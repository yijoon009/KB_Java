package exam04_wait_notify;

public class ThreadA extends Thread{
	private WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		super();
		this.workObject = workObject;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			workObject.methodA();
		}
	}
}
