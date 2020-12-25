package object.Serializable;

import java.io.*;

public class Parent {
	public String field1;
}

class Child extends Parent implements Serializable{

	private static final long serialVersionUID = 1L;
	String field2;
	
	
	//자식 객체를 직렬화할때 자동호출됨
	private void writeObj(ObjectOutputStream out)throws IOException{
		//부모 객체의 필드값을 출력
		out.writeUTF(field1);
		//자식 객체의 필드값을 직렬화
		out.defaultWriteObject();
	}
	
	//자동호출됨
	private void readObj(ObjectInputStream in) throws Exception{
		//부모 객체의 필드값을 읽어옴
		field1 = in.readUTF();
		//자식 객체의 필드값을 역직렬화
		in.defaultReadObject();
	}
	
	
}