package test;

public class Video extends Thread{
	
	private Play play;

	public Play getPlay() {
		return play;
	}

	public void setPlay(Play play) {
		this.play = play;
	}
	@Override
	public void run() {
		while(true) {
			
			play.setTool("µ¿¿µ»ó");
		}
	}
}
