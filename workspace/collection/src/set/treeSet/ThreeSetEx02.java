package set.treeSet;

import java.util.*;

public class ThreeSetEx02 {
	public static void main(String[] args) {
		//나이 순서대로 TreeSet에 담아주기
//		Set<Person> treeset =  new TreeSet<>();
//		treeset.add(new Person("홍길동", 30));
//		treeset.add(new Person("김길동", 35));
//		treeset.add(new Person("이길동", 10));
//		treeset.add(new Person("박길동", 40));
//		System.out.println(treeset);
		
		
		Set<Student> tset = new TreeSet<>();
		tset.add(new Student("가학교","박선생","김이준",100));
		tset.add(new Student("나학교","과학선생","박이준",70));
		tset.add(new Student("각기학교","무영선생","서이준",50));
		tset.add(new Student("학교","홍선생","한이준",90));
		tset.add(new Student("서사학교","김선생","조이준",85));
		
		System.out.println(tset);
	}
}


class Student implements Comparable<Student>{
	String school_name;
	String teacher_name;
	String name;
	int score;
	public Student() {;}
	public Student(String school_name, String teacher_name, String name, int score) {
		super();
		this.school_name = school_name;
		this.teacher_name = teacher_name;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "school_name=" + school_name + ", teacher_name=" + teacher_name + ", name=" + name + ", score="
				+ score ;
	}
	//이름순 - 오름ck순
	//이름+점수 순 - 오름차순
	@Override
	public int compareTo(Student o) {
		//점수순으로 (내림차순)
//		if(score < o.score) return 1;
//		else if(score == o.score) return 0;
//		else return -1;
		
		//학교명순으로 - 오름차순
		if(school_name.hashCode() < o.school_name.hashCode()) return -1;
		else if(school_name.hashCode() == o.school_name.hashCode()) return 0;
		else return 1;
	}
	
}




class Person implements Comparable<Person>{
	String name;
	int age;
	public Person() {;}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		//1. 비교할때 나이로 비교한다는것 표시 - 오름차순
//		if(age<o.age) return -1;	//age 트리에 달려있는 나이, o.age 트리에 새롭게 매달려야하는 나이
//		else if(age == o.age) return 0;
//		else return 1;
		
		//2. 이름으로 비교할때 - 오름차순
//		if(name.hashCode() < o.name.hashCode()) return -1;
//		else if (name.hashCode() == o.name.hashCode()) return 0;
//		else return 1;
		
		//3. 이름과 나이 순서대로 TreeSet에 추가 - 오름차순
//		if( (name.hashCode() + age) < (o.name.hashCode() + o.age) ) return -1;
//		else if( (name.hashCode()+age) == (o.name.hashCode() + o.age) ) return 0;
//		else return 1;
		
		//1. 비교할때 나이로 비교한다는것 표시 - 내림차순
		if(age<o.age) return 1;	//age 트리에 달려있는 나이, o.age 트리에 새롭게 매달려야하는 나이
		else if(age == o.age) return 0;
		else return -1;
		
		
	}
	
	
	
}