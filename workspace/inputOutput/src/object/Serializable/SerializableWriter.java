package object.Serializable;

import java.io.*;

//직렬화 하기
public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 바이트 기반 스트림
		 * 읽을 수 없음
		 */
		//나가는게 먼저
		FileOutputStream fos = new FileOutputStream("c:/temp/obj2.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
//		ClassA classA = new ClassA();
//		
//		//각 클래스의 필드에 내용 넣기
//		classA.field1 = 1;
//		//클래스B 필드에 값 넣기
//		classA.field2.field1 = 2;
//		//정적 필드에 값 넣기
//		ClassA.field3 = 3;
//		classA.field4 = 4;
//		
//		//Object에 값넣기
//		oos.writeObject(classA);
//		
//		oos.flush();oos.close();fos.close();
		
		
		ClassC classC = new ClassC();
		classC.fieldC1 = 100;
		classC.fieldC2 = 200;
		
		oos.writeObject(classC);
		oos.flush();oos.close();fos.close();
		
		
		
	}

}
