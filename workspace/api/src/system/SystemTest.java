package system;

import java.io.InputStream;

public class SystemTest {
	public static void main(String[] args) {
		InputStream is = System.in;
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		System.out.println(osName);
		System.out.println(userName);
		long ct = System.currentTimeMillis();
		long nt = System.nanoTime();
		System.gc();  //쓰레기 수집요청
		System.exit(0);	//닫기
	}
}
