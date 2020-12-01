package compare;

import java.util.Comparator;
import java.util.Objects;

public class CompareTest {
	public static void main(String[] args) {
		//��ü ���ϱ�
		Student s1 = new Student(16, "ȫ");
		Student s2 = new Student(13, "������");
		Student s3 = new Student(3, "���Ͽ�");
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		
		if(result==0) {
			System.out.println("������ȣ");
		}else if(result<0) {
			System.out.println("s1�� �չ�ȣ");
		}else {
			System.out.println("s2�� �չ�ȣ");
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
		
		//������
		@Override
		public int compare(Student o1, Student o2) {
			//��������
//			return Integer.compare(o1.sno, o2.sno);
			//��������
			return Integer.compare(o2.sno, o1.sno);
		}

		//���ڿ���
//		@Override
//		public int compare(Student o1, Student o2) {
//			return o1.name.compareTo(o2.name);
//		}
		
		
	}
	
}//end CompareTest


