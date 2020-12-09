package ex01_anonymous_extends;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//재정의된 메소드로 실행
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
			String studentNo;
			void study() {
				System.out.println("공부합니다.");
			}
			
			//부모메소드 재정의
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
		
	}

}
