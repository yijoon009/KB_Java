package sec03__exam01_priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<200000000 ; i++) {
		}
		System.out.println(getName());
	}
}
