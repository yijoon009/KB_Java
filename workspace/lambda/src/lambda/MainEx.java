package lambda;

public class MainEx {
	public static void main(String[] args) {
		
		//�͸� ���� ��ü
		MyFunctionInter fi = new MyFunctionInter() {
			
			@Override
			public void method() {
				System.out.println("Lambda");
			}
		};
		
		//�͸� ������ü�� ���� �޼ҵ� ���
		fi.method();
		
		
		//���ٽ�  ǥ��
		//���๮�� �ϳ��� {} ���� ����
//		MyFunctionInter fi2 = ()-> {System.out.println("lambda");};
		MyFunctionInter fi2 = ()-> System.out.println("lambda");
		
		//�޼ҵ� ���
		fi2.method();
		
		
		//�Ϲ� ���� ��ü�� ��üȭ
		RunImEx r1 = new RunImEx();
		RunIm r2 = ()->{System.out.println("���ٽ�");
						System.out.println(100-30);
		};
		
		//�͸� ���� ��üȭ
		/*RunIm r2 = new RunIm() {
			
			@Override
			public void abMethod() {
				System.out.println("���ٽ�");
			}
		};*/	// ';' �͸� ���� ��ü
	}
}


/*
 * () -> {syso("���ٽ�");}
 * */
 