package p5;

public class Outter {
	int o1 = 10;
	void o1Method() {}
	
	//내부클래스
	class Inner{
		int i1 = 20;
		int o1 = 30;	//다른 클래스니까 동일명의 변수선언 가능
		void i1Method() {
			this.o1 += 100;
			System.out.println(o1);
		}
	}
}
