package classAPI;

public class ClassTest {
	public static void main(String[] args) {
//		Class c = new Class();
		
		//�����ڰ� ���� ���, Ŭ���� API ���
//		Class class1 = car.getClass();
		
		// Class Ŭ����
				/*
				Ŭ������ ���� ������ ��� ���� Ŭ����, class Ŭ������ �����ڰ� ���� ����.
				ClassLoader Ŭ������ defineClass()�޼ҵ带 �̿��ؼ� Ŭ���� ��ü�� ���� �� ������,
				���� ����� �ƴ�.
				ObjectŬ������ �ִ� getClass(); �޼ҵ带 �̿��ϴ� ���� �Ϲ��� 
				 */
				Car car = new Car();
				car.getClass(); // getClass �� ���ؼ� class�� �����. 
				
				Class clazz1 = car.getClass();// �����ڰ� ���� ����� Ŭ���� Api��뿹
				String name = clazz1.getName(); // Ŭ������ �̸��� �����Ѵ�
				String sname = clazz1.getSimpleName(); // 
				clazz1.getPackage(); // Ŭ������ ��Ű�� ������ ��Ű�� Ŭ���� Ÿ������ �����Ѵ�.
	}
}

class Car{
	
}
