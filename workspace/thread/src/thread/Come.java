package thread;

public class Come implements Runnable{
//	public void come() {
//	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("come");
		}
	}
}
