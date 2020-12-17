package lambda.api.methodReferences;

import java.util.function.IntBinaryOperator;

public class MethodReferencesEx {

	public static void main(String[] args) {
		IntBinaryOperator oper;
		
		//���ٽ� ǥ�� �޼ҵ� ������
		oper = (x, y) -> Calculator.staticMethod(x, y);  
		System.out.println(oper.applyAsInt(10, 43));

		//���� �޼ҵ� ����
		oper = Calculator :: staticMethod;  
		System.out.println(oper.applyAsInt(14, 43));
		
		//���ٽ� ǥ�� �޼ҵ� ������
		Calculator cal = new Calculator();
		oper = (x,y) -> cal.instanceMethod(x, y);
		System.out.println(oper.applyAsInt(500, 1));
		
		//�ν��Ͻ� �޼ҵ� ����
		oper = cal::instanceMethod;
		System.out.println(oper.applyAsInt(500, 1));
		
	}

}

class Calculator{
	public static int staticMethod(int x, int y) {	//���� �޼ҵ� ����
		return x+y;
	}
	
	public int instanceMethod(int x, int y) {	//�ν��Ͻ� �޼ҵ� ����
		return x-y;
	}
}