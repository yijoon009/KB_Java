package hashSet;

import java.util.*;

public class BingoGame {
	public static void main(String[] args) {

		Set bingo = new LinkedHashSet();
		int[][] board = new int[7][7]; // 빙고판 7*7
		System.out.println("빙고 빙고");
		for (int i = 0; bingo.size() < 49; i++) {
			int num = ((int) (Math.random() * 99) + 1);
			bingo.add(num + "");
		}
		Iterator it = bingo.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				// string으로 받은 이유는 next()의 반환값이 object이기 때문에 형변환을 통해서
				// 원래의 타입으로 바꿔야한다. 
				// 여러번 실행하다보면 같은 숫자가 비슷한 위치에 나온다는 사실을 발견 
				//	 순서를 보장하지 않고 자체적인 방식에 따라 저장하게 된다.
				// HashSet보다는 LinkedHashSet이 나을듯
//				System.out.print("\t"+board[i][j]+"");
				System.out.print((board[i][j] < 10 ? "\t" : "\t") + board[i][j]);
			}
			System.out.println();
		}
		
	}
}
