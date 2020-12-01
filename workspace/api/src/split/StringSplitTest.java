package split;

public class StringSplitTest {
	public static void main(String[] args) {
		String text = "홍길동&이수호,박연수,김자바-최병호";
		String[] names = text.split("&|,|-");	// | 는 포함된게 아니라 연산자야
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}
