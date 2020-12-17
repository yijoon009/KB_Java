package lambda.api.consumerAndThen;

import java.util.function.Consumer;

public class ConsumerAndThenEx {
	public static void main(String[] args) {
		
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA "+ m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> System.out.println("consumerB "+m.getId());
		
		Consumer<Member> consumerAB = consumerB.andThen(consumerA);
		
		//¸Þ¼Òµå È£Ãâ
		consumerA.accept(new Member("È«±æµ¿","123",new Address("South Korea", "seoul")));
		consumerB.accept(new Member("È«±æµ¿","123",new Address("South Korea", "seoul")));
		consumerAB.accept(new Member("È«±æµ¿","123",new Address("South Korea", "seoul")));
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















