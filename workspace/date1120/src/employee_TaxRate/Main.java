package employee_TaxRate;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Engineer engineer = new Engineer();
		Manager manager = new Manager();
		PartTime parttime = new PartTime();
		
		TaxRate taxRate = new TaxRate();
		
		taxRate.taxRateMethod(employee);
		taxRate.taxRateMethod(engineer);
		taxRate.taxRateMethod(manager);
		taxRate.taxRateMethod(parttime);
	}

}
