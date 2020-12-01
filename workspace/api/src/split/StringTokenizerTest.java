package split;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���-������";
		
		
		StringTokenizer st = new StringTokenizer(text, "/|-");
		int count = st.countTokens();
		System.out.println(count);
//		for (int i = 0; i < count; i++) {
//			String tokenValue = st.nextToken();
//			boolean hmt = st.hasMoreTokens();
//			System.out.println("���������� true, ������ false : "+hmt);
//			System.out.println(tokenValue);
//			
//		}
		System.out.println("==================");
		while(st.hasMoreTokens()) {
			String tokenValue = st.nextToken();
			System.out.println(tokenValue);
			
		}
	}
}
