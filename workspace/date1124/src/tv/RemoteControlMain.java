package tv;

public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl rc = null;	//�������̽�Ÿ���� �������� ����ϱ� ���� ����
		RemoteControl rc1 = null;
		
		rc = new SmartTV();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		
		//search()ȣ���ϱ�
		//down casting�ϱ�
		SmartTV sm = (SmartTV) rc;
		sm.search("KBS");
		
		rc1 = new Audio();
		rc1.turnOn();
		rc1.setVolume(13);
		
		Audio ad = (Audio) rc1;
		ad.chatting("�޸�޸�");
	}
}
