package clone;

public class ShallDeepCopyTest {
	public static void main(String[] args) {
		/*
		 * 얕은 복제 (Object 클래스 clone())
		 *  - 기본형 값 복사
		 *  - 객체형 주소 복사
		 *  Car c = new Car();
		 *  참조변수를 가르키는 주소가 동일하므로
		 *  참조변수 값을 바꾸면 같이 바뀐다.
		 * 
		 * 깊은 복제 (
		 *  - 자손클래스가 부모클래스 (Object 클래스 clone()) 수행
		 *  - 자손 클래스가 재정의해서 clone()을 수행
		 *  */
		
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();	//shallow
		Circle c3 = c1.deepCopy();	//deep
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("c3 : "+c3);
		
		//수정하기
		c1.p.x = 9;
		c1.p.y = 10;
		c1.r = 30;
		
		System.out.println("수정 후");
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("c3 : "+c3);
	
		
		
		
		
	}
}
