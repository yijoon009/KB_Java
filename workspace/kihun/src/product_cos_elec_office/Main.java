package product_cos_elec_office;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m1 = new Manager();
		int act;
		while(true) {
			try {
			do {
			System.out.println("-------------");
			System.out.println("��ǰ���� ���α׷�");
			System.out.println("-------------");
			System.out.print("1.�Է�, 2.���, 3.����\n >");
			act = sc.nextInt();
			
			switch (act) {
			case 1: 
				System.out.print("1.ȭ��ǰ | 2. ������ǰ | 3. �繫��ǰ \n >");
				act = sc.nextInt();
				if(act == 1 ) {
					System.out.print("1. Soap | 2. Shampoo | 3.Lipstick\n>");
					act = sc.nextInt();
					if(act == 1 ) {
						m1.makeUpInput(new Soap()); 
						break;
					} else if ( act == 2 ) {
						m1.makeUpInput(new Shampoo());
						break;
					} else if ( act == 3 ) {
						m1.makeUpInput(new Lipstic());
						break;
					} else {continue;}
				} else if ( act == 2 ) {
					System.out.print("1. Shave | 2. Fan | 3. electronic Blanket\n >");
					act = sc.nextInt();
					if ( act == 1 ) {
						m1.homeProduct(new Shave());
						break;
					} else if ( act == 2 ) {
						m1.homeProduct(new Fan());
						break;
					} else if ( act == 3 ) {
						m1.homeProduct(new Electronic());
						break;
					} else {continue;}
				} else if (act == 3 ) {
					System.out.print("1. A4 Paper | 2. Note | 3. Pen \n > ");
					act = sc.nextInt();
					if( act == 1 ) {
						m1.officeProduct(new AfourPaper());
						break;
					} else if ( act == 2 ) {
						m1.officeProduct(new Note());
						break;
					} else if ( act == 3 ) {
						m1.officeProduct(new Pen());
						break;
					} else {continue;}
				} else {}
			case 2: continue;
			case 3: System.out.println("\n\n\n�ý��� ����!\n\n"); sc.close(); System.exit(0); 
					}
				} while ( act > 3 || act < 1);
				}catch (Exception e) {
					System.out.println(e.toString());
				}
			}
//		m1.showAll();
		
	}
}
