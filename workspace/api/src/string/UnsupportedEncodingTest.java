package string;

import java.io.UnsupportedEncodingException;

public class UnsupportedEncodingTest {

	public static void main(String[] args) {
		String str = "안녕하세요.";
		
		System.out.println(str.indexOf("하"));
		
		//기본문자셋
		//인코딩
		byte[] bytes = str.getBytes();	//인코딩 10진수 --> 2진수 byte[]
		System.out.println(bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		String str1 = new String(bytes);	//2진수 배열 --> 10진수
		System.out.println(str1);
		
		//한글 완성형으로 
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			for(byte b : bytes2) {
				System.out.println(b);
			}
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		//UTF-8로
		try {
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println(bytes2.length);
			for(byte b : bytes2) {
				System.out.println(b);
			}
			String str2 = new String(bytes2, "UTF-8");
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		Car c = new Car();
		System.out.println(String.valueOf(c));
		
		
	}
	
}

class Car{
	
	
}











