package test;

public class Play {
	private String tool;

	public String getTool() {
		return tool;
	}

	
	
	public synchronized void setTool(String tool) {
		this.tool = tool;
		System.out.println(this.tool+"�� ����մϴ�.");
		notify();
		try {
			Thread.sleep(500);
			wait();
		} catch (InterruptedException e) {
		}
	}
}
	

