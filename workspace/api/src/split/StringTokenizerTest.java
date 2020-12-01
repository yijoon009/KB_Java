package split;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수-김이준";
		
		
		StringTokenizer st = new StringTokenizer(text, "/|-");
		int count = st.countTokens();
		System.out.println(count);
//		for (int i = 0; i < count; i++) {
//			String tokenValue = st.nextToken();
//			boolean hmt = st.hasMoreTokens();
//			System.out.println("남아있으면 true, 없으면 false : "+hmt);
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
