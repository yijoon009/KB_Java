package product_cos_elec_office;

public class OfficeProduct {
	double price;
	int ocnt = 0;
	public OfficeProduct() {}
	public OfficeProduct(double price){this.price=((price+(price*0.5)));}
	
}
class AfourPaper extends OfficeProduct{
	AfourPaper(){super(10000);}
	@Override
	public String toString() {return "A4����";}
}
class Note extends OfficeProduct{
	public Note() {super(20000);}
	@Override
	public String toString() {return "��Ʈ";}
}
class Pen extends OfficeProduct{
	public Pen() {super(500);}
	@Override
	public String toString() {return "��";}
}
