package format;

import java.text.MessageFormat;

public class MessageFormatTest {
	public static void main(String[] args) {
		String text = "ȸ�� ID : {0}\nȸ���̸� : {1}\nȸ����ȭ��ȣ : {3}";
		String result1 = MessageFormat.format(text, "id1","ȫ�浿","1234","111");
		System.out.println(result1);
		
	}
}
