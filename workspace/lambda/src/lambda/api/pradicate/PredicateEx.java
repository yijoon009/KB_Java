package lambda.api.pradicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	static List<Student> list=Arrays.asList( new Student("홍길동", "남자", 90),
	         new Student("김순희", "여자", 90),
	         new Student("감자바", "남자", 95),
	         new Student("박한나", "여자", 92));
		
		private static double avg (Predicate<Student> predicate) {
			//avg()메소드 정의함
			int count = 0, sum = 0;
			for(Student student : list) {
				if(predicate.test(student)) {
					count++;
					sum += student.getScore();
				}
			}
			return (double) sum/count;
		}
		
		public static void main(String[] args) {
			double result =  avg( t ->  { return t.getGender().equals("남자"); 
				
			});
			
		}

}

class Student{
	String name;
	String gender;
	int score;
	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}