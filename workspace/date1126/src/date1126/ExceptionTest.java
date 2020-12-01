package date1126;

public class ExceptionTest {
	public static void main(String[] args)   {
		int a = 10;
//		
//		//예외를 처리하는것은 main쓰레드가 아니라
//		//다른 쓰레드에서 처리함
//		
//		try {
//			int[] ar = new int[5];
//			ar[5] = 30;
//			int c = a/0;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("배열 첨자 오류");
//		}catch(Exception e) {
//			
//		}
//		finally {
//			System.out.println("DB닫기");
//			System.out.println("연결된 자원 해제");
//			
//		}
	
		try {
			method1();
			method2();
		} catch (ArithmeticException e) {
			System.out.println("예외");
		}finally {
			System.out.println("데이터베이스 종료");
			System.out.println("로그아웃");
			
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











