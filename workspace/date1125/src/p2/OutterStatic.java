package p2;

public class OutterStatic {
	//�ν��Ͻ� ���
	int ia = 10;
	void iaMethod() {
		InnerStatic.iisaMethod();
		System.out.println("�̰��� �ܺ� Ŭ������ �޼ҵ�κ��Դϴ�.  "+ ia);
	}
	
	//���� ���
	static int isa = 20;
	static void isaMethod() {
		
	}
	
	static class InnerStatic{
		//�ν��Ͻ� �ڽ��� ���
		int iia = 30;
		void iiaMethod() {
			//����Ŭ���� �ȿ����� ���������� ��� �����ϴ�
//			ia+=40;
			iia -= 10;
			isa+=30;
			iiaMethod();
			
		}
		
		//���� ���
		static int iisa = 40;
		static void iisaMethod() {
			isa +=30;
			isaMethod();
		}
	}
	
	
	
	
	
	
	
	
	
}
