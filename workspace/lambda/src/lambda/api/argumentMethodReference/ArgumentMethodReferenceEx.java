package lambda.api.argumentMethodReference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceEx {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		//항상 이거 치기 전에 추상메소드 어떻게 생겼는지 확인해
//		function = (a,b) -> a.compareToIgnoreCase(b);
		//compareToIgnoreCase의 클래스명 써줘야해
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("AB", "dd"));
		
		ToIntBiFunction<Integer, Integer> func;
		func = Integer::compare;
		print(func.applyAsInt(30, 44));
		
		
		
	}
	public static void print(int order) {
		if(order<0) System.out.println("사전순은로 먼저 옵니다.");
		else if(order == 0) System.out.println("동일한 문자열입니다.");
		else System.out.println("사전순으로 나중에 옵니다.");
	}

}
