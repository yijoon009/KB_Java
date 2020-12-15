package generic.wildCard;

public class Course<T> {
	private String name;	//이름
	private T[] students;	//배열
	
	public Course(String name, int capacity) {
		super();
		this.name = name;
		students = (T[]) (new Object[capacity]);
		//타입 파라미터로 배열을 생성하려면 new T[n]형태로 배열을 생성할 수 없고,
		//(T[]) (new Object[n]) 형태로 해야합니다.
	}
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	
	//배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
	
}
