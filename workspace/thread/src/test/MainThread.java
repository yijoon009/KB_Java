package test;

import java.util.Map;
import java.util.Set;

public class MainThread {
	public static void main(String[] args) {
		Play play = new Play();
		Music m = new Music();
		Video v = new Video();
		
		m.setPlay(play);
		m.setDaemon(true);
		
		v.setPlay(play);
		v.setPriority(10);
		
		ThreadGroup tg = new ThreadGroup("Movie");
		Thread t1= new Thread(tg, m);
		Thread t2= new Thread(tg, v);
		
		t1.start();
		t2.start();
		
//		v.start();
//		m.start();
		
		Map map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println(thread.getName() +"  "+(thread.isDaemon()?"데몬" : "주"));
			System.out.println("소속 그룹 " + thread.getThreadGroup().getName());

		}
		System.out.println("사용자 지정 스레드 그룹 이름: "+ tg.getName());
		System.out.println(m.getThreadGroup().getName());
	}
}
