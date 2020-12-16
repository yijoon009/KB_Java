package lambda.api.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		//람다식에서 매개변수 하나면 생략 가능
//		Consumer<String> consumer = () -> {
		Consumer<String> consumer = (t) -> 	System.out.println(t+"8");
		
		//accept는 consumer의 추상메소드
		consumer.accept("java");

		//void accept(T t, U u); 람다식으로 accept메소드를 오버라이딩
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
		Car car = new Car("소나타");
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