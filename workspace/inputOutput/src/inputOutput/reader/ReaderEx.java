package inputOutput.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

	public static void main(String[] args) throws IOException {

		//방법1
		/*
		Reader reader = new FileReader("c:/Temp/frTest1.txt");
		int readData;
		
		//1바이트만 읽을때
		readData = reader.read();
		System.out.println((char)readData);
//		while(true) {
//			//1바이트씩 읽어오기
//			readData = reader.read();
//			if(readData == -1) break;
//			System.out.println((char)readData);
//		}
		*/
		
		//방법2 배열로
		Reader reader = new FileReader("c:/Temp/frTest2.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while( true ) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
	}

}
