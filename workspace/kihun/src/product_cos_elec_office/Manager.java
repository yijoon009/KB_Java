package product_cos_elec_office;

import java.util.Scanner;

public class Manager {
	double money; // �� �����
	int allMcnt = 0, allHcnt=0, allOcnt=0;
	int Mcnt = 0, Hcnt = 0, Ocnt = 0; // �Ǹŷ� ���� ?????
	MakeupProduct[] mpa = new MakeupProduct[Mcnt];
	HomeProduct[] hpa = new HomeProduct[Hcnt];
	OfficeProduct[] opa = new OfficeProduct[Ocnt];

	Scanner sc = new Scanner(System.in);

	// ����ũ�� ���� �޼ҵ�
	void makeUpInput(MakeupProduct p) {
		// �Ǹ� ����
		System.out.print("�� �� �ȾҴ��� �Է� >");
		Mcnt = sc.nextInt();
		mpa = new MakeupProduct[Mcnt]; // �� �Ǹ� ������ �迭 ũ��
		 allMcnt += Mcnt;
//		p.mcnt = cnt;  // �̷��� �ص� �ǰ� 
		int pmoney = (int)(Mcnt*p.price);
		money += (p.price*Mcnt); // �Է¹��� ������ŭ * ���� = �� �Ǹ� �����ݾ�
		
		int Pprice = (int)p.price; // ����ȯ ��¿� ���� ���� 
		// ���ݸ�ŭ �� �ָӴϷ� ����ֱ�
//		mpa[Mcnt++] = p;
		System.out.printf("\n| ��ǰ�� : %s | �ǸŰ� : $%,d | ����� : $%,d | �Ǹ� ���� : %d\n",p,Pprice,pmoney,Mcnt);
		System.out.printf("ȭ��ǰ | �� ����� : $%,d | �� �Ǹ� ���� : %d\n",(int)money,allMcnt);
	}
	void homeProduct(HomeProduct p) {
		// �Ǹ� ����
		System.out.print("�� �� �ȾҴ��� �Է� >");
		Hcnt = sc.nextInt();
		hpa = new HomeProduct[Hcnt]; // �� �Ǹ� ������ �迭 ũ��
		allHcnt += Hcnt;
		money += (p.price*Hcnt); // �Է¹��� ������ŭ * ���� = �� �Ǹ� �����ݾ�
		int kmoney = (int)(Hcnt*p.price);
		int Pprice = (int)p.price;
		 // ����ȯ ��¿� ���� ����
		System.out.printf("\n| ��ǰ�� : %s | �ǸŰ� : $%,d | ����� : $%,d | �Ǹ� ���� : %d\n",p,Pprice,kmoney,Hcnt);
		System.out.printf("������ǰ | �� ����� : $%,d | �� �Ǹ� ���� : %d\n",(int)money,allHcnt);
		}
	void officeProduct(OfficeProduct p) {
		// �Ǹ� ����
		System.out.print("�� �� �ȾҴ��� �Է� >");
		Ocnt = sc.nextInt();
		opa = new OfficeProduct[Ocnt]; // �� �Ǹ� ������ �迭 ũ��
//		p.mcnt = cnt;  // �̷��� �ص� �ǰ� 
		allOcnt += Ocnt;
		money += (p.price*Ocnt); // �Է¹��� ������ŭ * ���� = �� �Ǹ� �����ݾ�
		int Mmoney = (int)(p.price*Ocnt);
		int Pprice = (int)p.price; // ����ȯ ��¿� ���� ����
		System.out.printf("\n| ��ǰ�� : %s | �ǸŰ� : $%,d | ����� : $%,d | �Ǹ� ���� : %d\n",p,Pprice,Mmoney,Ocnt);
		System.out.printf("�繫��ǰ | �� ����� : $%,d | �� �Ǹ� ���� : %d\n",(int)money,allOcnt);
	}

}
