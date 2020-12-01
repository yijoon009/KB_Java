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
		System.out.println("��� ��Ȳ ���α׷�");
		System.out.println("---------------");
		System.out.println("������");
		
		while(true) {
			System.out.print("1. �Է� 2. ��� 3. ���� -> ");
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
		System.out.print("������� (1. ��������, 2. �������� 3. �������� 4. ��������) ���� -> ");
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
		System.out.print("��� �ð� (�ѽð����� ���԰ɸ���� 0���� �Է�) -> ");
		gd.time = sc.nextInt();
		System.out.print("��޷� ���� -> ");
		gd.amount = sc.nextInt();
		gd = new Gangdong("�嵿��", gd.time, gd.amount, totalPriceMethod(gd));
		head[i++] = gd;
		gangdong[a++] = gd;
	}//end inputGangdong
	
	public void inputGangseo() {
		Gangseo gs = new Gangseo();
		System.out.print("��� �ð� (�ѽð����� ���԰ɸ���� 0���� �Է�) -> ");
		gs.time = sc.nextInt();
		System.out.print("��޷� ���� -> ");
		gs.amount = sc.nextInt();
		gs = new Gangseo("�ڿ���", gs.time, gs.amount, totalPriceMethod(gs));
		head[i++] = gs;
		gangseo[b++] = gs;
		
	}//end inputGangseo
	
	public void inputGangnam() {
		Gangnam gn = new Gangnam();
		System.out.print("��� �ð� (�ѽð����� ���԰ɸ���� 0���� �Է�) -> ");
		gn.time = sc.nextInt();
		System.out.print("��޷� ���� -> ");
		gn.amount = sc.nextInt();
		gn = new Gangnam("�̱⿵", gn.time, gn.amount, totalPriceMethod(gn));
		head[i++] = gn;
		gangnam[c++] = gn;
	}//end inputGangnam
	
	public void inputGangbook() {
		Gangbook gb = new Gangbook();
		System.out.print("��� �ð� (�ѽð����� ���԰ɸ���� 0���� �Է�) -> ");
		gb.time = sc.nextInt();
		System.out.print("��޷� ���� -> ");
		gb.amount = sc.nextInt();
		gb = new Gangbook("�̱⿵", gb.time, gb.amount, totalPriceMethod(gb));
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
		System.out.println("1. �������� 2. ������� ");
		act = sc.nextInt();
		switch(act) {
		case 1://������ ���
			System.out.print("1. ��������, 2. �������� 3. �������� 4. �������� -> ");
			act = sc.nextInt();
			switch(act) {
			case 1://���� ���
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < a; j++) {
					System.out.println(gangdong[j].name+"  "+gangdong[j].time+"  "+gangdong[j].amount+"  "+gangdong[j].totalPrice);
				}
				break;
			case 2://����
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < b; j++) {
					
					System.out.println(gangseo[j].name+"  "+gangseo[j].time+"  "+gangseo[j].amount+"  "+gangseo[j].totalPrice);
				}
				break;
			case 3://����
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < c; j++) {
					
					System.out.println(gangnam[j].name+"  "+gangnam[j].time+"  "+gangnam[j].amount+"  "+gangnam[j].totalPrice);
				}
				break;
			case 4://����
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < d; j++) {
					System.out.println(gangbook[j].name+"  "+gangbook[j].time+"  "+gangbook[j].amount+"  "+gangbook[j].totalPrice);
				}
				break;
			}
			break;
		case 2://��� ���� ���
			if(a!=0) {
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < a; j++) {
					System.out.println(gangdong[j].name+"  "+gangdong[j].time+"  "+gangdong[j].amount+"  "+gangdong[j].totalPrice);
				}
			}
			if(b!=0) {
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < b; j++) {
					System.out.println(gangseo[j].name+"  "+gangseo[j].time+"  "+gangseo[j].amount+"  "+gangseo[j].totalPrice);
				}
			}
			if(c!=0) {
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < c; j++) {
					System.out.println(gangnam[j].name+"  "+gangnam[j].time+"  "+gangnam[j].amount+"  "+gangnam[j].totalPrice);
				}
			}
			if(d!=0) {
				System.out.println("--------");
				System.out.println("��������");
				System.out.println("--------");
				System.out.println("��޴��  ��޽ð�  ��޷�  ��޿��");
				System.out.println("===========================");
				for (int j = 0; j < d; j++) {
					System.out.println(gangbook[j].name+"  "+gangbook[j].time+"  "+gangbook[j].amount+"  "+gangbook[j].totalPrice);
				}
			}
			break;
		}
	}
}












