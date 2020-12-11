package stack;

import java.util.Stack;

//후입선출 LIFO = 나중에 입력된게 먼저 출력
public class StackEx {

	public static void main(String[] args) {
		/*
		 * 스택(Stack) 클래스는 Vector의 하위 클래스이다. List의 구현 클래스 계열 이다.
		 * 
		 * list.push("push"); // add와 같은 기능, 선입선출에 의해 먼저 집어넣어진다. list.offer("offer"); 
		 * 주어진 객체를 넣는다. 마지막에다 집어넣는 것 == addLast list.pop(); // 객체 하나를 가져와서 제거한다. 객체를 큐에서
		 * 제거한다. 선입선출에 의해 선출 list.poll(); // 객체 하나를 가져온다. 객체를 큐에서 제거한다.삭제 list.peek();
		 * // 객체 하나를 가져온다. 객체를 큐에서 제거하지 않는다. 자료를 가지고 있다. // peek 는 스택의 가장 위에있는 것을 출력한다.
		 * 
		 * 
		 */

		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while (!coinBox.isEmpty()) { // 비어있지 않다면
			Coin coin = coinBox.pop(); // 꺼내고 버리기
			System.out.println("꺼내온 동전 : " + coin.getMoney() + "원");
		}
		System.out.print("동전이 비었습니까? : ");
		if (coinBox.isEmpty())
			System.out.println("yes");
		else
			System.out.println("no");

		Stack<Parking> park = new Stack<Parking>();
		park.push(new Parking("소나타", "4001"));
		park.push(new Parking("쏘렌토", "3211"));
		park.push(new Parking("아반떼", "2325"));
		park.push(new Parking("싼타페", "9432"));
		int i = 1;
		while (!park.isEmpty()) {
			Parking pk = park.pop();
			System.out.println("출차 순서 : " + pk.getCar() + "[" + i + "]");
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
	String carKind; // 차종
	String carNum; // 차넘버

	public Parking(String carkind, String carNum) {
		this.carKind = carkind;
		this.carNum = carNum;
	}

	public String getCar() {
		return "[" + carKind + "]" + "[" + carNum + "]";
	}
}