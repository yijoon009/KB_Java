package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new FileWriter("food.txt"));
//		
//		bw.write("��ä\n");
//		bw.write("�Ұ��\n");
//		bw.write("����\n");
//		bw.write("�Ľ�Ÿ\n");
//		
//		bw.close();
		
		//CRUD
		
		//����
		//��ä�� �����̷�
//		BufferedReader br = null;
//		
//		try {
//			br = new BufferedReader(new FileReader("food.txt"));
//			
//			String line = null;
//			String temp = "";
//			boolean check = false;
//			
//			while(true) {
//				line = br.readLine();
//				if(line == null) { break;}
//				if(line.equals("��ä")) {
//					temp += "������\n";
//					check = true;
//					continue;
//				}
//				temp += line + "\n";
//			}
//			
//			if(check) {
//				BufferedWriter bw = new BufferedWriter(new FileWriter("food.txt"));
//				bw.write(temp);
//				bw.close();
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
//		} finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
		
		//����(���� ����)
//		BufferedReader br = null;
//		
//		try {
//			br = new BufferedReader(new FileReader("food.txt"));
//			
//			String line = null;
//			String temp = "";
//			boolean check = false;
//			
//			while(true) {
//				line = br.readLine();
//				if(line == null) { break;}
//				if(line.equals("����")) {
//					check = true;
//					continue;
//				}
//				temp += line + "\n";
//			}
//			
//			if(check) {
//				BufferedWriter bw = new BufferedWriter(new FileWriter("food.txt"));
//				bw.write(temp);
//				bw.close();
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
//		} finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
		//�˻�
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("food.txt"));
			
			String line = null;
			boolean check = false;
			
			while(true) {
				line = br.readLine();
				if(line == null) { break;}
				if(line.contains("��")) {
					check = true;
					System.out.println(line);
				}
			}
			if(!check) {
				System.out.println("�˻� ��� ����");
			}
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
	}
}

























