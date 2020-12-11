package set.hashSet;

import java.util.*;

public class HashSetEx03 {
	public static void main(String[] args) {
		Set<Student> stu = new HashSet<Student>();
		stu.add(new Student("서울대", 2018, 10));	
		stu.add(new Student("서울대", 2018, 20));
		stu.add(new Student("서울대", 2018, 15));
		stu.add(new Student("서울대", 2018, 10));
		stu.add(new Student("아주대", 2020, 30));
		stu.add(new Student("아주대", 2020, 30));
		stu.add(new Student("아주대", 2020, 30));
		stu.add(new Student("고려대", 2019, 10));
		stu.add(new Student("고려대", 2019, 10));
		
		// —— 출력 
		Iterator<Student> itstu = stu.iterator();
		while(itstu.hasNext() ) {
			Student objStu = itstu.next();
			System.out.println(objStu);
		}

	}
}




class Student{
	String school; // 학교 
	int snum; // 학번 
	int num; // 번호
	
	public Student() {	}
	public Student(String school, int snum, int num ) {
		this.school=school; this.snum=snum; this.num=num;
	}
	@Override
	public String toString() {
		return "Student [school=" + school + ", snum=" + snum + ", num=" + num + "]";
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		result = prime * result + snum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num != other.num)
			return false;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		if (snum != other.snum)
			return false;
		return true;
	}

class Person{
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
	public int hashCode() {
		return (name+age).hashCode();
		//문자열의 유니코드갑소가 나이의 정수형 값을 더하면 해쉬코드값이 나옴.
		//문자가 동일하면 동일한 해쉬코드값이 나와서 동일인물+같은 나이인지 구별 가능
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && age==p.age;
			// 들어올 이름이 홍길동이냐, 들어올 나이가 30이냐. 두개가 참이여야지 참이다.
		}
		return false; // 다른 객체, false 리턴
	}
	
}
}