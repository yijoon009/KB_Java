package phone;

//추상클래스 : 일반클래스 또는 추상메소드
public abstract class Phone {
	private String owner;
	private String telephone;
	private int price;
	
	public abstract void turnOn() ;	//추상메소드 {}가 없다.
	public abstract void thrnOff();
	
	public void aa() {};
	
	
	public Phone() {
		System.out.println("기본생성자");
	}

	public Phone(String owner, String telephone, int price) {
		super();
		this.owner = owner;
		this.telephone = telephone;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
