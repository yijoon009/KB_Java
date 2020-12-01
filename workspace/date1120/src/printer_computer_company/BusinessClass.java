package printer_computer_company;

import java.util.Scanner;

public class BusinessClass {
	Scanner sc = new Scanner(System.in);
	Seoul seoul = new Seoul();
	Gyeonggi gyeonggi = new Gyeonggi();
	Gangwon gangwon = new Gangwon();
	Jeju jeju = new Jeju();
	
	public void view() {
		int choice = 0;
		
		System.out.println("================");
		System.out.println("판매량 관리 프로그램");
		System.out.println("================");
		while(true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			choice = sc.nextInt();
			if(choice==1) {
				input();
			}else if(choice==2){
				output();
			}else {
				System.out.println("판매량 관리 프로그램 종료");
				break;
			}
		}
	}//end view
	
	public void input() {
		int jisa=0, product = 0, amount=0;
		System.out.print("1. 서울지사 2. 경기지사 3. 강원지사 4. 제주지사 -> ");
		jisa = sc.nextInt();
		System.out.print("1. 컴퓨터 2. 프린터 -> ");
		product = sc.nextInt();
		System.out.print("총 판매량 -> ");
		amount = sc.nextInt();
		
		if(product ==1) {
			computerInput(jisa, amount);
		}else {
			printerInput(jisa, amount);
		}
		
	}//end input
	
	public void computerInput(int jisa, int amount) {
		if(jisa==1) {
			seoul.computer_amount += amount;
			seoul.computer_wholesales += seoul.computer*seoul.computer_amount;
		}else if(jisa==2) {
			gyeonggi.computer_amount += amount;
			gyeonggi.computer_wholesales += gyeonggi.computer*gyeonggi.computer_amount;
		}else if(jisa==3) {
			gangwon.computer_amount += amount;
			gangwon.computer_wholesales += gangwon.computer*gangwon.computer_amount;
		}else {
			jeju.computer_amount += amount;
			jeju.computer_wholesales += jeju.computer*jeju.computer_amount;
		}
	}//end computerInput
	
	public void printerInput(int jisa, int amount) {
		if(jisa==1) {
			seoul.printer_amount += amount;
			seoul.printer_wholesales += seoul.printer*seoul.printer_amount;
		}else if(jisa==2) {
			gyeonggi.printer_amount += amount;
			gyeonggi.printer_wholesales += gyeonggi.printer*gyeonggi.printer_amount;
		}else if(jisa==3) {
			gangwon.printer_amount += amount;
			gangwon.printer_wholesales += gangwon.printer*gangwon.printer_amount;
		}else {
			jeju.printer_amount += amount;
			jeju.printer_wholesales += jeju.printer*jeju.printer_amount;
		}
		
	}//end printerInput
	
	public void output() {
		String result = "";
		System.out.println("지사명  제품명  제품가격  판매량  매출현황");
		if(seoul.printer_amount!=0) {
			result+="서울지점 프린터 500000 "+seoul.printer_amount+" "+seoul.printer_wholesales+"\n";
		}if(seoul.computer_amount!=0) {
			result+="서울지점 컴퓨터 2000000 "+seoul.computer_amount+" "+seoul.computer_wholesales+"\n";
		}if(gyeonggi.printer_amount!=0) {
			result+="경기지점 프린터 500000 "+gyeonggi.printer_amount+" "+gyeonggi.printer_wholesales+"\n";
		}if(gyeonggi.computer_amount!=0) {
			result+="경기지점 컴퓨터 2000000 "+gyeonggi.computer_amount+" "+gyeonggi.computer_wholesales+"\n";
		}if(gangwon.printer_amount!=0) {
			result+="강원지점 프린터 500000 "+gangwon.printer_amount+" "+gangwon.printer_wholesales+"\n";
		}if(gangwon.computer_amount!=0) {
			result+="강원지점 컴퓨터 2000000 "+gangwon.computer_amount+" "+gangwon.computer_wholesales+"\n";
		}if(jeju.printer_amount!=0) {
			result+="제주지점 프린터 500000 "+jeju.printer_amount+" "+jeju.printer_wholesales+"\n";
		}if(jeju.computer_amount!=0) {
			result+="제주지점 컴퓨터 2000000 "+jeju.computer_amount+" "+jeju.computer_wholesales+"\n";
		}
		System.out.println(result);
	
	
	}
}









