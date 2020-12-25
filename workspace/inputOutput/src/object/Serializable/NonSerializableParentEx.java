package object.Serializable;

import java.io.*;

public class NonSerializableParentEx {

	public static void main(String[] args) throws Exception {
		//직렬화하기
		FileOutputStream fos = new FileOutputStream("C:/Temp/nonObject.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		Child child = new Child();
		child.field1 = "홍길동";
		child.field2 = "홍삼원";
		oos.writeObject(child);
		oos.flush(); oos.close(); fos.close(); 

		//역직렬화
		FileInputStream fis = new FileInputStream("C:/Temp/nonObject.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		System.out.println("field1: " + child.field1);
		System.out.println("field2: " + child.field2);
		ois.close(); fis.close();
	}

}
