package lambda.api.pradicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	static List<Student> list=Arrays.asList( new Student("ȫ�浿", "����", 90),
	         new Student("�����", "����", 90),
	         new Student("���ڹ�", "����", 95),
	         new Student("���ѳ�", "����", 92));
		
		private static double avg (Predicate<Student> predicate) {
			//avg()�޼ҵ� ������
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
			double result =  avg( t ->  { return t.getGender().equals("����"); 
				
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