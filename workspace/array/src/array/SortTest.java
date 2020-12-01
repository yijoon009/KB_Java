package array;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] scores = {99,98,87,100};
		Arrays.sort(scores);
		for(int score : scores) {
			System.out.println(score);
		}
		
	}
}
