package generic.extendsEx;

public class ChildProductStorageEx {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		System.out.println(product.getCompany());
		
		Product<Tv, String> product1 = new ChildProduct<>();
		product1.setKind(new Tv());
		product1.setModel("StartTV1");
		System.out.println(product1.getKind());
		System.out.println(product1.getModel());
		
		
		StorageImpl<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		System.out.println(tv);
		
		
		
		
		
		
		
		
	}

}
