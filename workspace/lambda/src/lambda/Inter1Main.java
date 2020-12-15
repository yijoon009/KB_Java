package lambda;

public class Inter1Main {

	public static void main(String[] args) {
		//익명 구현 객체로 
		Inter1 inter = new Inter1() {
			
			@Override
			public void interMethod1() {
				System.out.println("interMethod1 in anonymous");
			}
		};

		inter.interMethod1();
		
		//람다식
		Inter1 inter2 = () -> System.out.println("interMethod1 in lanbda");
		inter2.interMethod1();

	}

}
