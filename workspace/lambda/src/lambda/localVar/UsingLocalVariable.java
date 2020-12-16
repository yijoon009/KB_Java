package lambda.localVar;

public class UsingLocalVariable {
	public static void method(int arg) {
		int localVar = 40;	//로컬변수
		
		//final의 특징을 가지고 있기 때문에 바꿀 수 없다.
		//localVar += 100;	
		//arg -= 10;	
		
		//람다식 구조
		//인터페이스명 변수 = () -> {...};
		MyFunctionInterface fi = () ->{
			System.out.println("arg : "+arg);
			System.out.println("localVar : "+localVar);
		};//end fi
		
		//람다식으로 선언한 함수(메소드)를 호출함
		fi.method1();
		
	}//end method
	
	
	
	
	
	
	
	public static void main(String[] args) {
		method(500);
	}
}
