package date1125;

//�ν��Ͻ� ���� Ŭ���� ����
public class Outter {
	//�ν��Ͻ� ���
	int ia = 10;
	void iaMethod() {
		System.out.println("�̰��� �ܺ� Ŭ������ �޼ҵ�κ��Դϴ�.  "+ ia);
		
	}
	
	//���� ���
	static int isa = 20;
	static void isaMethod() {
		//���� Ŭ���� ��� ��� �Ұ�
//		iia = 40;
	}
	
	class Inner{
		//�ڽ��� ���
		int iia = 30;
		void iiaMethod() {	//Outter����� ��� ����� �� ���� ��)�ܺ� ������ȭ��. ���� ��ưŬ����
			ia = ia+30;
			isa = isa + 40;
			iaMethod();
			Outter.isaMethod();
			System.out.println("�̰��� ����Ŭ���� �κ��Դϴ�.  "+ iia);
		}
		
		//�Ұ��Ѱ͵�
//		static int iisa = 40;
//		static void iisaMethod() {}
		
	
	
	}
}
