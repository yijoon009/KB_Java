package toString;

import java.util.Date;

public class CardToString2 {
	public static void main(String[] args) {
		Card card = new Card();
		System.out.println(card.toString());
		
		Date date = new Date();
		System.out.println(date);
		
		String name = "�̼���";
		String name2 = new String("�̼���");
		System.out.println(name);
		System.out.println(name2);
	}
	
}
