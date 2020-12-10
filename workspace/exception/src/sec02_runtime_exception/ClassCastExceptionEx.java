package sec02_runtime_exception;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Animal animal = new Dog();
		//가능
		Dog dog = (Dog) animal;
		//불가능
//		Cat cat = (Cat) animal;
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}else {
			System.out.println("Dog으로 변경 불가");
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}