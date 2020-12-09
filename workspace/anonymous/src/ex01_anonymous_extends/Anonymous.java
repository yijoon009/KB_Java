package ex01_anonymous_extends;

public class Anonymous {
	
	Person field = new Person() {
		
		//�͸��ڽİ�ü �ʵ�
		String studentNo;
		void work() {
			System.out.println("����մϴ�.");
		}
		
		//�θ�޼ҵ� ������
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		};
	};
	
	void method1() {
		Person localVar = new Person() {
			String studentNo;
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			};
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	
}








