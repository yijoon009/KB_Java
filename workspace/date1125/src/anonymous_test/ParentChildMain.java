package anonymous_test;

public class ParentChildMain {
	public static void main(String[] args) {
		//�Ϲ����� ���
//		Child1 c1 = new Child1();
//		Child2 c2 = new Child2();
//		c1.p1();
//		c2.c2();
		
		int aa = 30;
		
		//�ٸ� ���
		//�߻� Ŭ������ ��üȭ
		//�߻� Ŭ������ �θ� �͸��ڽİ�ü�� ���� ����
		Parent p1 = new Parent() {
			
			int a=10;
			
			@Override
			public void ap1() {
				System.out.println("�͸� �ڽ� ��ü �߻�޼ҵ�");
				System.out.println(aa);
				ss();
			}
			public void ss() {
				a+=30;
				System.out.println(aa);}
		};
		
		//�Ϲ�Ŭ������ �θ� �͸��ڽİ�ü�� �����
		Parent2 p2 = new Parent2() {
			int a = 5;
			@Override
			public void c2() {
				// TODO Auto-generated method stub
				super.c2();
			}
			
			public void s2() {
				a+=20;
			}
		};	//�͸� ��ü��� ǥ��
		
		
		
	}
}
