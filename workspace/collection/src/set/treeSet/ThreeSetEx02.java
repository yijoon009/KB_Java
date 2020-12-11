package set.treeSet;

import java.util.*;

public class ThreeSetEx02 {
	public static void main(String[] args) {
		//���� ������� TreeSet�� ����ֱ�
//		Set<Person> treeset =  new TreeSet<>();
//		treeset.add(new Person("ȫ�浿", 30));
//		treeset.add(new Person("��浿", 35));
//		treeset.add(new Person("�̱浿", 10));
//		treeset.add(new Person("�ڱ浿", 40));
//		System.out.println(treeset);
		
		
		Set<Student> tset = new TreeSet<>();
		tset.add(new Student("���б�","�ڼ���","������",100));
		tset.add(new Student("���б�","���м���","������",70));
		tset.add(new Student("�����б�","��������","������",50));
		tset.add(new Student("�б�","ȫ����","������",90));
		tset.add(new Student("�����б�","�輱��","������",85));
		
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
	//�̸��� - ����ck��
	//�̸�+���� �� - ��������
	@Override
	public int compareTo(Student o) {
		//���������� (��������)
//		if(score < o.score) return 1;
//		else if(score == o.score) return 0;
//		else return -1;
		
		//�б�������� - ��������
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
		
		//1. ���Ҷ� ���̷� ���Ѵٴ°� ǥ�� - ��������
//		if(age<o.age) return -1;	//age Ʈ���� �޷��ִ� ����, o.age Ʈ���� ���Ӱ� �Ŵ޷����ϴ� ����
//		else if(age == o.age) return 0;
//		else return 1;
		
		//2. �̸����� ���Ҷ� - ��������
//		if(name.hashCode() < o.name.hashCode()) return -1;
//		else if (name.hashCode() == o.name.hashCode()) return 0;
//		else return 1;
		
		//3. �̸��� ���� ������� TreeSet�� �߰� - ��������
//		if( (name.hashCode() + age) < (o.name.hashCode() + o.age) ) return -1;
//		else if( (name.hashCode()+age) == (o.name.hashCode() + o.age) ) return 0;
//		else return 1;
		
		//1. ���Ҷ� ���̷� ���Ѵٴ°� ǥ�� - ��������
		if(age<o.age) return 1;	//age Ʈ���� �޷��ִ� ����, o.age Ʈ���� ���Ӱ� �Ŵ޷����ϴ� ����
		else if(age == o.age) return 0;
		else return -1;
		
		
	}
	
	
	
}