package lambda.api.operator;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
	
	private static int[] scores = {92, 96, 87, 67};
	private static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for(int score : scores) {
			//0: 92 92
			//1: 92 96
			//2: 92 87
			result = oper.applyAsInt(result, score);	
		}
		return result;
	}
	
	private static int notMinAndMax(IntBinaryOperator oper) {
		int result = scores[0];
		for(int score: scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	
	public static void main(String[] args) {
		int max = maxOrMin((a, b) -> {
			if(a>=b)return a;
			else return b;
		});
		
		int min = maxOrMin((a, b) -> {
			if(a>=b)return b;
			else return a;
		});
		
		System.out.println(max);
		System.out.println(min);
		
		int mid1 = notMinAndMax((a, b) -> {
			//a�� �߰����̶� �����ϸ�
			if(a!=max && a!=min) return a;
			else return b;
		});
		System.out.println(mid1);
		
		//���� �ε����� 4���϶�
		int mid2 = notMinAndMax((a, b) -> {
			if(a!=max && a!=min && a!=mid1) return a;
			else return b;
		});
		
		System.out.println(mid2);
			
		/*��ǻ� maxOrMin �̶� notMinAndMax �� ���� �޼ҵ�
		����Ҷ��� �ȿ� ��������� �ٸ��� �ϸ� ��.*/
		
	}//end main

}
