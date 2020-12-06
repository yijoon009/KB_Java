package sec03__exam01_priority;

public class PriorityEx {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread" + i);
			if(i != 10) {	//1~9까지
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {	//i ==10일때
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
