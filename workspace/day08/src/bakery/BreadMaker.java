package bakery;

public class BreadMaker implements Runnable{
	/*
	 * BreadPlate�� �ִ� eatBread()�� makeBread()�� ����Ͽ� ��Ƽ �����带 �����Ѵ�.
	 * �� �޼ҵ�� ���� �ʵ��� �ڿ��� �����ؾ� �ϱ� ������ �ʵ带 �����ؾ� �Ѵ�.
	 * ���� ������ BreadMaker������ makeBread()�� ����ϱ� ���ؼ� BreadPlate�ʵ带 �Ҵ��Ѵ�.
	 * �Ҵ��� �ּҰ��� ���� �����忡 �����Ͽ� eatBread()�� �����ؾ� �ϱ� ������
	 * �ش� �ʵ��� �ּҸ� ������ �޼ҵ��� getBreadPlate()�� ������ �ش�.
	 * ���� �����忡���� BreadMaker �ʵ忡 �ִ� getBreadPlate()�� ���ؼ� �ʵ��� �ּҸ�
	 * ������ �� �ְ� �ȴ�.
	 * ����� 2������ ������ �Ʒ��� ����.
	 * 1.�ܺο��� ����� �ʵ��� �ּҰ��� �����ڸ� ���ؼ� ���޹޾� �ʵ带 �����Ѵ�.
	 * 2.���� �ʵ忡�� ����� �ʵ��� �ּҰ��� �޼ҵ带 ���� �������ش�.
	 * 
	 * 
	 * ���ٿ��
	 * �� ���� ������(�Ա�, �����)�� �ϳ��� �ʵ带 �����ؾ� �Ѵ�.
	 * 
	 * */
	BreadPlate bread = new BreadPlate();
	
	//������(�ܺο��� ������ �ʵ��� �ּҸ� ���޹޾Ƽ� ���� BreadPlate��ü�� �־��ش�(�ʵ� ����)
//	public BreadMaker(BreadPlate bread) {
//		this.bread = bread;
//	}
	
	//�޼ҵ�
	public BreadPlate getBreadPlate() {
		return bread;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			bread.makeBread();
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
		System.out.println("���� �� ���������ϴ�. ������ �ٽ� ������.");
	}
}
















