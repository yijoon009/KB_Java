package ver1;
import java.util.ArrayList;
import java.util.Scanner;

// 핸드폰 매장 신규회원 클래스 생성, 
// 속성 기능을 구분해서 클래스 만들기
class cellPhoneNewMember{
	Scanner sc = new Scanner(System.in);
	int customerCategory;	//고객 구분,
	String customerName,socialNumber; // 주민번호는 851213-2 까지만 입력
	int specification; // 1.이메일,2.모바일,3.우편
	boolean emailApply; // e-mail 명세서 신청 유/무
	String contact1,contact2;// 연락처1,2
	String address; // 주소
	boolean automaticPaymen; // 요금 자동 납부
	String modelName,modelSerial;//모델명, 일련번호
	int shippingPrice,purchasePrice;//출고가 구입가
	float discountRate;// 요금 할인율 백분율 %
	int priceDc,cashAdvance; // 요금할인,선납
	
	ArrayList contractList = new ArrayList<>();
	
	public cellPhoneNewMember() {}
	// ---------------------함수 구현---
	public void contractCategory() { // 신규회원의 가입 선택
		System.out.println("----Contract----");
		System.out.print("Check Plz > 1.individual | 2.individual Business | 3.Foreigner ");
		customerCategory = sc.nextInt();
		if(customerCategory == 1 ) {
			contractIndividual();
		} else if (customerCategory == 2 ) {
			contractBusiness();
		} else if (customerCategory == 3 ) {
			contractForeigner();
		}
	}
	public void contractIndividual() {
		try { 
		System.out.print("what your Name >");
		customerName = sc.next();
		System.out.print("your Social Security Number >");
		socialNumber = sc.next();
		System.out.print("what specifications do you want?"
				+ "\n |1. e-mail |2. mobile |3. post |\n >");
		specification = sc.nextInt();
		if ( specification == 1 ) {
			
		} else if (specification == 2 ) {
			
		} else if ( specification == 3 ) {
			
		} else {
			System.out.println("재 입력 바람.");
			} 
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
	public int firstAmountBill() {return cashAdvance;}
	public int monthAmountBill() {return cashAdvance;}
}
	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cellPhoneNewMember nm = new cellPhoneNewMember();
		int act;
		while ( true ) {
			do {
				System.out.println("**어서오세요, Hogu Phone Shop**");
				System.out.println("1.신규가입|2.");
				System.out.println("--------------------------------");
				act = sc.nextInt();
			} while(act < 1 && act > 4);
			switch(act) {
			case 1: nm.contractCategory(); break;
			case 2: continue;
			case 3: continue;
			case 4: sc.close(); nm.endSystem(); 
			}
			
			
		}
		
		
	}

}
