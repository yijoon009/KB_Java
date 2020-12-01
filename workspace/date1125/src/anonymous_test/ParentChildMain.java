package anonymous_test;

public class ParentChildMain {
	public static void main(String[] args) {
		//일반적인 방법
//		Child1 c1 = new Child1();
//		Child2 c2 = new Child2();
//		c1.p1();
//		c2.c2();
		
		int aa = 30;
		
		//다른 방법
		//추상 클래스를 객체화
		//추상 클래스의 부모를 익명자식객체로 만든 예제
		Parent p1 = new Parent() {
			
			int a=10;
			
			@Override
			public void ap1() {
				System.out.println("익명 자식 객체 추상메소드");
				System.out.println(aa);
				ss();
			}
			public void ss() {
				a+=30;
				System.out.println(aa);}
		};
		
		//일반클래스의 부모를 익명자식객체로 만들기
		Parent2 p2 = new Parent2() {
			int a = 5;
			@Override
			public void c2() {
				// TODO Auto-generated method stub
				super.c2();
			}
			
			public void s2() {
				a+=20;
			}
		};	//익명 객체라는 표시
		
		
		
	}
}
