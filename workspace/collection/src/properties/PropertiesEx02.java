package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PropertiesEx02 {

	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("������� java ���ϸ� input.txt");
			System.exit(0);
		}
		Properties pro = new Properties();
		String inputFile = args[0];
		
		
		try {
			pro.load(new FileInputStream(inputFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("������ ��ο��� ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
		
		
	}

}
