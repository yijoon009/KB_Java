package lambda.api.operatorMinByMax;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorMinByMaxEx {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binary;
		Fruit fruit;
		
		//minBy()사용
		binary = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		
		//minBy 해서 가격이 싼게 나옴 -> apple
		fruit = binary.apply(new Fruit("apple", 6000), new Fruit("banana", 10000));
		System.out.println(fruit.name);
		
		//maxBy()
		binary = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binary.apply(new Fruit("apple", 6000), new Fruit("banana", 10000));
		System.out.println("비싼 과일은 " +fruit.name);
		
		
		IntBinaryOperator i = (t1, t2)->{return Math.max(t1, t2);};
		int m = i.applyAsInt(100, 2100);
		System.out.println(m);
		IntBinaryOperator j = Math::max;
		//메소드 참조 - 매개값을 전달하는 역할만 하는 경우
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