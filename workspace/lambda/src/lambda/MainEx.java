package lambda;

public class MainEx {
	public static void main(String[] args) {
		
		//익명 구현 객체
		MyFunctionInter fi = new MyFunctionInter() {
			
			@Override
			public void method() {
				System.out.println("Lambda");
			}
		};
		
		//익명 구현객체로 만든 메소드 사용
		fi.method();
		
		
		//람다식  표현
		//실행문이 하나면 {} 생략 가능
//		MyFunctionInter fi2 = ()-> {System.out.println("lambda");};
		MyFunctionInter fi2 = ()-> System.out.println("lambda");
		
		//메소드 사용
		fi2.method();
		
		
		//일반 구현 객체로 객체화
		RunImEx r1 = new RunImEx();
		RunIm r2 = ()->{System.out.println("람다식");
						System.out.println(100-30);
		};
		
		//익명 구현 객체화
		/*RunIm r2 = new RunIm() {
			
			@Override
			public void abMethod() {
				System.out.println("람다식");
			}
		};*/	// ';' 익명 구현 객체
	}
}


/*
 * () -> {syso("람다식");}
 * */
 