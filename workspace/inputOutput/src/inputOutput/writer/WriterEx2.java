package inputOutput.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx2 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/writerTest2.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data);
		
		//버퍼 안에 들어있는 자료 모두 출력
		writer.flush();
		//file 자원 반납
		writer.close();
	}
}
