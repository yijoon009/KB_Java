package lambda.api.functionAndThen;

import java.util.function.Function;

public class FunctionAndThenComposeEx {

	public static void main(String[] args) {
		//들어갈땐 member타입, 나오는 타입은 Address타입
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		//R apply(T t) 추상메소드 오버라이딩 한것
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		//메소드 호출
		city = functionAB.apply(new Member("김이준", "8888", new Address("대한민국", "서울")));
		System.out.println("거주 도시 : " + city);
		
		Address a = functionA.apply(new Member("김이준", "8888", new Address("대한민국", "서울")));
		System.out.println(a);
		city = functionB.apply(a);
		System.out.println(city);

		
		System.out.println("====compose() 사용하기");
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("김이준", "8888", new Address("대한민국", "서울")));
		System.out.println("거주 도시 : " + city);
	}

}
class Member{
	private String name;
	private String id;
	private Address address;
	public Member(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}

class Address{
	private String country;
	private String city;
	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

