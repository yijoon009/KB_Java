package file.fileReader;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\kookbee\\java\\workspace\\inputOutput\\src\\file\\fileReader\\FileReaderEx.java");
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!=-1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
		
		
		
		
		
		
		
		
		
	}

}
