package classTest;

public class Rectangle {
	double wid;
	double dep;
	
	public Rectangle(double wid, double dep) {
		super();
		this.wid = wid;
		this.dep = dep;
	}
	
	public double getArea() {
		return wid*dep;
	}
	
	public double getCircumference() {
		return 2*(wid+dep);
	}
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(3.82, 8.65);
		System.out.println(rec.getArea());
		System.out.println(rec.getCircumference());
	}
}
