package anonymous;

//������ü �����
public class RemoteControlRun implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("������ü �ѱ�");
	}

	@Override
	public void turnOff() {
		System.out.println("������ü ����");
	}
	
}
