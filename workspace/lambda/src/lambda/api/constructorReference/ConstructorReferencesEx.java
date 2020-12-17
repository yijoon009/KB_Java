package lambda.api.constructorReference;

import java.util.function.Function;

public class ConstructorReferencesEx {

	public static void main(String[] args) {
		Function<String, Member> func = Member::new;
		Member member1 = func.apply("angel");
		
	}

}
class Member{
	private String name;
	private String id;
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
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
	public Member(String name) {
		this.name = name;
	}
}