package ex02_anonymous_implements;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
		}
	};
	
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	
	//�Ű������� �����ִ� ���� �� �������̽��� ������ ��� ��ü ����.
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}











