package p2;

import p2.OutterStatic.InnerStatic;

public class OutterStaticMain {
	public static void main(String[] args) {
		//1�ܰ� �ܺο� ������� ��üȭ ��ų �� �ִ�.
		InnerStatic is = new InnerStatic();
		is.iia = 300;
		is.iiaMethod();
		is.iisa = 100;
		
		//�Ǵ�
		InnerStatic.iisa = 200;
		
		
		
		
		
		
		
	}
}
