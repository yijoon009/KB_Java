package employee_TaxRate;
//���� ��� ����Ͻ� ����
public class TaxRate {
	public void taxRateMethod(Employee e) {
		
		//��ó������ e instanceof Employee�� �ϸ� ���� employee�� ����.
		//������ ������ ������ �������� �߸���.
		
		if(e instanceof Manager) {
			//down-casting
			Manager manager = (Manager) e;
			System.out.println("Manager ���� ����ϱ�"+manager.money*manager.taxRate);
		}else if(e instanceof Engineer) {
			Engineer engineer = (Engineer) e;
			System.out.println("Engineer ���� ����ϱ�"+engineer.money*engineer.taxRate);
		}else if(e instanceof PartTime){
			PartTime parttime = (PartTime) e;
			System.out.println("Parttime ���� ����ϱ�"+parttime.money*parttime.taxrate);
		}else if(e instanceof Employee) {
			System.out.println("Employee ���� ����ϱ�"+e.money*e.taxRate);
		}
	}
}
