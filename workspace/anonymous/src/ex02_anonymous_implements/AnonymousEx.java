package ex02_anonymous_implements;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmatrTV on");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmatrTV off");
				
			}
		});
	}

}
