package p3;


public class LocalMemberOutter {
	//�ν��Ͻ� ���
		int ia = 10;
		void iaMethod() {
			System.out.println("�̰��� �ܺ� Ŭ������ �޼ҵ�κ��Դϴ�.  "+ ia);
		}
		
		//���� ���
		static int isa = 20;
		static void isaMethod() {
			
		}
		void innerMethod() {
			
			class LocalInner{
				int inna = 10;
				void iinaMethod() {
					System.out.println("�̰��� �����̳�Ŭ���� �޼ҵ��Դϴ�.");
				}
//				static innsa = 20;
				public LocalInner() {;}
				
				
				
			}//end localInner
			
			//localInner Ŭ���� ��üȭ ���Ѽ� �����ϴ� �ڵ� �ۼ�
			LocalInner li = new LocalInner();
			li.inna +=20;
		}//end innerMethod;
}











