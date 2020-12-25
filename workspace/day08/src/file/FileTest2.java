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
//		bw.write("잡채\n");
//		bw.write("불고기\n");
//		bw.write("피자\n");
//		bw.write("파스타\n");
//		
//		bw.close();
		
		//CRUD
		
		//수정
		//잡채를 떡볶이로
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
//				if(line.equals("잡채")) {
//					temp += "떡볶이\n";
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
//			System.out.println("해당 경로에 파일이 존재하지 않습니다.");
//		} finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
		
		//삭제(피자 삭제)
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
//				if(line.equals("피자")) {
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
//			System.out.println("해당 경로에 파일이 존재하지 않습니다.");
//		} finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//			} catch (Exception e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
		//검색
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("food.txt"));
			
			String line = null;
			boolean check = false;
			
			while(true) {
				line = br.readLine();
				if(line == null) { break;}
				if(line.contains("악")) {
					check = true;
					System.out.println(line);
				}
			}
			if(!check) {
				System.out.println("검색 결과 없음");
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 존재하지 않습니다.");
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

























