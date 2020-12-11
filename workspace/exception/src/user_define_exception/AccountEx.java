package user_define_exception;

public class AccountEx {

	public static void main(String[] args) {
		Account acc = new Account();
		//예금하기
		acc.deposit(10000);
		System.out.println("예금액: "+acc.getBalance());
		
		//출금하기
		try {
			acc.withdraw(30000);
			System.out.println("예금액: "+acc.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			
			//나중에 본인이 프로그램 짤때
//			if(message.equals("1004")) {//이러한 행동을 해라}
//			if(message.equals("1005")) {//이러한 행동을 해라}
			
			System.out.println(message);
			System.out.println();
			//아래 글은 개발 끝나면 지워야해. only 개발자를 위한 메소드
			e.printStackTrace();
			System.out.println();
			System.out.println(e.toString());
		}
	}

}
