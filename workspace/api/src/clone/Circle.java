package clone;

public class Circle implements Cloneable {
	Point p;
	double r;
	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		obj = super.clone();
		return obj;
	}
	
	//얕은 복사
	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Circle)obj;
	}
	
	//깊은 복사
	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Circle c = (Circle) obj;
		//실제 내용을 넣기
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}
	
	@Override
	public String toString() {
		return "[p= "+p+", r= "+r+"]" ;
	}
}

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}














