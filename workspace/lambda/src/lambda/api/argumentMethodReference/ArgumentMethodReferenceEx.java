package lambda.api.argumentMethodReference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceEx {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		//�׻� �̰� ġ�� ���� �߻�޼ҵ� ��� ������� Ȯ����
//		function = (a,b) -> a.compareToIgnoreCase(b);
		//compareToIgnoreCase�� Ŭ������ �������
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("AB", "dd"));
		
		ToIntBiFunction<Integer, Integer> func;
		func = Integer::compare;
		print(func.applyAsInt(30, 44));
		
		
		
	}
	public static void print(int order) {
		if(order<0) System.out.println("���������� ���� �ɴϴ�.");
		else if(order == 0) System.out.println("������ ���ڿ��Դϴ�.");
		else System.out.println("���������� ���߿� �ɴϴ�.");
	}

}
