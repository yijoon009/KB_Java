package date1125;

//인스턴스 내부 클래스 예제
public class Outter {
	//인스턴스 멤버
	int ia = 10;
	void iaMethod() {
		System.out.println("이곳은 외부 클래스의 메소드부분입니다.  "+ ia);
		
	}
	
	//정적 멤버
	static int isa = 20;
	static void isaMethod() {
		//내부 클래스 멤버 사용 불가
//		iia = 40;
	}
	
	class Inner{
		//자신의 멤버
		int iia = 30;
		void iiaMethod() {	//Outter멤버들 모두 사용할 수 있음 예)외부 윈도우화면. 내부 버튼클래스
			ia = ia+30;
			isa = isa + 40;
			iaMethod();
			Outter.isaMethod();
			System.out.println("이곳은 내부클래스 부분입니다.  "+ iia);
		}
		
		//불가한것들
//		static int iisa = 40;
//		static void iisaMethod() {}
		
	
	
	}
}
