package generic.method;

public class BoxingMedhodEx {

	public static void main(String[] args) {

		Box<Integer> box1 = Util.boxing(100);
		Box<String> box2 = Util.boxing("ȫ�浿");
		
		String stringvalue = box2.getT();
		System.out.println(stringvalue);
		
		Box<Double> box3 = Util.boxing(2.3);
		Box<Tv> box4 = Util.boxing(new Tv());
		
	}

}
