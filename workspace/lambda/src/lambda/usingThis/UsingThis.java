package lambda.usingThis;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {
			MyFunctionInterface fi = () -> {
				//�ܺ� ���� �ʵ���� �Ȱ��� ��츦 �����ϰ��� �Ʒ� ���ó�� ���
				System.out.println("outterField : "+outterField);
				System.out.println("outterField : "+UsingThis.this.outterField);
				
				System.out.println("innerField : "+innerField);
				System.out.println("innerField : "+this.innerField);
			};	//�͸�ü ����
			
			//�޼ҵ� ȣ��
			fi.method1();
		}
		
	}
}
