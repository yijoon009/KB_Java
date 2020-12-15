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
	//�θ��� �⺻������ �ݵ�� �ʿ���
	private String courseName;
	public Worker() {;}
	
	public Worker(String courseName) {
		//�Ʒ��� �� ����� �̷��Ե� ���� 
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












