package p2;

import p2.OutterStatic.InnerStatic;

public class OutterStaticMain {
	public static void main(String[] args) {
		//1단계 외부와 상관없이 객체화 시킬 수 있다.
		InnerStatic is = new InnerStatic();
		is.iia = 300;
		is.iiaMethod();
		is.iisa = 100;
		
		//또는
		InnerStatic.iisa = 200;
		
		
		
		
		
		
		
	}
}
