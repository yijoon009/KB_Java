package animal;

public class AnimalMain {

	public static void main(String[] args) {

		//������ Ŭ���� ��üȭ
		Dog dog = new Dog();
		//����� Ŭ���� ��üȭ
		Cat cat = new Cat();
		//������ Ŭ���� ������
		Animal dog2 = new Dog();
		//����� Ŭ���� ������
		Animal cat2 = new Cat();
		//���� Ŭ���� ��üȭ
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//����̴� �߿˾߿��ϰ� ��ϴ�. ����̴� ���� ���ϴ�. �������� �۸��ϰ� �����ϴ�. �������� ���� ���ϴ�.
		
		System.out.print(cat.toString()+"��");
		cat.sound();
		System.out.println("�ϰ� ��ϴ�.");
		
		System.out.print(cat+"�� ");
		cat.breathe();
		System.out.println();
		
		System.out.print(dog.kind+"�� ");
		dog.sound();
		System.out.println("�ϰ� �����ϴ�.");
		
		System.out.println(dog.kind+"��");
		dog.breathe();
		
		
		
	}

}
