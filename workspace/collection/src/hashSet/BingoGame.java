package hashSet;

import java.util.*;

public class BingoGame {
	public static void main(String[] args) {

		Set bingo = new LinkedHashSet();
		int[][] board = new int[7][7]; // ������ 7*7
		System.out.println("���� ����");
		for (int i = 0; bingo.size() < 49; i++) {
			int num = ((int) (Math.random() * 99) + 1);
			bingo.add(num + "");
		}
		Iterator it = bingo.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				// string���� ���� ������ next()�� ��ȯ���� object�̱� ������ ����ȯ�� ���ؼ�
				// ������ Ÿ������ �ٲ���Ѵ�. 
				// ������ �����ϴٺ��� ���� ���ڰ� ����� ��ġ�� ���´ٴ� ����� �߰� 
				//	 ������ �������� �ʰ� ��ü���� ��Ŀ� ���� �����ϰ� �ȴ�.
				// HashSet���ٴ� LinkedHashSet�� ������
//				System.out.print("\t"+board[i][j]+"");
				System.out.print((board[i][j] < 10 ? "\t" : "\t") + board[i][j]);
			}
			System.out.println();
		}
		
	}
}
