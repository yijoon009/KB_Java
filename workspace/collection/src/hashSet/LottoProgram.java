package hashSet;

import java.util.*;

public class LottoProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> lotto = new HashSet<Integer>();
		int num;
		while (true) {
			System.out.println("-------���ƾ� �ζǰ� ���̴�.---------");
			System.out.println("[1] > lotto ��÷ , [2] break");
			int act = sc.nextInt();
			if( act == 1 ) {
			while (lotto.size() < 7) { // lotto �� 6�ڸ� �̹Ƿ� lotto.size�� < 6�� ��ŭ �ݺ� 
				num = (int) (Math.random() * 45) + 1;
				// 1~45 �������� (����)
				lotto.add(new Integer(num)); // ������ lotto�� �ִ´�
			}
			System.out.println("\n");
			System.out.println("�ζ� : "+lotto);
			
			//collection.sord(List<t> list);
			//set -> list�� �ٲٱ�
			List<Integer> list1 = new ArrayList<Integer>(lotto);
			
			System.out.println("������ ��");
			
			//�Ű��������� set�� �ȵ�
			//�׷��� list�� �����Ű�� ���ž�
			Collections.sort(list1);			
			for(int a: list1) {
				System.out.print(a+" ");
			}
			
			System.out.println("\n\n");
			lotto.removeAll(lotto); // �ʱ�ȭ
			}
			if ( act == 2 ) {
				break;
			}
		}

	}

}
