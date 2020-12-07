package test;

public class Music extends Thread{
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
			play.setTool("À½¾Ç");
			
		}
	}
}
