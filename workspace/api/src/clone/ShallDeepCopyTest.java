package clone;

public class ShallDeepCopyTest {
	public static void main(String[] args) {
		/*
		 * ���� ���� (Object Ŭ���� clone())
		 *  - �⺻�� �� ����
		 *  - ��ü�� �ּ� ����
		 *  Car c = new Car();
		 *  ���������� ����Ű�� �ּҰ� �����ϹǷ�
		 *  �������� ���� �ٲٸ� ���� �ٲ��.
		 * 
		 * ���� ���� (
		 *  - �ڼ�Ŭ������ �θ�Ŭ���� (Object Ŭ���� clone()) ����
		 *  - �ڼ� Ŭ������ �������ؼ� clone()�� ����
		 *  */
		
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();	//shallow
		Circle c3 = c1.deepCopy();	//deep
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("c3 : "+c3);
		
		//�����ϱ�
		c1.p.x = 9;
		c1.p.y = 10;
		c1.r = 30;
		
		System.out.println("���� ��");
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("c3 : "+c3);
	
		
		
		
		
	}
}
