package p2;

public class OutterStatic {
	//인스턴스 멤버
	int ia = 10;
	void iaMethod() {
		InnerStatic.iisaMethod();
		System.out.println("이곳은 외부 클래스의 메소드부분입니다.  "+ ia);
	}
	
	//정적 멤버
	static int isa = 20;
	static void isaMethod() {
		
	}
	
	static class InnerStatic{
		//인스턴스 자신의 멤버
		int iia = 30;
		void iiaMethod() {
			//정적클래스 안에서는 정적변수만 사용 가능하다
//			ia+=40;
			iia -= 10;
			isa+=30;
			iiaMethod();
			
		}
		
		//정적 멤버
		static int iisa = 40;
		static void iisaMethod() {
			isa +=30;
			isaMethod();
		}
	}
	
	
	
	
	
	
	
	
	
}
