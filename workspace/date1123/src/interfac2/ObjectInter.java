package interfac2;

public interface ObjectInter {
	int MAX = 99999;
	int MIN = -99999;
	
	
	//�߻�޼ҵ� calc() avg();
	public abstract void calc();
	public void avg();
	
	//default number();
	default void number() {
		
	}
	
	//static stnumber()
	static void stnumber() {
		
	}
}
