package daemonThread;

public class DaemonEx {
	public static void main(String[] args) {
		AutoSaveThread autosaveThread = new AutoSaveThread();
		
		//daemon 스레드로 지정
		autosaveThread.setDaemon(true);
		autosaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("메인 스레드 종료");
	}
}
