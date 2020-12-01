package test;

public class Head {
	String name;
	int time;
	int amount;
	int totalPrice=0;
	
	public Head() {;}

	public Head(String name, int time, int amount, int totalPrice) {
		super();
		this.name = name;
		this.time = time;
		this.amount = amount;
		this.totalPrice = totalPrice;
	}
}
