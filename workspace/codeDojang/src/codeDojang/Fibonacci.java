package codeDojang;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(0);
		ar.add(1);
		
		
		int i=0;
		while(true) {
			if(ar.get(i)>num) {
				break;
			}
			ar.add(ar.get(i)+ar.get(i+1));
			i++;
		}
		
		System.out.println(ar);
		
	}
}
