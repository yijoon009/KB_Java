package object.Serializable;

import java.io.Serializable;

public class ClassC  implements Serializable{
	//직접지정
	private static final long serialVersionUID = 5454587;
	
	int fieldC1;
	int fieldC2;

}


//부모 클래스가 직렬화되어 있기 때문에 자식 클래스도 직렬화 가능
//implements Serializable 생략가능
//class classD extends ClassC{
//	
//}