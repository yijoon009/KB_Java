package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
	//throws : ���� ������
	//�ϳ��� �޼ҵ� ������ ������ ���ܰ� ���� �߻��Ѵٸ�
	//���ܰ� �޼ҵ忡 ���� �� ������ �ٽ� �߻��� ������ �����ش�.
	public static void main(String[] args) throws IOException{
		//1.���� ��� : ���� ��ġ�� ������� ã�ư� �� �ִ� ���
		//2.��� ��� : ���� ��ġ�� ���� ����� ���ϴ� ���
		
		//������� �ϰ� �Ǹ� �ܺ� ����Ҹ� ����ϱ� ������ IOException(����� ����)�� �߻��Ѵ�.
		//���� �ݵ�� ����ó���� ���־�� ����� �����ϴ�.

		//�ٹٲ��� \n�� �ۼ��Ѵ�.
		//bw.newLine()�� �ٹٲ��ϴ� �޼ҵ��̴�.
		
		//���� ����
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		
		//�̾� ����
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
//		bw.newLine();
//		bw.write(" ����\n");
//		bw.write("¯");
//		bw.close();
		
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("test.txt"));
			 String line = null;
			 while(true) {
				 //�ٹٲ��� �������� �ʴ´�.
				 line = br.readLine();
				 if(line == null) {break;}
				 System.out.println(line);
			 }
			 
		} catch (FileNotFoundException e) {
			System.out.println("��ο� ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (Exception e) {
				//���� �߻�
				//�ݴ� �κп��� ���ܹ߻� �� ������ ���� ���·� ������ �� �ִ�.
				//�޸� ������ ���ܼ� �޸𸮿� Ÿ���� ���� ������ ���� �����ϱ� ���� ���ܸ� �߻����ش�.
				//�����ڿ� ���ڿ����� �Ѱ��ָ� �ܼ�â�� ��µȴ�.
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}














