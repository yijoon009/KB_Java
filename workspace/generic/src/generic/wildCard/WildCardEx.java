package generic.wildCard;

import java.util.Arrays;

public class WildCardEx {

	public static void registerCourse(Course<?> c) {	// ? ��� ���� ���� �� �ִ�
		System.out.println(c.getName()+" ������ : " + Arrays.toString(c.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> c) {	//Student �ǰ� �� ����Ŭ���� ����
		System.out.println(c.getName()+" ������ : " + Arrays.toString(c.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> c) {	//Worker �ǰ� �� ���� Ŭ���� ����
		System.out.println(c.getName()+" ������ : " + Arrays.toString(c.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personC = new Course<>("�Ϲ��� ����", 5);
		personC.add(new Person("�Ϲ���"));
		personC.add(new Worker("������"));
		personC.add(new Student("�л�"));
		
		Course<Worker> workerC = new Course<>("������ ����", 5);
		workerC.add(new Worker("������"));
		
		//T�� Worker�� �����߱� ������ person, student �Ѵ� �ȵ�
		//workerC.add(new Person("�Ϲ���"));
		//workerC.add(new Student("�л�"));
		
		Course<Student> studentC = new Course<>("�л� ����", 5);
		studentC.add(new Student("�л�"));
		studentC.add(new HighStudent("����л�"));
		
		registerCourse(personC);
		registerCourse(workerC);
		registerCourse(studentC);
		
		//person�� student���� ����Ŭ�����ϱ� �Ұ�
		//registerCourseStudent(personC);
		registerCourseWorker(workerC);
		registerCourseStudent(studentC);
		
		
	}

}












