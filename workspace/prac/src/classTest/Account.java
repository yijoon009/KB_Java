package classTest;

public class Account {
	private String owner;
	private long balance;
	public Account() {;}
	
	public Account(String owner, long balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(long balance, String owner) {
		super();
		this.owner = owner;
		this.balance = balance;
	}

	public Account(long balance) {
		super();
		this.balance = balance;
	}
	public Account(String owner) {
		super();
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) {
		return this.balance+=amount;
	}
	 public long withdraw(long amount) {
		 return this.balance-=amount;
	 }
	public static void main(String[] args) {
		Account acc = new Account("±Ë¿Ã¡ÿ",10000);
		acc.withdraw(300);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
