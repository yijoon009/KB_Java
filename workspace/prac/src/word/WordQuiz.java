package word;

import java.util.Scanner;

public class WordQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String word = "�ٴҶ��";
		String ans = null;
		int cnt=0;
		String ch;
		int num;
		
		while(true) {
			System.out.print("������� ���� ��ġ: ");
			num=sc.nextInt();
			cnt++;
			System.out.println(word.charAt(num-1));
			System.out.print("���� �� �ֽ��ϱ�? (Y/N)");
			ch = sc.next();
			if(ch.equals("Y")||ch.equals("y")) {
				System.out.print("� �ܾ��Դϱ�? ");
				ans = sc.next();
				if(ans.equals(word)) {
					System.out.println("�����Դϴ�~~~~~~~~!!!!!!!!");
					System.out.println(cnt+"�� ���� ������ϴ�.");
					break;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					continue;
				}
			}//end if
			else if(ch.equals("N")||ch.equals("n")) {
				continue;
			}//end else if
		}//end while
	}//end main
}//end class
