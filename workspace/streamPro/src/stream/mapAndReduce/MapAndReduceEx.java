package stream.mapAndReduce;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MapAndReduceEx {

	public static void main(String[] args) {
		//1단계 : 컬렉션
		List<Student> list = Arrays.asList(new Student("홍길동", 10),
					new Student("김이준", 100), new Student("박동길", 80));
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		
		
		//컬랙션 : list
		//2단계 오리지널 스트림: stream()
		//중간 처리 스트림 : mapToint()
		//최종 처리 스트림 : avaerage()
		OptionalDouble avg1 = list.stream().mapToInt(Student::getScore).average();
		System.out.println("평균 점수 : "+avg1);
		
		//optionalDouble 클래스 자료를 일반형 double로 바꾸기
		double davg = avg1.getAsDouble();
		System.out.println(davg);
		
		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("평균 점수 : "+avg);
		
		
		
		
	}

}
class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
}