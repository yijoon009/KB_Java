package date1126;

public class ExceptionTest {
	public static void main(String[] args)   {
		int a = 10;
//		
//		//���ܸ� ó���ϴ°��� main�����尡 �ƴ϶�
//		//�ٸ� �����忡�� ó����
//		
//		try {
//			int[] ar = new int[5];
//			ar[5] = 30;
//			int c = a/0;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("�迭 ÷�� ����");
//		}catch(Exception e) {
//			
//		}
//		finally {
//			System.out.println("DB�ݱ�");
//			System.out.println("����� �ڿ� ����");
//			
//		}
	
		try {
			method1();
			method2();
		} catch (ArithmeticException e) {
			System.out.println("����");
		}finally {
			System.out.println("�����ͺ��̽� ����");
			System.out.println("�α׾ƿ�");
			
		}
	}

	static void method1() {
		a();
	}
	static void method2() {
		b();
	}
	private static void a() {
		b();
		int[] arr = new int[5];
		arr[5] = 10;
	}
	private static void b() throws ArithmeticException {
		try {
			int a = 10;
			int c = a/1; 
		} catch (ArrayIndexOutOfBoundsException e) {
		}
	}
}











