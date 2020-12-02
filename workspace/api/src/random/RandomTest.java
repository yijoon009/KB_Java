package random;

import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomTest {
	public static void main(String[] args) {
		
		int[] selectNumber = new int[6];
		Random r1 = new Random();
		for(int i=0;i<6;i++) {
			selectNumber[i] = r1.nextInt(45) + 1;
			System.out.println(selectNumber[i] + "  ");
		}
		
	}
}
