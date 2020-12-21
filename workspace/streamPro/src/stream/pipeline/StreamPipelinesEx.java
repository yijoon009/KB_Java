package stream.pipeline;

import java.util.*;

public class StreamPipelinesEx {

	public static void main(String[] args) {
		/*
		 * List<Member> list = Arrays.asList( new Member("홍길동", Member.MALE, 30), new
		 * Member("김나리", Member.FEMALE, 20), new Member("신용권", Member.MALE, 45), new
		 * Member("박수미", Member.FEMALE, 27)); double ageAvg
		 * =list.stream().filter(m->m.getSex()==Member.FEMALE) .mapToInt(Member::getAge)
		 * .average() .getAsDouble(); System.out.println("여자 나이의 평균은 " + ageAvg);
		 */
		List<Student> list1 = Arrays.asList(new Student("1반", 100, 90), new Student("2반", 80, 100),
				new Student("1반", 70, 50), new Student("2반", 85, 100));
		int korSum = list1.stream().filter(s -> s.getBan().equals("1반")).mapToInt(Student::getKor).sum();
		System.out.println("1반의 국어점수의 합은 " + korSum);

		int engSum = list1.stream().filter(s -> s.getBan().equals("2반")).mapToInt(Student::getEng).sum();
		System.out.println("2반의 영어점수의 합은 " + engSum);

	}

}
class Member{
	   public static int MALE = 0;
	   public static int FEMALE = 1;
	   private String name;
	   private int sex;
	   private int age;
	   public Member(String name, int sex, int age) {
	      this.name = name;
	      this.sex = sex;
	      this.age = age;
	   }
	   public int getSex() {
	      return sex;
	   }
	   public int getAge() {
	      return age;
	   }
	}

	class Student{
	   String ban;
	   int kor;
	   int eng;
	   public Student(String ban, int kor, int eng) {
	      this.ban = ban;
	      this.kor = kor;
	      this.eng = eng;
	   }
	   public String getBan() {
	      return ban;
	   }
	   public int getEng() {
	      return eng;
	   }
	   public int getKor() {
	      return kor;
	   }
	}