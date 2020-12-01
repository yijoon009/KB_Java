package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		
		//전역변수는 new를 만나는 순간 메모리에서 해제
		//단, static 변수는 프로그램 종료시 메모리에서 해제
		
		
		AmsField af = new AmsField();
		ImageIcon img = new ImageIcon("src/img/main.jpg");
		String[] arPlane = new String[5];
		
		String[] menu = {"추가하기","검색하기","수정하기","삭제하기","목록보기"};
		
		
		int choice = 0;
		String insertMsg = "[추가하실 정보를 그대로 입력하세요 (,포함)]\n"
				+ "항공사, 상공기번호, 최대승객수(명), 출발지, 도착지";

		String searchMsg = "검색하실 항공사를 입력하세요. \n";
		
		//title : 윈도우 창 제일 위에 뜨는거
		//messageType: 박스 안에 아이콘같은거
		//icon : 아이콘,타입이 이미지 타입이어야 해.
		//options: 버튼, 배열로 구성되어 있음.0이 첫번째 1이 두번째,,,
		//initialValue : 맨처음 버튼잡힐, 선택될 영역
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, img, menu, null);
			
			System.out.println(choice);
			if(choice == -1) break;
			
			switch(choice) {
			//추가하기 영역
			case 0:
				arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
				af.insert(arPlane);
				break;
			//검색하기
			case 1:
				String keyword = JOptionPane.showInputDialog(searchMsg);
				JOptionPane.showMessageDialog(null,af.search(keyword));
				break;
			//수정하기
			case 2:
				break;
			//삭제하기
			case 3:
				break;
			//목록보기
			case 4:
				JOptionPane.showMessageDialog(null, af.show());
				break;
			}//버튼이라 default가 없어.
		}
		
		
		
		
		
		
		
		
		
		
	}
}
