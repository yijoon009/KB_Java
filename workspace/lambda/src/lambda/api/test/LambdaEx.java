package lambda.api.test;

import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class LambdaEx {


//  5. 다음 배열 함목 중에 최대값 또는 최소값을 찾는 코드입니다. 
	// maxOrMin()메소드의 매개값을 람다식으로 기술해 보세요.
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	// 6. 다음은 학생의 영어 평균 점수와 수학 평균 점수를 계산하는 코드입니다. avg()메소드를 선언해 보세요
	
	private static Student[] students = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };
	
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for(Student st : students) {
			sum += function.applyAsInt(st);
		}
		double avg = (double)sum/students.length;
		return avg;
	}
	
	
	public static void main(String[] args) {
		
		// 최대값 얻기
		/*
		 *  int max = maxOrMin( (x,y)->{
         if(x>=y) return x; 
          else return y;
      }
      );
      System.out.println("최대값 : " + max);
      */
		int max = maxOrMin(
				// 여기에 코드하세요
				(a, b) -> {
					if (a >= b)return a;
					else return b;
				});
		System.out.println("최대값: " + max);

		// 최소값 얻기

		int min = maxOrMin(
				// 여기에 코드하세요
				(a, b) -> {
					if (a <= b)
						return a;
					else
						return b;
				});
		System.out.println("최소값 : " + min);
		
		
		double englishAvg = avg( s -> s.getEngScore() );

		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg( s -> s.getMathScore() );

		System.out.println("수학 평균 점수: " + mathAvg);
		
		
		}//end main


}

class Student1{
	String name;
	int engScore;
	int mathScore;
	public Student1(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	public Object getEnglishScore() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
	
}
