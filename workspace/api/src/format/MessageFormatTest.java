package format;

import java.text.MessageFormat;

public class MessageFormatTest {
	public static void main(String[] args) {
		String text = "회원 ID : {0}\n회원이름 : {1}\n회원전화번호 : {3}";
		String result1 = MessageFormat.format(text, "id1","홍길동","1234","111");
		System.out.println(result1);
		
	}
}
