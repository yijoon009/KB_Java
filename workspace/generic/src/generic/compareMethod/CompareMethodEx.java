package generic.compareMethod;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair(1, "���");
		Pair<Integer, String> p2 = new Pair(1, "���");
		
		//static �ƴҶ� ��ü���� �ؾ���
		Util u = new Util();
		
		boolean result = u.compare(p1, p2);
		System.out.println(result);
		if(result) {
			System.out.println("�������� ������ ��ü");
		}else {
			System.out.println("�������� �������� ���� ��ü");
		}
		
		Pair<String, String> p3 = new Pair("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair("user2", "ȫ�浿");
		result = u.compare(p3, p4);
		if(result) {
			System.out.println("�������� ������ ��ü");
		}else {
			System.out.println("�������� �������� ���� ��ü");
		}
		
		Pair<Integer, Boolean> p5 = new Pair(10, true);
		Pair<Integer, Boolean> p6 = new Pair(10, false);
		result = u.compare(p5, p6);
		if(result) {
			System.out.println("�������� ������ ��ü");
		}else {
			System.out.println("�������� �������� ���� ��ü");
		}
		
		Pair<Car, Integer> p7 = new Pair(new Car("�ҳ�Ÿ"), 10);
		Pair<Car, Integer> p8 = new Pair(new Car("�ҳ�Ÿ"), 10);
		result = u.compare(p7, p8);
		if(result) {
			System.out.println("�������� ������ ��ü");
		}else {
			System.out.println("�������� �������� ���� ��ü");
		}
	}

}

class Car{
	public String kind;

	public Car(String kind) {
		super();
		this.kind = kind;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		return result;
		//return kind.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Car other = (Car) obj;
//		if (kind == null) {
//			if (other.kind != null)
//				return false;
//		} else if (!kind.equals(other.kind))
//			return false;
//		return true;
		
		if (obj instanceof Car ) {
			Car car = (Car) obj;
			if (car.kind == kind) {
				return true;
			} else return false;
		} else return false;

	}
	
}





