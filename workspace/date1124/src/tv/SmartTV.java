package tv;

//����Ŭ����
public class SmartTV implements RemoteControl, Searchable{

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("SMART_TV�� ŵ�ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("SMART_TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOULUME) {
//			if(volume > RemoteControl.MAX_VOULUME) {
			this.volume = MAX_VOULUME;
		}else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ������ "+this.volume+" �Դϴ�.");
	}

}
