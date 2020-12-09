package ex03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		//방법1.
		button1.setOnClickListner(listener);
		//방법2. 매개변수에 직접 구현
		
		button2.setOnClickListner(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println(":메세지를 보냅니다.");
			}
		});
	}
}
