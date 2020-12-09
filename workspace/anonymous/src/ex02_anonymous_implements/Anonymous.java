package ex02_anonymous_implements;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};
	
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	
	//매개변수에 들어갈수있는 값은 이 인터페이스를 구현한 모든 객체 가능.
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}











