package group;

import java.util.Map;
import java.util.Set;

import daemonThread.AutoSaveThread;

public class ThreadInfoEx {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		
		//�����带 ���۽�Ű�� Runnable���·� �����
		autoSaveThread.start();

		//getAllStackTraces() ���μ����� ��� ������ ��Ȳ�� �����ִ� �޼ҵ�
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		
		//keySet : map�迭���� key������ �������ִ� �޼ҵ�
		Set<Thread> threads = map.keySet();
		for(Thread t : threads) {
			System.out.println("name : "+ t.getName()+(t.isDaemon()?"����":"�� ������"));
			System.out.println("\t"+"�Ҽ� �׷� : "+t.getThreadGroup().getName());
		}
		
	}
}
