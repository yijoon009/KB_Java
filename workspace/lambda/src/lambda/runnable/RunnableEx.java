package lambda.runnable;

public class RunnableEx {

	public static void main(String[] args) {
		//runnable run �������̵�
		Runnable runnable = () ->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		//�ٸ� ���
		//������ �κп��� run()�� �������̵��� ���ٽ����� ǥ�� ��
		//Thread�� �Ű������� runnable�� �־���.
		//runnable�̶�� ������� �ʾ����� ���ʿ� Thread�� �Ű����� Ÿ���� Runnable�� �����Ǿ� ����.
		Thread t1 = new Thread(() ->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		});
		t1.start();
	}

}
