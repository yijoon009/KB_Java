package exam03_localClass_access;

public class Outter {
	//�ڹ�7 ����
	public void method1(final int arg) {
		final int localVar = 1;
		class Inner{
			void method() {
				//�̷������� ��Į������ �����
				int arg = 10;
				int localvar = 1;
				int result = arg+localVar;
			}
		}
	}
	
	//�ڹ�8 �̻�
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
