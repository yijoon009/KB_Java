package classTest02;

import java.util.Scanner;

public class Program {
	Scanner sc = new Scanner(System.in);
	
	String[] sort = {"화장품","가전제품","사무용품"};
	String[] cosmetic_name = {"립스틱","비누","샴푸"};
	String[] elec_name = {"면도기","선풍기","전기담요"};
	String[] office_name = {"A4용지","노트","펜"};
	int[] cosmetic_price = {2000,500,1000};
	int[] elec_price = {1000,50000,300000};
	int[] office_price = {10000,20000,500};
	
	String input_sort;
	String input_name;
	int sales;
	
	public void input() { 
		System.out.print("제품분류 -> ");
		input_sort = sc.next();
		System.out.print("품명 -> ");
		input_name = sc.next();
		System.out.print("판매량 -> ");
		sales = sc.nextInt();
	}
	
}
