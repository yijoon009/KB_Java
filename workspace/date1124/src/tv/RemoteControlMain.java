package tv;

public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl rc = null;	//인터페이스타입을 참조변수 사용하기 위해 선언
		RemoteControl rc1 = null;
		
		rc = new SmartTV();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		
		//search()호출하기
		//down casting하기
		SmartTV sm = (SmartTV) rc;
		sm.search("KBS");
		
		rc1 = new Audio();
		rc1.turnOn();
		rc1.setVolume(13);
		
		Audio ad = (Audio) rc1;
		ad.chatting("메모메모");
	}
}
