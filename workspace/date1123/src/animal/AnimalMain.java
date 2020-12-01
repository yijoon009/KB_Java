package animal;

public class AnimalMain {

	public static void main(String[] args) {

		//강아지 클래스 객체화
		Dog dog = new Dog();
		//고양이 클래스 객체화
		Cat cat = new Cat();
		//강아지 클래스 다형성
		Animal dog2 = new Dog();
		//고양이 클래스 다형성
		Animal cat2 = new Cat();
		//동물 클래스 객체화
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//고양이는 야옹야옹하고 웁니다. 고양이는 숨을 쉽니다. 강아지는 멍멍하고 짓습니다. 강아지는 숨을 쉽니다.
		
		System.out.print(cat.toString()+"는");
		cat.sound();
		System.out.println("하고 웁니다.");
		
		System.out.print(cat+"는 ");
		cat.breathe();
		System.out.println();
		
		System.out.print(dog.kind+"는 ");
		dog.sound();
		System.out.println("하고 짓습니다.");
		
		System.out.println(dog.kind+"는");
		dog.breathe();
		
		
		
	}

}
