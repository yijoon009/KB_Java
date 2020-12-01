package classAPI;

public class ClassTest {
	public static void main(String[] args) {
//		Class c = new Class();
		
		//생성자가 없는 경우, 클래스 API 사용
//		Class class1 = car.getClass();
		
		// Class 클래스
				/*
				클레스에 대한 정보를 얻기 좋은 클래스, class 클래스는 생성자가 따로 없다.
				ClassLoader 클래스의 defineClass()메소드를 이용해서 클래스 객체를 만들 수 있지만,
				좋은 방법은 아님.
				Object클래스에 있는 getClass(); 메소드를 이용하는 것이 일반적 
				 */
				Car car = new Car();
				car.getClass(); // getClass 를 통해서 class를 만드는. 
				
				Class clazz1 = car.getClass();// 생성자가 없는 경우의 클래스 Api사용예
				String name = clazz1.getName(); // 클래스의 이름을 리턴한다
				String sname = clazz1.getSimpleName(); // 
				clazz1.getPackage(); // 클래스의 패키지 정보를 패키지 클래스 타입으로 리턴한다.
	}
}

class Car{
	
}
