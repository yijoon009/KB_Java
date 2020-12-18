package lambda.api.test;

import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

public class Ex1 {

	//4번
	public static int method(int x, int y) {
		IntSupplier supplier = ()->{
			int result = x*10 + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	
	//5번
	private static int[] scores = {10, 50, 3};
	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for(int score:scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}
	
	//6번
	//학생의 영어,수학 평균점수
	private static Student[] students = {new Student("홍길동", 90, 96),
								new Student("김이준", 100, 100)};
	public static double avg(ToIntFunction<Student> func) {
		int sum=0;
		for(Student st : students) {
			sum += func.applyAsInt(st);
		}
		double avg = (double)sum/students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		//4번
		System.out.println(method(4, 8));
		
		//5번
		//최대값 얻기
		int max = maxOrMin((a, b)->{
			if(a>=b)return a;
			else return b;
		});
		System.out.println("최대값 : "+ max);
		//최솟값 얻기
		int min = maxOrMin((a,b)->{
			if(a<=b) return a;
			else return b;
		});
		System.out.println("최소값 : "+ min);
		
		//6번
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("영어 평균점수 : "+ engAvg);
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균점수 : "+ mathAvg);

		//7번 (6번을 메소드참조로)
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
