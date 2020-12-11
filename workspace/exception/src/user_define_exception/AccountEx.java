package user_define_exception;

public class AccountEx {

	public static void main(String[] args) {
		Account acc = new Account();
		//�����ϱ�
		acc.deposit(10000);
		System.out.println("���ݾ�: "+acc.getBalance());
		
		//����ϱ�
		try {
			acc.withdraw(30000);
			System.out.println("���ݾ�: "+acc.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			
			//���߿� ������ ���α׷� ©��
//			if(message.equals("1004")) {//�̷��� �ൿ�� �ض�}
//			if(message.equals("1005")) {//�̷��� �ൿ�� �ض�}
			
			System.out.println(message);
			System.out.println();
			//�Ʒ� ���� ���� ������ ��������. only �����ڸ� ���� �޼ҵ�
			e.printStackTrace();
			System.out.println();
			System.out.println(e.toString());
		}
	}

}
