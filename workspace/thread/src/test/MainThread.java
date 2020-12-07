package test;

public class MainThread {
	public static void main(String[] args) {
		Play play = new Play();
		
		Music m = new Music();
		m.setPlay(play);
		m.setDaemon(true);
		
		Video v = new Video();
		v.setPlay(play);
		v.setPriority(10);
		
		ThreadGroup tg = new ThreadGroup("movie");
		Thread t1= new Thread(tg, m);
		Thread t2= new Thread(tg, v);
		
		v.start();
		m.start();
	}
}
