package codeDojang;

import java.util.Scanner;

public class DashInsert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = 10;
		int n2 = 1000;
		int total = 0;
		
		for (int i = n1; i <=n2; i++) {
			int tmp = i;
			while(true) {
				total+=tmp%10;
				total/=10;
			}
		}
		
		
		
		
		
	}
}
