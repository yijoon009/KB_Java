package lambda.api.methodReferences;

import java.util.function.IntBinaryOperator;

public class MethodReferencesEx {

	public static void main(String[] args) {
		IntBinaryOperator oper;
		
		//람다식 표현 메소드 재정의
		oper = (x, y) -> Calculator.staticMethod(x, y);  
		System.out.println(oper.applyAsInt(10, 43));

		//정적 메소드 참조
		oper = Calculator :: staticMethod;  
		System.out.println(oper.applyAsInt(14, 43));
		
		//람다식 표현 메소드 재정의
		Calculator cal = new Calculator();
		oper = (x,y) -> cal.instanceMethod(x, y);
		System.out.println(oper.applyAsInt(500, 1));
		
		//인스턴스 메소드 참조
		oper = cal::instanceMethod;
		System.out.println(oper.applyAsInt(500, 1));
		
	}

}

class Calculator{
	public static int staticMethod(int x, int y) {	//정적 메소드 선언
		return x+y;
	}
	
	public int instanceMethod(int x, int y) {	//인스턴스 메소드 선언
		return x-y;
	}
}