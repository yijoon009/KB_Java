package classTest02;

import java.util.Scanner;

public class Program {
	Scanner sc = new Scanner(System.in);
	
	String[] sort = {"ȭ��ǰ","������ǰ","�繫��ǰ"};
	String[] cosmetic_name = {"����ƽ","��","��Ǫ"};
	String[] elec_name = {"�鵵��","��ǳ��","������"};
	String[] office_name = {"A4����","��Ʈ","��"};
	int[] cosmetic_price = {2000,500,1000};
	int[] elec_price = {1000,50000,300000};
	int[] office_price = {10000,20000,500};
	
	String input_sort;
	String input_name;
	int sales;
	
	public void input() { 
		System.out.print("��ǰ�з� -> ");
		input_sort = sc.next();
		System.out.print("ǰ�� -> ");
		input_name = sc.next();
		System.out.print("�Ǹŷ� -> ");
		sales = sc.nextInt();
	}
	
}
