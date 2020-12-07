package test;

public class Play {
	private String tool;

	public String getTool() {
		return tool;
	}

	
	
	public synchronized void setTool(String tool) {
		this.tool = tool;
		System.out.println(this.tool+"을 재생합니다.");
		notify();
		try {
			Thread.sleep(500);
			wait();
		} catch (InterruptedException e) {
		}
	}
}
	

