package product_cos_elec_office;
//�θ� Ŭ����
public class HomeProduct {
	double price;
	int hcnt; // �Ǹŷ��� ����� ī��Ʈ
	public HomeProduct() {;}
	public HomeProduct(double price) {this.price=price*1.5;}
}

class Shave extends HomeProduct{
	public Shave() {super(1000);}
	
	@Override
	public String toString() {return "�鵵��";}
}

class Fan extends HomeProduct{
	public Fan() {super(50000);}
	@Override
	public String toString() {return "��ǳ��";}
}

class Electronic extends HomeProduct{
	public Electronic () {super(300000);}
	@Override
	public String toString() {return "������";}
}