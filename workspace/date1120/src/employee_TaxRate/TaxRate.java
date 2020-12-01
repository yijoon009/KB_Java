package employee_TaxRate;
//세금 계산 비즈니스 로직
public class TaxRate {
	public void taxRateMethod(Employee e) {
		
		//맨처음부터 e instanceof Employee로 하면 전부 employee로 나와.
		//문법상 오류는 없지만 논리적으로 잘못됨.
		
		if(e instanceof Manager) {
			//down-casting
			Manager manager = (Manager) e;
			System.out.println("Manager 세금 계산하기"+manager.money*manager.taxRate);
		}else if(e instanceof Engineer) {
			Engineer engineer = (Engineer) e;
			System.out.println("Engineer 세금 계산하기"+engineer.money*engineer.taxRate);
		}else if(e instanceof PartTime){
			PartTime parttime = (PartTime) e;
			System.out.println("Parttime 세금 계산하기"+parttime.money*parttime.taxrate);
		}else if(e instanceof Employee) {
			System.out.println("Employee 세금 계산하기"+e.money*e.taxRate);
		}
	}
}
