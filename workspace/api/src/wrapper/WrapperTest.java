package wrapper;

public class WrapperTest {

	public static void main(String[] args) {

		int i = 100;
		//Boxing
		Integer ii = new Integer(200);

		//Un-Boxing
		byte bii = ii.byteValue();
		System.out.println(bii);
		
	}

}
