package anonymous;

public class RemoteContrlMain {
	public static void main(String[] args) {
		
		//���� �̷��� �߾���
//		RemoteControlRun remoteRun = new RemoteControlRun();
//		remoteRun.turnOn();
		
		//������ü �����ϱ�
		RemoteControl remote = new RemoteControl() {
			
			//�Ⱥ������� ���� ��ü��						????????????
			
			@Override
			public void turnOn() {
				System.out.println("�͸�ü �ѱ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("�͸�ü ����");
			}
			
			void ss() {
				System.out.println("�͸�ü �ڽ��� �޼ҵ�");
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
		search.cc();			//�־ȵ�?????????????????????????
		
		
		
		
		
		
		
	}
}
