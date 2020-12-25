package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
	//throws : 예외 던지기
	//하나의 메소드 내에서 동일한 예외가 자주 발생한다면
	//예외가 메소드에 들어올 수 없도록 다시 발생된 쪽으로 던져준다.
	public static void main(String[] args) throws IOException{
		//1.절대 경로 : 현재 위치에 상관없이 찾아갈 수 있는 경로
		//2.상대 경로 : 현재 위치에 따라서 결과가 변하는 경로
		
		//입출력을 하게 되면 외부 저장소를 사용하기 때문에 IOException(입출력 예외)가 발생한다.
		//따라서 반드시 예외처리를 해주어야 사용이 가능하다.

		//줄바꿈은 \n을 작성한다.
		//bw.newLine()도 줄바꿈하는 메소드이다.
		
		//덮어 쓰기
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		
		//이어 쓰기
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
//		bw.newLine();
//		bw.write(" 완전\n");
//		bw.write("짱");
//		bw.close();
		
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("test.txt"));
			 String line = null;
			 while(true) {
				 //줄바꿈은 가져오지 않는다.
				 line = br.readLine();
				 if(line == null) {break;}
				 System.out.println(line);
			 }
			 
		} catch (FileNotFoundException e) {
			System.out.println("경로에 파일이 존재하지 않습니다.");
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (Exception e) {
				//예외 발생
				//닫는 부분에서 예외발생 시 닫히지 않은 상태로 유지될 수 있다.
				//메모리 누수가 생겨서 메모리에 타격이 가기 때문에 강제 종료하기 위해 예외를 발생해준다.
				//생성자에 문자열값을 넘겨주면 콘솔창에 출력된다.
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}














