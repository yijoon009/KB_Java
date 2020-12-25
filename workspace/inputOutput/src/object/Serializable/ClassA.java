package object.Serializable;

import java.io.Serializable;

//직렬화
public class ClassA implements Serializable{

	private static final long serialVersionUID = 1L;
	int field1;
	ClassB field2 = new ClassB(); 
	static int field3;
	transient int field4;
}



class ClassB  implements Serializable{

	private static final long serialVersionUID = 1L;
	int field1;
}