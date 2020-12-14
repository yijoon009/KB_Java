package generic;

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv, String, Integer> productTv = new Product();
		//스마트tv, sc-1001, 2000000
		//인터넷Tv, in-2001, 1000000
		productTv.setKind(new Tv());
		
		
		//Car 클래스에서 
		//국내자동차, 소나타, 30000000
		//외제차, BMW, 100000000
		
		
		
		
	}
}

class Product<T, M, I>{
	private T kind;
	private M model;
	private I price;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public I getPrice() {
		return price;
	}
	public void setPrice(I price) {
		this.price = price;
	}
	
}


class Tv{
	public Tv() {;}
	
}