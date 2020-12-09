package ex01_anonymous_extends;

public class Anonymous {
	
	Person field = new Person() {
		
		//익명자식객체 필드
		String studentNo;
		void work() {
			System.out.println("출근합니다.");
		}
		
		//부모메소드 재정의
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		};
	};
	
	void method1() {
		Person localVar = new Person() {
			String studentNo;
			void walk() {
				System.out.println("산책합니다.");
			}
			
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			};
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	
}








