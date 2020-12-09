package ex03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window(){
		//���1.
		button1.setOnClickListner(listener);
		//���2. �Ű������� ���� ����
		
		button2.setOnClickListner(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println(":�޼����� �����ϴ�.");
			}
		});
	}
}
