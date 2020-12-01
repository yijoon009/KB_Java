package classTest;

public class SalaryMan {
	int salary;
	
	public SalaryMan() {
		salary = 1000000;
	}
	
	public SalaryMan(int salary) {
		super();
		this.salary = salary;
	}

	int getAnnualGross() {
		return salary*12+salary*5;
	}
	
	public static void main(String[] args) {
		
		 System.out.println(new SalaryMan().getAnnualGross()); 
		 System.out.println(new SalaryMan(2_000_000).getAnnualGross()); 
	}
}
