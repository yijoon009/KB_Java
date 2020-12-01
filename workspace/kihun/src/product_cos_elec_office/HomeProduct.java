package product_cos_elec_office;
//부모 클래스
public class HomeProduct {
	double price;
	int hcnt; // 판매량을 기록할 카운트
	public HomeProduct() {;}
	public HomeProduct(double price) {this.price=price*1.5;}
}

class Shave extends HomeProduct{
	public Shave() {super(1000);}
	
	@Override
	public String toString() {return "면도기";}
}

class Fan extends HomeProduct{
	public Fan() {super(50000);}
	@Override
	public String toString() {return "선풍기";}
}

class Electronic extends HomeProduct{
	public Electronic () {super(300000);}
	@Override
	public String toString() {return "전기담요";}
}