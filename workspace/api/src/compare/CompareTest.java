package compare;

import java.util.Comparator;
import java.util.Objects;

public class CompareTest {
	public static void main(String[] args) {
		//객체 비교하기
		Student s1 = new Student(16, "홍");
		Student s2 = new Student(13, "김지연");
		Student s3 = new Student(3, "최하연");
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		
		if(result==0) {
			System.out.println("같은번호");
		}else if(result<0) {
			System.out.println("s1이 앞번호");
		}else {
			System.out.println("s2가 앞번호");
		}
	}
	static class Student{
		int sno;
		String name;
		public Student(int sno, String name) {
			super();
			this.sno = sno;
			this.name = name;
		}
	}
	static class StudentComparator implements Comparator<Student>{
		
		//정수비교
		@Override
		public int compare(Student o1, Student o2) {
			//오름차순
//			return Integer.compare(o1.sno, o2.sno);
			//내림차순
			return Integer.compare(o2.sno, o1.sno);
		}

		//문자열비교
//		@Override
//		public int compare(Student o1, Student o2) {
//			return o1.name.compareTo(o2.name);
//		}
		
		
	}
	
}//end CompareTest


