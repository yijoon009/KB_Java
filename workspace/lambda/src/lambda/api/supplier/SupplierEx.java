package lambda.api.supplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		//T get();
		Supplier<String> supplier = () -> {
			String name = "홍길동";
			return name;
		};
		
		System.out.println(supplier.get());
		
		Car car = new Car();
		car.setPrice(30000000);
		Supplier<String> carsupp = () -> {
			car.setName("소나타");
			return car.getName();
		};
		System.out.println(carsupp.get());
	
		
		//booleanSupplier - 소나타면 true, doublesupplier - 세금 30,000,000 * 2.25%,
		//intsupplier 가격 30,000,000
		
		BooleanSupplier boolsup = ()-> {
			boolean result = false;
			if(carsupp.get().equals("소나타")) {
				result = true;
			}
			return result;
		};
		
		System.out.println(boolsup.getAsBoolean());
		
		DoubleSupplier doublesup = () -> {
			return car.getPrice() * 0.025;
		};
		System.out.println("세금은 "+ doublesup.getAsDouble());
		
		IntSupplier intsup = () -> {
			return car.getPrice();
		};
		System.out.println("가격은 "+intsup.getAsInt());
		
		
	}//end main

}
class Car{
	String name;
	double tax;
	int price;
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}