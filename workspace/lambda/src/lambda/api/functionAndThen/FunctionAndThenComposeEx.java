package lambda.api.functionAndThen;

import java.util.function.Function;

public class FunctionAndThenComposeEx {

	public static void main(String[] args) {
		//���� memberŸ��, ������ Ÿ���� AddressŸ��
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		//R apply(T t) �߻�޼ҵ� �������̵� �Ѱ�
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		//�޼ҵ� ȣ��
		city = functionAB.apply(new Member("������", "8888", new Address("���ѹα�", "����")));
		System.out.println("���� ���� : " + city);
		
		Address a = functionA.apply(new Member("������", "8888", new Address("���ѹα�", "����")));
		System.out.println(a);
		city = functionB.apply(a);
		System.out.println(city);

		
		System.out.println("====compose() ����ϱ�");
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("������", "8888", new Address("���ѹα�", "����")));
		System.out.println("���� ���� : " + city);
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

