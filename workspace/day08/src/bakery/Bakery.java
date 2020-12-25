package bakery;

import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadMaker maker = new BreadMaker();
		
		//위에서 선언된 BreadMaker필드에 있는 BreadPlate 필드의 주소를 bread 객체에 전달해준다.
		//BreadMaker.java 주석 참고
		BreadPlate bread = maker.getBreadPlate();
		
		Thread maker_thread = new Thread(maker);
		
		//2개의 버튼을 만들기 위해 2칸 문자열 배열 선언
		String[] menu = {"빵 먹기", "나가기"};
		
		//빵 만들기 쓰레드 시작
		maker_thread.start();
		
		while(true) {
			//showOptionDialog() : 버튼을 만들 수 있는 대화상자
			//사용자가 클릭한 버튼의 인덱스를 리턴한다
			int choice = JOptionPane.showOptionDialog(null, "", "파리바게트", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, menu, null);
			
			if(choice == -1 || choice == 1) {
				/*나가기*/
				//어플리케이션 정상종료(전체종료)
				System.exit(0);
			}else if(choice == 0) {
				/*빵먹기*/
				bread.eatBread();
			}
			
			
		}
		
	}
}





