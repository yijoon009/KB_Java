package hashSet;

import java.util.*;

public class LottoProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> lotto = new HashSet<Integer>();
		int num;
		while (true) {
			System.out.println("-------기훈아 로또가 답이다.---------");
			System.out.println("[1] > lotto 추첨 , [2] break");
			int act = sc.nextInt();
			if( act == 1 ) {
			while (lotto.size() < 7) { // lotto 는 6자리 이므로 lotto.size를 < 6개 만큼 반복 
				num = (int) (Math.random() * 45) + 1;
				// 1~45 랜덤변수 (난수)
				lotto.add(new Integer(num)); // 랜덤을 lotto에 넣는다
			}
			System.out.println("\n");
			System.out.println("로또 : "+lotto);
			
			//collection.sord(List<t> list);
			//set -> list로 바꾸기
			List<Integer> list1 = new ArrayList<Integer>(lotto);
			
			System.out.println("정렬한 후");
			
			//매개변수값에 set은 안돼
			//그래서 list로 변경시키고 쓴거야
			Collections.sort(list1);			
			for(int a: list1) {
				System.out.print(a+" ");
			}
			
			System.out.println("\n\n");
			lotto.removeAll(lotto); // 초기화
			}
			if ( act == 2 ) {
				break;
			}
		}

	}

}
