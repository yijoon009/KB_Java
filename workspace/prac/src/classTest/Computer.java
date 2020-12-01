package classTest;

public class Computer {
	int index;
	int bit;
	
	public static final String[] osType = {"원도7", "애플 OS X", "안드로이드"};

	public Computer(int index, int bit) {
		super();
		this.index = index;
		this.bit = bit;
	}
	
	public void print() {
		System.out.println("운영체제: "+ osType[index]+", 메인메모리: "+bit);
	}

	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
        Computer apple = new Computer(1, 32);
        Computer galaxy = new Computer(2, 16);
        pc.print();
        apple.print();
        galaxy.print();
	}





}
