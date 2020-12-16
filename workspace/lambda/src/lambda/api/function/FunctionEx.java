package lambda.api.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FunctionEx {

	private static List<Student> list = Arrays.asList(new Student("ȫ�浿", 100, 90),
													new Student("������",100,100));
	
	//T : �Է� Ÿ��/ Student
	//R : ����Ÿ��/ String
	private static void printString(Function<Student, String> function) {
		for(Student student : list) {
			//R allpy(T t)
//			@Override
//			String apply(Student student) {
//				return student.getName();
//			}
			//�� ����
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	private static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student)+" ");
		}
	}
	
	
	private static void printLong(ToLongFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsLong(student) + " ");
		}
	}
	
	private static void printBiFun(BiFunction<String, Integer, String> bf) {
		System.out.println(bf.apply("�ҳ�Ÿ", 300));
	}
	
	private static void printToDoubleBi(ToDoubleBiFunction<Integer, Double> td) {
		System.out.println(td.applyAsDouble(10, 20.5));	//�޼ҵ� ȣ��
	}
	
	public static void main(String[] args) {
		
		System.out.println("�л��̸�");
		
		//���ٽ� ǥ��
		//Function <Student, String> function = t-> t.getName();
		
		//t ���� �ٸ� ���ĺ� �ᵵ ����.
		printString(t->t.getName());
		
		System.out.println("���� ����");
		printInt(t->t.getS1());
		System.out.println("���� ����");
		printInt(t->t.getS2()); 
		
		printBiFun((t,v) -> t+" "+v+"����");
		
		printToDoubleBi( (t, u) -> t*u );
		
	}

}
class Student{
	private String name;
	private int s1;
	private int s2;
	public Student() {;}
	public Student(String name, int s1, int s2) {
		super();
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	
}