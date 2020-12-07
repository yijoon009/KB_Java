package group;

import java.util.Map;
import java.util.Set;

import daemonThread.AutoSaveThread;

public class ThreadInfoEx {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		
		//스레드를 동작시키기 Runnable상태로 만들기
		autoSaveThread.start();

		//getAllStackTraces() 프로세스의 모든 스레드 상황을 구해주는 메소드
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		
		//keySet : map계열에서 key값들을 리턴해주는 메소드
		Set<Thread> threads = map.keySet();
		for(Thread t : threads) {
			System.out.println("name : "+ t.getName()+(t.isDaemon()?"데몬":"주 스레드"));
			System.out.println("\t"+"소속 그룹 : "+t.getThreadGroup().getName());
		}
		
	}
}
