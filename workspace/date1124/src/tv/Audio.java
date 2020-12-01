package tv;

public class Audio implements RemoteControl, Searchable{
	private int volume;
	
	void chatting(String memo) {
		System.out.println(memo);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("AUDIO�� ŵ�ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("AUDIO�� ���ϴ�.");
		
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

