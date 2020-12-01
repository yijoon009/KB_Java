package string;

import java.io.UnsupportedEncodingException;

public class UnsupportedEncodingTest {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���.";
		
		System.out.println(str.indexOf("��"));
		
		//�⺻���ڼ�
		//���ڵ�
		byte[] bytes = str.getBytes();	//���ڵ� 10���� --> 2���� byte[]
		System.out.println(bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		String str1 = new String(bytes);	//2���� �迭 --> 10����
		System.out.println(str1);
		
		//�ѱ� �ϼ������� 
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

		//UTF-8��
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











