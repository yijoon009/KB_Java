package programm;

public class Student {
	int num;
	String name;
	int s1;
	int s2;
	int sum;
	double avg;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =  name;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int s1, int s2) {
		this.sum = s1+s2;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void Modify(int s1, int s2) {
		this.s1 = s1;
		this.s2 = s2;
		
		result();
	}
	public void result() {
		avg = sum/2.0;
	}
	
	
}
