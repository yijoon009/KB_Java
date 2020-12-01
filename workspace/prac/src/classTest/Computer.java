package classTest;

public class Computer {
	int index;
	int bit;
	
	public static final String[] osType = {"����7", "���� OS X", "�ȵ���̵�"};

	public Computer(int index, int bit) {
		super();
		this.index = index;
		this.bit = bit;
	}
	
	public void print() {
		System.out.println("�ü��: "+ osType[index]+", ���θ޸�: "+bit);
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
