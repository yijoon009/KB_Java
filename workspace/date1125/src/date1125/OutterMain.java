package date1125;


public class OutterMain {
	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.ia = 30;
		outter.iaMethod();
		
		//정적변수할때는 클래스명으로 접근해야해
		Outter.isa = 50;
		Outter.isaMethod();
		
		//내부클래스의 객체화 해야한다.
		//1. 바깥 클래스를 객체화시킨다
		//2. 내부 클래스를 객체화시킨다
		Outter.Inner oi = outter.new Inner();

		oi.iia = 50;
		oi.iiaMethod();
		System.out.println(oi.iia);
	
	
	
	
	
	
	}
}
