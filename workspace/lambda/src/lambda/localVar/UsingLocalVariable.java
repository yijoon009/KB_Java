package lambda.localVar;

public class UsingLocalVariable {
	public static void method(int arg) {
		int localVar = 40;	//���ú���
		
		//final�� Ư¡�� ������ �ֱ� ������ �ٲ� �� ����.
		//localVar += 100;	
		//arg -= 10;	
		
		//���ٽ� ����
		//�������̽��� ���� = () -> {...};
		MyFunctionInterface fi = () ->{
			System.out.println("arg : "+arg);
			System.out.println("localVar : "+localVar);
		};//end fi
		
		//���ٽ����� ������ �Լ�(�޼ҵ�)�� ȣ����
		fi.method1();
		
	}//end method
	
	
	
	
	
	
	
	public static void main(String[] args) {
		method(500);
	}
}
