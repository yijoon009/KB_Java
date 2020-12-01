package classTest;

public class Cylinder {
	Circle round;
	double hei;
	
	public Cylinder(Circle round, double hei) {
		super();
		this.round = round;
		this.hei = hei;
	}

	double getVolume() {
		return round.getArea()*hei;
	}
	
	public static void main(String[] args) {
		Cylinder cy = new Cylinder(new Circle(2.8),5.6);
		System.out.println(cy.getVolume());
		
		
	}
}
