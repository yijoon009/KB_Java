package cosmetic_home_office;

public class Product {
	String div;
	String name;
	int realPrice;
	double price;
	int amount;
	int saleSum;
	
	public Product(String name, int realPrice, double percent) {
		super();
		this.name = name;
		this.realPrice = realPrice;
		this.price =(int)(this.realPrice*percent);
	}
	
	protected void input(int amount) {
		this.amount += amount;
		this.saleSum += price*amount;
	}
	
}
