package ex01_anonymous_extends;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//�����ǵ� �޼ҵ�� ����
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
			String studentNo;
			void study() {
				System.out.println("�����մϴ�.");
			}
			
			//�θ�޼ҵ� ������
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
		
	}

}
