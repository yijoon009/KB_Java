

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMethod extends Account {
	Scanner sc = new Scanner (System.in);
	AccountException ae = new AccountException();
	Account acc = new Account();

	private ArrayList contractList = new ArrayList<>();
	public AccountMethod () {
		contractList = new ArrayList<Account>();
	} 
	// ---------------------함수 구현---
	public void contractCategory() throws AuthenException { // 신규회원의 가입 선택
		System.out.println("----Contract----");
		System.out.print("Check Plz > 1.individual | 2.individual Business | 3.Foreigner \n >");
		customerCategory = sc.nextInt();
		if(customerCategory == 1 ) {
			contractIndividual();
		} else if (customerCategory == 2 ) {
			contractBusiness();
		} else if (customerCategory == 3 ) {
			contractForeigner();
		}
	}
	public void contractIndividual() throws AuthenException {
		boolean name = true,socialNum = true,email=true,phone=true;

		try { 
			Account account = new Account(); 
			do {
				try {
					System.out.print("what your Name >");
					account.setCustomerName(sc.next());
					ae.nameCheck(account.getCustomerName());
					name = false;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			} while (name);
			do {
				try {
					System.out.print("your Social Security Number >");
					account.setSocialNumber(sc.next());
					ae.socialNumCheck(account.getSocialNumber());
					socialNum = false;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			} while (socialNum);

			do {
				try {
					System.out.print("what specifications do you want?"
							+ "\n |1. e-mail |2. mobile |3. post |\n >");
					specification = sc.nextInt();
					if ( specification == 1 ) {
						account.emailApply = true;
						System.out.print("e-mail Input >");
						account.setEmail(sc.next());
						ae.emailCheck(account.getEmail());
						email = false;
					} else if (specification == 2 ) {
						account.emailApply = false;
						email=false;
					} else if ( specification == 3 ) {
						account.emailApply = false;
						email=false;
					} else {
						System.out.println("재 입력 바람");
					} 
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}while (email);
			
				do {
					try {
						System.out.print("what ur address >");
						account.setAddress(sc.next());
						System.out.println("ex)010-1111-1111 \t 011-123-4567");
						System.out.print("Enter the phone number you want >");
						account.setContact(sc.next());
						phone = false;
					}catch (Exception e) {
						System.out.println(e.toString());
					}
				} while (phone);
					System.out.println("\n 휴대폰 계약을 축하드립니다! \n");
					System.out.println("[ 계약 내용 확인 ]");
					System.out.println(account.toString());
				} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		public void contractBusiness() {
		}
		public void contractForeigner() {}
		public void endSystem() {
			System.out.println("\n\n\n\n---시스템 종료---\n\n");
			System.exit(0);
		}
		public int firstAmountBill() {return getCashAdvance();}
		public int monthAmountBill() {return getCashAdvance();}

	}
