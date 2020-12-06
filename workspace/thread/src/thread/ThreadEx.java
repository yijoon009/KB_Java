package thread;

public class ThreadEx {
	public static void main(String[] args)  throws Exception{
		MyThreeadEx2_1 t1 = new MyThreeadEx2_1();
		t1.start();
	}
}


class MyThreeadEx2_1 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}