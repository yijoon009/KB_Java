package lambda.api.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		//���ٽĿ��� �Ű����� �ϳ��� ���� ����
//		Consumer<String> consumer = () -> {
		Consumer<String> consumer = (t) -> 	System.out.println(t+"8");
		
		//accept�� consumer�� �߻�޼ҵ�
		consumer.accept("java");

		//void accept(T t, U u); ���ٽ����� accept�޼ҵ带 �������̵�
		BiConsumer<String, String> biconsumer = (t, u) -> System.out.println(t + u);
		biconsumer.accept("java", "8");
		
		DoubleConsumer dconsumer = t -> {
			t+=100;
			System.out.println(t);
		};
		
		dconsumer.accept(80.2);
		
		ObjIntConsumer<Car> objcon = (t, v)->{
			System.out.println(t.getName());
			System.out.println(v);
		};
		Car car = new Car("�ҳ�Ÿ");
		objcon.accept(car, 100);
		
		
		
	}//end main

}
class Car{
	String name;
	public String getName() {
		return name;
	}
	public Car(String name) {
		this.name = name;
	}
}