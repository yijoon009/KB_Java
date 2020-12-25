package inputOutput.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("c:/Temp/writerTest1.txt");
		//toCharArray: 캐릭터 배열로 만들어줌
		char[] data = "김이준".toCharArray();
		for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}
