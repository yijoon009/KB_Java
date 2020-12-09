package sec04_ex01_nestedinterface;

public class ButtonEx {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListner(new CallListener());
		btn.touch();
		
		btn.setOnClickListner(new MessageListener());
		btn.touch();
		
		//���� ������ٴ�
		//�Ʒ� �͸�ü�� �̿��ϴ� ����� �� ���� ����
		btn.setOnClickListner(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
			}
		});
		btn.touch();
		
	}

}
