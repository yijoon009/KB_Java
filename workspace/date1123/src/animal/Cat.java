package animal;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.print("�߿˾߿�");
	}
	
	public Cat() {
		super.kind = "������";
	}
	@Override
	public String toString() {
		return "�����";
	}

}
