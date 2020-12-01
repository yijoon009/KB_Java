package word;

import java.util.Scanner;

public class WordQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String word = "바닐라라떼";
		String ans = null;
		int cnt=0;
		String ch;
		int num;
		
		while(true) {
			System.out.print("보고싶은 글자 위치: ");
			num=sc.nextInt();
			cnt++;
			System.out.println(word.charAt(num-1));
			System.out.print("맞출 수 있습니까? (Y/N)");
			ch = sc.next();
			if(ch.equals("Y")||ch.equals("y")) {
				System.out.print("어떤 단어입니까? ");
				ans = sc.next();
				if(ans.equals(word)) {
					System.out.println("정답입니다~~~~~~~~!!!!!!!!");
					System.out.println(cnt+"번 만에 맞췄습니다.");
					break;
				}else {
					System.out.println("틀렸습니다.");
					continue;
				}
			}//end if
			else if(ch.equals("N")||ch.equals("n")) {
				continue;
			}//end else if
		}//end while
	}//end main
}//end class
