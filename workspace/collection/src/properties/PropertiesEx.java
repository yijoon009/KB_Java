package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.*;

public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		Map pro = new Properties();				//������
		Properties pro = new Properties();		//��ü����
		
		//Ű, �� �ֱ�
		pro.setProperty("timeout", "30");
		pro.setProperty("language", "kr");
		pro.setProperty("size", "10");
		pro.setProperty("capacity", "10");
		pro.put("a", "100");
		
//		System.out.println(pro.get("a"));
		
		Enumeration e = pro.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String) e.nextElement();
			System.out.println(pro.getProperty(element));
		}
		
		
		
		
	}

}
