package sec02_runtime_exception;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Animal animal = new Dog();
		//����
		Dog dog = (Dog) animal;
		//�Ұ���
//		Cat cat = (Cat) animal;
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}else {
			System.out.println("Dog���� ���� �Ұ�");
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}