package bakery;

public class BreadPlate {
//	���� �� 20�� �����.
//	�� �� 10���� ������ٸ� ������ �ʰ� ����Ѵ�.
//	10���� ���� ������ �ٽ� ���� �����.
	
//	�� ���� ������ 1��(���߱�)
//	�� �Դ� ������ 1��(�����)
	
	//���� ����
	int breadCnt;
	
	//���� ����
	int eatCnt;
	
	/*
	 * �����带 �����ϱ� ���ؼ��� ����ȭ�� ���־�� �Ѵ�.
	 * ���� ���ÿ� ���ݾ� ���� ���� ������ ������ �� ���� �����̴�.
	 * ���� ����ȭ �� �ϳ��� �����ϵ��� synchronizedŰ���带 �ۼ��Ͽ�
	 * �� �����带 ������ �� �ְ� �ȴ�.
	 */
	
	//�� �����
	public synchronized void makeBread() {
		//���� 9���� �Ѿ��
		if(breadCnt > 9) {
			//�޼��� ���
			System.out.println("���� ���� á���ϴ�.");
			//������ ����
			try {wait();} catch (InterruptedException e) {;}
		}
		//�����尡 ������ �ʾҴٸ� �� 1�� �����
		breadCnt++;
		System.out.println("���� 1�� ��������ϴ�. �� : " + breadCnt + "��");
	}
	
	//�� �Ա�
	public synchronized void eatBread() {
		//20���� �Ծ��ٸ�
		if(eatCnt == 20) {
			//�޼��� ���
			System.out.println("���� �� ���������ϴ�.");
		}else if(breadCnt < 1) {
			//���� ���� ���ٸ� ����
			System.out.println("���� ����� ���Դϴ�. ��� ��ٷ� �ּ���.");
		}else {
			//���� �� �ִ� ���¶��
			
			//�� ���� 1 ����
			breadCnt--;
			
			//���� ���� 1 ����
			eatCnt++;
			System.out.println("���� 1�� �Ծ����ϴ�. �� : " + breadCnt + "��");
			//���� ������ ����
			notify();
		}
	}
	
}








