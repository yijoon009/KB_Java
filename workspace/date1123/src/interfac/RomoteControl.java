package interfac;

public interface RomoteControl {
	//인터페이스는 어차피 상수
	static final double PI = 3.14;
	Double EARTHAREA = 5478.342;
	
	//추상메소드 public 생략? default? -> public이야.
	//추상메소드 public abstract가 생략될 수 있습니다.
	public abstract void turnOn();
	void turnOff();
	public void soundOn();
	abstract void soundOff();
	
	//default메소드를 1.8버전에서 허용함.
	default void setMute() {
		
	}
	
	//정적메소드 1.8버전에서 허용함
	static void aa() {
		
	}
	
	//생성자 - 불가
//	public RomoteControl() {;}
	
	//초기화 블럭 - 불가
//	{ }
	
	//정적초기화 블럭 - 불가
//	static {}
	
}
