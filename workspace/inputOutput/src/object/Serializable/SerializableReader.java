package object.Serializable;

import java.io.*;

//역직렬화
public class SerializableReader {
	public static void main(String[] args) throws Exception {
//		FileInputStream fis = new FileInputStream("C:/Temp/obj1.dat");
//		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		ClassA v = (ClassA) ois.readObject();
//		
//		System.out.println("field1: " + v.field1);
//		System.out.println("field2.field1: " + v.field2.field1);
//		
//		/*
//		 * 모든걸 직렬화 할수 없다 -> 역직렬화(복원)도 안된다.
//		 * static, transient는 직렬화 안된다
//		 */
//		System.out.println("field3: " + v.field3);
//		System.out.println("field4: " + v.field4);
		
		FileInputStream fis = new FileInputStream("C:/Temp/obj2.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC c = (ClassC) ois.readObject();
		System.out.println("fieldC1"+c.fieldC1);
		System.out.println("fieldC2"+c.fieldC2);
		
		
		
	}
}
