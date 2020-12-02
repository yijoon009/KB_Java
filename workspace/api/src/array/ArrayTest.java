package array;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		char[] charArr1 = {'J','A','V','A'};
		byte[] byteArr1 = {1,0,1};
		double[] doubleArr1 = {1.1, 2.2, 3.3};
		Car[] carArr1 = {new Car(), new Car()};
		
		int[] intArr1 = new int[3];
		intArr1[0] = 1;
		intArr1[1] = 2;
		intArr1[2] = 3;
		
		char[] copyChar = Arrays.copyOf(charArr1, charArr1.length);
		for (int i = 0; i < copyChar.length; i++) {
			System.out.println(copyChar[i]);
		}
		
	}
}
class Car{
	
}