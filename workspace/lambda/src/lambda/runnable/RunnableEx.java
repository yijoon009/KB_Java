package lambda.runnable;

public class RunnableEx {

	public static void main(String[] args) {
		//runnable run 오버라이드
		Runnable runnable = () ->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		//다른 방법
		//스레드 부분에서 run()의 오버라이딩을 람다식으로 표현 함
		//Thread의 매개변수로 runnable을 넣어줌.
		//runnable이라고 명시하지 않았지만 애초에 Thread의 매개변수 타입은 Runnable로 지정되어 있음.
		Thread t1 = new Thread(() ->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		});
		t1.start();
	}

}
