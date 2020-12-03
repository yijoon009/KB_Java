package thread;

public class ProcessTest {
	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		
		Thread th1 = new Thread(go);
		Thread th2 = new Thread(come);
		
	}
}
