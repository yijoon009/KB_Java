package tv;

public class Audio implements RemoteControl, Searchable{
	private int volume;
	
	void chatting(String memo) {
		System.out.println(memo);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("AUDIO를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("AUDIO를 끕니다.");
		
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
		System.out.println("현재 TV 볼륨은 "+this.volume+" 입니다.");
	}
	}

