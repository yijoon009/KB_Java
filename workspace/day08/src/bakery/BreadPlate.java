package bakery;

public class BreadPlate {
//	빵을 총 20개 만든다.
//	그 중 10개를 만들었다면 만들지 않고 대기한다.
//	10보다 작을 때에는 다시 빵을 만든다.
	
//	빵 굽는 쓰레드 1개(멈추기)
//	빵 먹는 쓰레드 1개(깨우기)
	
	//만든 개수
	int breadCnt;
	
	//먹은 개수
	int eatCnt;
	
	/*
	 * 쓰레드를 제어하기 위해서는 동기화를 해주어야 한다.
	 * 만약 동시에 조금씩 여러 개가 들어오면 제어할 수 없기 때문이다.
	 * 따라서 동기화 후 하나씩 접근하도록 synchronized키워드를 작성하여
	 * 각 쓰레드를 제어할 수 있게 된다.
	 */
	
	//빵 만들기
	public synchronized void makeBread() {
		//빵이 9개를 넘어가면
		if(breadCnt > 9) {
			//메세지 출력
			System.out.println("빵이 가득 찼습니다.");
			//쓰레드 멈춤
			try {wait();} catch (InterruptedException e) {;}
		}
		//쓰레드가 멈추지 않았다면 빵 1개 만들기
		breadCnt++;
		System.out.println("빵을 1개 만들었습니다. 총 : " + breadCnt + "개");
	}
	
	//빵 먹기
	public synchronized void eatBread() {
		//20개를 먹었다면
		if(eatCnt == 20) {
			//메세지 출력
			System.out.println("빵이 다 떨어졌습니다.");
		}else if(breadCnt < 1) {
			//먹을 빵이 없다면 들어옴
			System.out.println("빵을 만드는 중입니다. 잠시 기다려 주세요.");
		}else {
			//먹을 수 있는 상태라면
			
			//빵 개수 1 감소
			breadCnt--;
			
			//먹은 개수 1 증가
			eatCnt++;
			System.out.println("빵을 1개 먹었습니다. 총 : " + breadCnt + "개");
			//멈춘 쓰레드 깨움
			notify();
		}
	}
	
}








