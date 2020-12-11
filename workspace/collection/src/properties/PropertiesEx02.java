package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PropertiesEx02 {

	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("사용방법은 java 파일명 input.txt");
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
			System.out.println("지정된 경로에서 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		
	}

}
