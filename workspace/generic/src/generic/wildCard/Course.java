package generic.wildCard;

public class Course<T> {
	private String name;	//�̸�
	private T[] students;	//�迭
	
	public Course(String name, int capacity) {
		super();
		this.name = name;
		students = (T[]) (new Object[capacity]);
		//Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n]���·� �迭�� ������ �� ����,
		//(T[]) (new Object[n]) ���·� �ؾ��մϴ�.
	}
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	
	//�迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
	
}
