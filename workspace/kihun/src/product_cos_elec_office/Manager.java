package product_cos_elec_office;

import java.util.Scanner;

public class Manager {
	double money; // 총 매출액
	int allMcnt = 0, allHcnt=0, allOcnt=0;
	int Mcnt = 0, Hcnt = 0, Ocnt = 0; // 판매량 누적 ?????
	MakeupProduct[] mpa = new MakeupProduct[Mcnt];
	HomeProduct[] hpa = new HomeProduct[Hcnt];
	OfficeProduct[] opa = new OfficeProduct[Ocnt];

	Scanner sc = new Scanner(System.in);

	// 메이크업 관리 메소드
	void makeUpInput(MakeupProduct p) {
		// 판매 관리
		System.out.print("몇 개 팔았는지 입력 >");
		Mcnt = sc.nextInt();
		mpa = new MakeupProduct[Mcnt]; // 총 판매 개수가 배열 크기
		 allMcnt += Mcnt;
//		p.mcnt = cnt;  // 이렇게 해도 되고 
		int pmoney = (int)(Mcnt*p.price);
		money += (p.price*Mcnt); // 입력받은 개수만큼 * 가격 = 총 판매 누적금액
		
		int Pprice = (int)p.price; // 형변환 출력용 변수 설정 
		// 가격만큼 내 주머니로 집어넣기
//		mpa[Mcnt++] = p;
		System.out.printf("\n| 제품명 : %s | 판매가 : $%,d | 매출액 : $%,d | 판매 수량 : %d\n",p,Pprice,pmoney,Mcnt);
		System.out.printf("화장품 | 총 매출액 : $%,d | 총 판매 수량 : %d\n",(int)money,allMcnt);
	}
	void homeProduct(HomeProduct p) {
		// 판매 관리
		System.out.print("몇 개 팔았는지 입력 >");
		Hcnt = sc.nextInt();
		hpa = new HomeProduct[Hcnt]; // 총 판매 개수가 배열 크기
		allHcnt += Hcnt;
		money += (p.price*Hcnt); // 입력받은 개수만큼 * 가격 = 총 판매 누적금액
		int kmoney = (int)(Hcnt*p.price);
		int Pprice = (int)p.price;
		 // 형변환 출력용 변수 설정
		System.out.printf("\n| 제품명 : %s | 판매가 : $%,d | 매출액 : $%,d | 판매 수량 : %d\n",p,Pprice,kmoney,Hcnt);
		System.out.printf("가전제품 | 총 매출액 : $%,d | 총 판매 수량 : %d\n",(int)money,allHcnt);
		}
	void officeProduct(OfficeProduct p) {
		// 판매 관리
		System.out.print("몇 개 팔았는지 입력 >");
		Ocnt = sc.nextInt();
		opa = new OfficeProduct[Ocnt]; // 총 판매 개수가 배열 크기
//		p.mcnt = cnt;  // 이렇게 해도 되고 
		allOcnt += Ocnt;
		money += (p.price*Ocnt); // 입력받은 개수만큼 * 가격 = 총 판매 누적금액
		int Mmoney = (int)(p.price*Ocnt);
		int Pprice = (int)p.price; // 형변환 출력용 변수 설정
		System.out.printf("\n| 제품명 : %s | 판매가 : $%,d | 매출액 : $%,d | 판매 수량 : %d\n",p,Pprice,Mmoney,Ocnt);
		System.out.printf("사무용품 | 총 매출액 : $%,d | 총 판매 수량 : %d\n",(int)money,allOcnt);
	}

}
