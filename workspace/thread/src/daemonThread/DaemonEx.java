package daemonThread;

public class DaemonEx {
	public static void main(String[] args) {
		AutoSaveThread autosaveThread = new AutoSaveThread();
		
		//daemon ������� ����
		autosaveThread.setDaemon(true);
		autosaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("���� ������ ����");
	}
}
