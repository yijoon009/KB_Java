package bakery;

public class BreadMaker implements Runnable{
	/*
	 * BreadPlate에 있는 eatBread()와 makeBread()를 사용하여 멀티 쓰레드를 구현한다.
	 * 두 메소드는 같은 필드의 자원에 접근해야 하기 때문에 필드를 공유해야 한다.
	 * 현재 파일인 BreadMaker에서는 makeBread()를 사용하기 위해서 BreadPlate필드를 할당한다.
	 * 할당한 주소값을 메인 쓰레드에 전달하여 eatBread()도 공유해야 하기 때문에
	 * 해당 필드의 주소를 리턴할 메소드인 getBreadPlate()를 선언해 준다.
	 * 메인 쓰레드에서는 BreadMaker 필드에 있는 getBreadPlate()를 통해서 필드의 주소를
	 * 공유할 수 있게 된다.
	 * 방법은 2가지가 있으며 아래와 같다.
	 * 1.외부에서 선언된 필드의 주소값을 생성자를 통해서 전달받아 필드를 공유한다.
	 * 2.현재 필드에서 선언된 필드의 주소값을 메소드를 통해 리턴해준다.
	 * 
	 * 
	 * 한줄요약
	 * 두 개의 쓰레드(먹기, 만들기)는 하나의 필드를 공유해야 한다.
	 * 
	 * */
	BreadPlate bread = new BreadPlate();
	
	//생성자(외부에서 선언한 필드의 주소를 전달받아서 현재 BreadPlate객체에 넣어준다(필드 공유)
//	public BreadMaker(BreadPlate bread) {
//		this.bread = bread;
//	}
	
	//메소드
	public BreadPlate getBreadPlate() {
		return bread;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			bread.makeBread();
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
		System.out.println("빵이 다 떨어졌습니다. 다음에 다시 오세요.");
	}
}
















