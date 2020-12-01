package product_cos_elec_office;

public class MakeupProduct {
	double price;
	int mcnt = 0; // °³¼ö
	
	public MakeupProduct(){}
	public MakeupProduct(double price) {this.price=((price+(price*0.5)));}
	
}

class Lipstic extends MakeupProduct{
	public Lipstic() {super(2000);}
	
	public String toString() {return "¸³½ºÆ½";}
}
class Soap extends MakeupProduct{
	public Soap() {super(500);}
	@Override
	public String toString() {return "ºñ´©";}
}
class Shampoo extends MakeupProduct{
	public Shampoo() {super(1000);}
	@Override
	public String toString() {return "¼¤Çª";}
}
