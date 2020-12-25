package inputOutput.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/Temp/output3.txt");
		byte[] data = "ABCDEFG".getBytes();
		//1번 인덱스부터 2개 출력
		os.write(data, 1, 2);
//		for(int i=0;i<data.length;i++) {
//			os.write(data[i]);
//		}
		os.flush();
		os.close();
	}
}
