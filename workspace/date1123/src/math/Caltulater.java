package math;

import java.util.Scanner;

public abstract class Caltulater {
	Scanner  sc = new Scanner(System.in);  

	protected int a,b;
	abstract protected int calc();
	protected void input() {
		System.out.println("���� 2���� �Է��ϼ���>>");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("���� ���� "+res);
	}
}
