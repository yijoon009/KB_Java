package lambda.api.operatorMinByMax;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorMinByMaxEx {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binary;
		Fruit fruit;
		
		//minBy()���
		binary = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		
		//minBy �ؼ� ������ �Ѱ� ���� -> apple
		fruit = binary.apply(new Fruit("apple", 6000), new Fruit("banana", 10000));
		System.out.println(fruit.name);
		
		//maxBy()
		binary = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binary.apply(new Fruit("apple", 6000), new Fruit("banana", 10000));
		System.out.println("��� ������ " +fruit.name);
		
		
		IntBinaryOperator i = (t1, t2)->{return Math.max(t1, t2);};
		int m = i.applyAsInt(100, 2100);
		System.out.println(m);
		IntBinaryOperator j = Math::max;
		//�޼ҵ� ���� - �Ű����� �����ϴ� ���Ҹ� �ϴ� ���
		int k = j.applyAsInt(100, 3400);
		System.out.println(k);
		
		
	}

}
class Fruit{
	public String name;
	public int price;
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}