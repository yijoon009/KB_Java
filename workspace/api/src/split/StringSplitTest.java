package split;

public class StringSplitTest {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȣ,�ڿ���,���ڹ�-�ֺ�ȣ";
		String[] names = text.split("&|,|-");	// | �� ���ԵȰ� �ƴ϶� �����ھ�
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}
