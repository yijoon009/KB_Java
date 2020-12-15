package generic.wildCard;

import java.util.Arrays;

public class WildCardEx {

	public static void registerCourse(Course<?> c) {	// ? 모든 과정 담을 수 있다
		System.out.println(c.getName()+" 수강생 : " + Arrays.toString(c.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> c) {	//Student 되고 그 하위클래스 가능
		System.out.println(c.getName()+" 수강생 : " + Arrays.toString(c.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> c) {	//Worker 되고 그 상위 클래스 가능
		System.out.println(c.getName()+" 수강생 : " + Arrays.toString(c.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personC = new Course<>("일반인 과정", 5);
		personC.add(new Person("일반인"));
		personC.add(new Worker("직장인"));
		personC.add(new Student("학생"));
		
		Course<Worker> workerC = new Course<>("직장인 과정", 5);
		workerC.add(new Worker("직장인"));
		
		//T를 Worker로 지정했기 때문에 person, student 둘다 안돼
		//workerC.add(new Person("일반인"));
		//workerC.add(new Student("학생"));
		
		Course<Student> studentC = new Course<>("학생 과정", 5);
		studentC.add(new Student("학생"));
		studentC.add(new HighStudent("고등학생"));
		
		registerCourse(personC);
		registerCourse(workerC);
		registerCourse(studentC);
		
		//person은 student보다 상위클래스니까 불가
		//registerCourseStudent(personC);
		registerCourseWorker(workerC);
		registerCourseStudent(studentC);
		
		
	}

}












