package phone;

public class PhoneMain {
	public static void main(String[] args) {
		//smartphone 객체화
		SmartPhone smartphone = new SmartPhone();
		
		//smartphone 다형성
		Phone phone = new SmartPhone();
		
		
		//phone 객체화
		//추상클래스는 phone 객체화 없다
//		Phone phone2 = new Phone() {};
	}
}
