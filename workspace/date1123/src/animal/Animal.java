package animal;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.print("숨을 쉽니다");
	}
	public abstract void sound();
	
	
	//실행 순서
	//static -> main() -> {} -> 생성자
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	{}
	static {}
}
