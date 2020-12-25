package object;

import java.io.*;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) throws Exception{
		
		//직렬화
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		//보조기반스트림
		//바이트 타입이라 못읽어. 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 

		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("홍길동"));

		oos.flush(); oos.close(); fos.close();

		
		//역직렬화
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();

		ois.close(); fis.close();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
	}

}
