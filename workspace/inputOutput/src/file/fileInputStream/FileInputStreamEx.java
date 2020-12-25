package file.fileInputStream;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\kookbee\\java\\workspace\\inputOutput\\src\\file\\fileInputStream\\FileInputStreamEx.java");
			int data;
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

}
