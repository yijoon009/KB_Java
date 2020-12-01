package codeDojang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class TurnTabToDot {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("test.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("��ο� ������ �������� �ʽ��ϴ�.");
		}
		
		String line = null;
		String tmp="";
		while((line = br.readLine())!=null) {
			if(line.contains("\t")) {
				tmp+=line.replace("\t", "....");
			}
			tmp+=line+"\n";
		}
		
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		bw.write(tmp);
		bw.close();
		

		
		
		
	}
}

