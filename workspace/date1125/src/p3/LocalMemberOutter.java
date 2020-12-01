package p3;


public class LocalMemberOutter {
	//인스턴스 멤버
		int ia = 10;
		void iaMethod() {
			System.out.println("이곳은 외부 클래스의 메소드부분입니다.  "+ ia);
		}
		
		//정적 멤버
		static int isa = 20;
		static void isaMethod() {
			
		}
		void innerMethod() {
			
			class LocalInner{
				int inna = 10;
				void iinaMethod() {
					System.out.println("이곳은 로컬이너클래스 메소드입니다.");
				}
//				static innsa = 20;
				public LocalInner() {;}
				
				
				
			}//end localInner
			
			//localInner 클래스 객체화 시켜서 실행하는 코드 작성
			LocalInner li = new LocalInner();
			li.inna +=20;
		}//end innerMethod;
}











