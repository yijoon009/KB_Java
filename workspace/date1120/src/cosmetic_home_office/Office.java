package cosmetic_home_office;

public class Office extends Product{
	public Office(String name, int realprice) {
		super(name, realprice, 1.2);
		this.div = "사무용품";
	}
}
