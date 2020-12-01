package pattern;

import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-3456";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치, 전화번호 형식이 맞습니다.");
		}else {
			System.out.println("정규식과 불일치, 전화번호 형식이 아닙니다.");
		}
		String regExp1 = "\\w+@\\w+\\.\\2+(\\.\\w+)?";
		String data1 = "algen@namer.com";
		boolean result1 = Pattern.matches(regExp1, data1);
		if(result) {
			System.out.println("정규식과 일치, 이메일 형식이 맞습니다.");
		}else {
			System.out.println("정규식과 불일치, 이메일 형식이 아닙니다.");
		}
		
	}

}
