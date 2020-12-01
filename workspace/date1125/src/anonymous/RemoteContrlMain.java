package anonymous;

public class RemoteContrlMain {
	public static void main(String[] args) {
		
		//원래 이렇게 했었어
//		RemoteControlRun remoteRun = new RemoteControlRun();
//		remoteRun.turnOn();
		
		//구현객체 생략하기
		RemoteControl remote = new RemoteControl() {
			
			//안보이지면 여기 객체야						????????????
			
			@Override
			public void turnOn() {
				System.out.println("익명객체 켜기");
			}
			
			@Override
			public void turnOff() {
				System.out.println("익명객체 끄기");
			}
			
			void ss() {
				System.out.println("익명객체 자신의 메소드");
			}
		};
		remote.turnOff();
		
		Searchable search = new Searchable() {
			
			int sss=100;
			
			@Override
			public void s2() {
				
				
			}
			
			@Override
			public void s1() {
				// TODO Auto-generated method stub
				
			}
			public void cc() {
				s2();
				sss+=10;
			}
		};
		
		search.s1();
		search.cc();			//왜안돼?????????????????????????
		
		
		
		
		
		
		
	}
}
