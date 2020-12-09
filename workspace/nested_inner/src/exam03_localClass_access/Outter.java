package exam03_localClass_access;

public class Outter {
	//자바7 이전
	public void method1(final int arg) {
		final int localVar = 1;
		class Inner{
			void method() {
				//이런식으로 로칼변수로 복사돼
				int arg = 10;
				int localvar = 1;
				int result = arg+localVar;
			}
		}
	}
	
	//자바8 이상
	public void method2(int arg) {
		int localVar = 1;
//		arg = 100;
		localVar = 10;
		class Inner{
			void method() {
//				int result = arg+localVar;
			}
		}
	}
	
}
