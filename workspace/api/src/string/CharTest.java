package string;

public class CharTest {

	public static void main(String[] args) {
		String ssn1 = "010624-1230123";
		String ssn2 = "010624-1230123";
		String ssn3 = new String("010624-1230123");
		
		if(ssn1==ssn2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
	}

}
