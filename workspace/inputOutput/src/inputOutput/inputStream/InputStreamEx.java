package inputOutput.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("c:/Temp/test.txt");
//		int readByte=0;
		int readByteNo=0;
//		byte[] readBytes = new byte[2];
		byte[] readBytes = new byte[8];
		String data = "";
				
		while(true) {
			/*
			//-1이면 더이상 읽을 자료 없을때
			if(readByte == -1) break;
			//1바이트를 읽어온다
			//한글이나 특수문자 등 unicode 자료는 깨진다.
			readByte = is.read();
			
			//아스키 코드값으로 출력
//			System.out.print(readByte);
			
			//char로 형변환
			System.out.print((char)readByte);
			*/
			
			//배열의 크기만큼 2바이트씩 읽어온다. 
			//한글이나 특수문자 등 unicode 읽을 수 있다
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}
}
