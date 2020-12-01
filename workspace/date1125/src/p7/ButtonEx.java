package p7;

public class ButtonEx {
	int a=20;
	static int sa = 30;
	void aMethod() {
		new OnClickListenner() {
			
			
		};
	}
	
	
	interface OnClickListenner{
		default void dMethod() {
			sa+=20;
		}
	}
}
