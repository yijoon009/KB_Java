package sec02.exam01_nestedclass_obj;

public class A {
	void method() {
		class D {
			int field1;
			D(){
				System.out.println("D ��ü�� ������");
			}
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	A(){
		System.out.println("A ��ü�� ������");
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
	
	
	
	
	
	static class C{
		int field1;
		static int field2;
		C(){
			System.out.println("C ��ü�� ������");
		}
		void method1() {}
		static void method2() {}
	}
	
	
	
	class B{
		int field1;
		B(){
			System.out.println("B ��ü�� ������");
		}
		void method1() {}
	}
	
	
	
	
}
