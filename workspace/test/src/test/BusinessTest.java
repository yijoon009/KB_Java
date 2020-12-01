package test;

import java.util.Scanner;

public class BusinessTest {
	Scanner sc = new Scanner(System.in);
	Gangdong[] gangdong = new Gangdong[10];
	Gangseo[] gangseo = new Gangseo[10];
	Gangnam[] gangnam = new Gangnam[10];
	Gangbook[] gangbook = new Gangbook[10];
	Head[] head = new Head[40];
	int act;
	int i;
	int a,b,c,d;
	
	public void view() {
		System.out.println("---------------");
		System.out.println("배달 현황 프로그램");
		System.out.println("---------------");
		System.out.println("김이준");
		
		while(true) {
			System.out.print("1. 입력 2. 출력 3. 종료 -> ");
			act = sc.nextInt();
			switch(act) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				System.exit(0);
			}
		}
	}//end view
	
	public void input() {
		System.out.print("배달지구 (1. 강동지구, 2. 강서지구 3. 강남지구 4. 강북지구) 선택 -> ");
		act = sc.nextInt();
		switch(act) {
		case 1:
			inputGangdong();
			break;
		case 2:
			inputGangseo();
			break;
		case 3:
			inputGangnam();
			break;
		case 4:
			inputGangbook();
			break;
			
		}
	}//end input
	
	public void inputGangdong() {
		Gangdong gd = new Gangdong();
		System.out.print("배달 시간 (한시간보다 적게걸릴경우 0으로 입력) -> ");
		gd.time = sc.nextInt();
		System.out.print("배달량 개수 -> ");
		gd.amount = sc.nextInt();
		gd = new Gangdong("장동욱", gd.time, gd.amount, totalPriceMethod(gd));
		head[i++] = gd;
		gangdong[a++] = gd;
	}//end inputGangdong
	
	public void inputGangseo() {
		Gangseo gs = new Gangseo();
		System.out.print("배달 시간 (한시간보다 적게걸릴경우 0으로 입력) -> ");
		gs.time = sc.nextInt();
		System.out.print("배달량 개수 -> ");
		gs.amount = sc.nextInt();
		gs = new Gangseo("박영수", gs.time, gs.amount, totalPriceMethod(gs));
		head[i++] = gs;
		gangseo[b++] = gs;
		
	}//end inputGangseo
	
	public void inputGangnam() {
		Gangnam gn = new Gangnam();
		System.out.print("배달 시간 (한시간보다 적게걸릴경우 0으로 입력) -> ");
		gn.time = sc.nextInt();
		System.out.print("배달량 개수 -> ");
		gn.amount = sc.nextInt();
		gn = new Gangnam("이기영", gn.time, gn.amount, totalPriceMethod(gn));
		head[i++] = gn;
		gangnam[c++] = gn;
	}//end inputGangnam
	
	public void inputGangbook() {
		Gangbook gb = new Gangbook();
		System.out.print("배달 시간 (한시간보다 적게걸릴경우 0으로 입력) -> ");
		gb.time = sc.nextInt();
		System.out.print("배달량 개수 -> ");
		gb.amount = sc.nextInt();
		gb = new Gangbook("이기영", gb.time, gb.amount, totalPriceMethod(gb));
		head[i++] = gb;
		gangbook[d++] = gb;
		
	}//end inputGangbook
	
	public int totalPriceMethod(Head h) {
		
		if(h.time<1) {
			h.totalPrice+=1000;
		}else if(h.time>=1 && h.time<2) {
			h.totalPrice+=2000;
		}else if(h.time>=2 && h.time<3) {
			h.totalPrice+=3000;
		}else {
			h.totalPrice+=4000;
		}
		if(h.amount<=100) {
			h.totalPrice+=1000;
		}else if(h.amount>100 && h.amount<=200) {
			h.totalPrice+=2000;
		}else if(h.amount>200 && h.amount<=300) {
			h.totalPrice+=3000;
		}else {
			h.totalPrice+=4000;
		}
		return h.totalPrice;
		
	}//end totalPriceMethod
	
	public void output() {
		System.out.println("1. 지구별로 2. 모든지구 ");
		act = sc.nextInt();
		switch(act) {
		case 1://지구별 출력
			System.out.print("1. 강동지구, 2. 강서지구 3. 강남지구 4. 강북지구 -> ");
			act = sc.nextInt();
			switch(act) {
			case 1://강동 출력
				System.out.println("--------");
				System.out.println("강동지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < a; j++) {
					System.out.println(gangdong[j].name+"  "+gangdong[j].time+"  "+gangdong[j].amount+"  "+gangdong[j].totalPrice);
				}
				break;
			case 2://강서
				System.out.println("--------");
				System.out.println("강서지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < b; j++) {
					
					System.out.println(gangseo[j].name+"  "+gangseo[j].time+"  "+gangseo[j].amount+"  "+gangseo[j].totalPrice);
				}
				break;
			case 3://강남
				System.out.println("--------");
				System.out.println("강남지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < c; j++) {
					
					System.out.println(gangnam[j].name+"  "+gangnam[j].time+"  "+gangnam[j].amount+"  "+gangnam[j].totalPrice);
				}
				break;
			case 4://강북
				System.out.println("--------");
				System.out.println("강북지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < d; j++) {
					System.out.println(gangbook[j].name+"  "+gangbook[j].time+"  "+gangbook[j].amount+"  "+gangbook[j].totalPrice);
				}
				break;
			}
			break;
		case 2://모든 지구 출력
			if(a!=0) {
				System.out.println("--------");
				System.out.println("강동지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < a; j++) {
					System.out.println(gangdong[j].name+"  "+gangdong[j].time+"  "+gangdong[j].amount+"  "+gangdong[j].totalPrice);
				}
			}
			if(b!=0) {
				System.out.println("--------");
				System.out.println("강서지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < b; j++) {
					System.out.println(gangseo[j].name+"  "+gangseo[j].time+"  "+gangseo[j].amount+"  "+gangseo[j].totalPrice);
				}
			}
			if(c!=0) {
				System.out.println("--------");
				System.out.println("강남지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < c; j++) {
					System.out.println(gangnam[j].name+"  "+gangnam[j].time+"  "+gangnam[j].amount+"  "+gangnam[j].totalPrice);
				}
			}
			if(d!=0) {
				System.out.println("--------");
				System.out.println("강북지구");
				System.out.println("--------");
				System.out.println("배달담당  배달시간  배달량  배달요금");
				System.out.println("===========================");
				for (int j = 0; j < d; j++) {
					System.out.println(gangbook[j].name+"  "+gangbook[j].time+"  "+gangbook[j].amount+"  "+gangbook[j].totalPrice);
				}
			}
			break;
		}
	}
}












