package thread;

public class Go implements Runnable {
//	public void go() {
//	}
	
	@Override
	public void run() {	//스레드로 처리할 내용을 작성
		while(true){
			System.out.println("go");
		}
		
	}
	
	
}
