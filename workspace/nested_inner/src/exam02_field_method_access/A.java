package exam02_field_method_access;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			
			//바깥쪽 필드 바로사용 가능
			field1 = 10;
			method1();
			field2 = 20;
			method2();
		}
	}
	
	static class C{
		void method() {
//			field1 = 10; 
//			method1();
			field2 = 10;
			method2();
		}
	}
}
