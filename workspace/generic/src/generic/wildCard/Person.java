package generic.wildCard;

public class Person {
	private String courseName;

	public Person() {;}
	
	public Person(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return  courseName ;
	}
	
	
}

class Worker extends Person{
	//부모의 기본생성자 반드시 필요해
	private String courseName;
	public Worker() {;}
	
	public Worker(String courseName) {
		//아래꺼 다 지우고 이렇게도 가능 
		//super(courseName);
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return courseName;
	}
	
	
	
}

class Student extends Person{
	private String courseName;
	
	public Student() {;}
	
	public Student(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return courseName;
	}
}

class HighStudent extends Student{
	private String courseName;
	public HighStudent() {;}
	
	public HighStudent(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return courseName;
	}
}












