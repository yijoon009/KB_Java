package lambda.usingThis;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {
			MyFunctionInterface fi = () -> {
				//외부 내부 필드명이 똑같은 경우를 방지하고자 아래 방법처럼 사용
				System.out.println("outterField : "+outterField);
				System.out.println("outterField : "+UsingThis.this.outterField);
				
				System.out.println("innerField : "+innerField);
				System.out.println("innerField : "+this.innerField);
			};	//익명객체 구현
			
			//메소드 호출
			fi.method1();
		}
		
	}
}
