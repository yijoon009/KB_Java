package date1125;


public class OutterMain {
	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.ia = 30;
		outter.iaMethod();
		
		//���������Ҷ��� Ŭ���������� �����ؾ���
		Outter.isa = 50;
		Outter.isaMethod();
		
		//����Ŭ������ ��üȭ �ؾ��Ѵ�.
		//1. �ٱ� Ŭ������ ��üȭ��Ų��
		//2. ���� Ŭ������ ��üȭ��Ų��
		Outter.Inner oi = outter.new Inner();

		oi.iia = 50;
		oi.iiaMethod();
		System.out.println(oi.iia);
	
	
	
	
	
	
	}
}
