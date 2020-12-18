package lambda.api.test;

import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

public class Ex1 {

	//4��
	public static int method(int x, int y) {
		IntSupplier supplier = ()->{
			int result = x*10 + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	
	//5��
	private static int[] scores = {10, 50, 3};
	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for(int score:scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}
	
	//6��
	//�л��� ����,���� �������
	private static Student[] students = {new Student("ȫ�浿", 90, 96),
								new Student("������", 100, 100)};
	public static double avg(ToIntFunction<Student> func) {
		int sum=0;
		for(Student st : students) {
			sum += func.applyAsInt(st);
		}
		double avg = (double)sum/students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		//4��
		System.out.println(method(4, 8));
		
		//5��
		//�ִ밪 ���
		int max = maxOrMin((a, b)->{
			if(a>=b)return a;
			else return b;
		});
		System.out.println("�ִ밪 : "+ max);
		//�ּڰ� ���
		int min = maxOrMin((a,b)->{
			if(a<=b) return a;
			else return b;
		});
		System.out.println("�ּҰ� : "+ min);
		
		//6��
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("���� ������� : "+ engAvg);
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("���� ������� : "+ mathAvg);

		//7�� (6���� �޼ҵ�������)
		engAvg = avg(Student::getEngScore);
	}
}
class Student{
	private String name;
	private int engScore;
	private int mathScore;
	public Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	public String getName() {
		return name;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	
}
