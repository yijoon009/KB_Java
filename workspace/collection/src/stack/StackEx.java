package stack;

import java.util.Stack;

//���Լ��� LIFO = ���߿� �ԷµȰ� ���� ���
public class StackEx {

	public static void main(String[] args) {
		/*
		 * ����(Stack) Ŭ������ Vector�� ���� Ŭ�����̴�. List�� ���� Ŭ���� �迭 �̴�.
		 * 
		 * list.push("push"); // add�� ���� ���, ���Լ��⿡ ���� ���� ����־�����. list.offer("offer"); 
		 * �־��� ��ü�� �ִ´�. ���������� ����ִ� �� == addLast list.pop(); // ��ü �ϳ��� �����ͼ� �����Ѵ�. ��ü�� ť����
		 * �����Ѵ�. ���Լ��⿡ ���� ���� list.poll(); // ��ü �ϳ��� �����´�. ��ü�� ť���� �����Ѵ�.���� list.peek();
		 * // ��ü �ϳ��� �����´�. ��ü�� ť���� �������� �ʴ´�. �ڷḦ ������ �ִ�. // peek �� ������ ���� �����ִ� ���� ����Ѵ�.
		 * 
		 * 
		 */

		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while (!coinBox.isEmpty()) { // ������� �ʴٸ�
			Coin coin = coinBox.pop(); // ������ ������
			System.out.println("������ ���� : " + coin.getMoney() + "��");
		}
		System.out.print("������ ������ϱ�? : ");
		if (coinBox.isEmpty())
			System.out.println("yes");
		else
			System.out.println("no");

		Stack<Parking> park = new Stack<Parking>();
		park.push(new Parking("�ҳ�Ÿ", "4001"));
		park.push(new Parking("���", "3211"));
		park.push(new Parking("�ƹݶ�", "2325"));
		park.push(new Parking("��Ÿ��", "9432"));
		int i = 1;
		while (!park.isEmpty()) {
			Parking pk = park.pop();
			System.out.println("���� ���� : " + pk.getCar() + "[" + i + "]");
			i++;
		}
		if (park.isEmpty())
			i = 1;

	}
}

class Coin {
	int money;

	public Coin(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
}

class Parking {
	String carKind; // ����
	String carNum; // ���ѹ�

	public Parking(String carkind, String carNum) {
		this.carKind = carkind;
		this.carNum = carNum;
	}

	public String getCar() {
		return "[" + carKind + "]" + "[" + carNum + "]";
	}
}