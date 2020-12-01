package pattern;

import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-3456";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ, ��ȭ��ȣ ������ �½��ϴ�.");
		}else {
			System.out.println("���Խİ� ����ġ, ��ȭ��ȣ ������ �ƴմϴ�.");
		}
		String regExp1 = "\\w+@\\w+\\.\\2+(\\.\\w+)?";
		String data1 = "algen@namer.com";
		boolean result1 = Pattern.matches(regExp1, data1);
		if(result) {
			System.out.println("���Խİ� ��ġ, �̸��� ������ �½��ϴ�.");
		}else {
			System.out.println("���Խİ� ����ġ, �̸��� ������ �ƴմϴ�.");
		}
		
	}

}
