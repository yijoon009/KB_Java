package sec04_ex01_nestedinterface;

public class ButtonEx {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListner(new CallListener());
		btn.touch();
		
		btn.setOnClickListner(new MessageListener());
		btn.touch();
		
		//위의 방법보다는
		//아래 익명객체를 이용하는 방식이 더 자주 쓰임
		btn.setOnClickListner(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();
		
	}

}
