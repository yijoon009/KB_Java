package interfac;

public interface RomoteControl {
	//�������̽��� ������ ���
	static final double PI = 3.14;
	Double EARTHAREA = 5478.342;
	
	//�߻�޼ҵ� public ����? default? -> public�̾�.
	//�߻�޼ҵ� public abstract�� ������ �� �ֽ��ϴ�.
	public abstract void turnOn();
	void turnOff();
	public void soundOn();
	abstract void soundOff();
	
	//default�޼ҵ带 1.8�������� �����.
	default void setMute() {
		
	}
	
	//�����޼ҵ� 1.8�������� �����
	static void aa() {
		
	}
	
	//������ - �Ұ�
//	public RomoteControl() {;}
	
	//�ʱ�ȭ �� - �Ұ�
//	{ }
	
	//�����ʱ�ȭ �� - �Ұ�
//	static {}
	
}
