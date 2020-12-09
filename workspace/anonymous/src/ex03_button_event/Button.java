package ex03_button_event;

public class Button {
	
	OnClickListener listner;
	
	//들어온 매개변수의 따라 그것의 onClick이 구현됨.
	void setOnClickListner(OnClickListener listner) {
		this.listner = listner;
	}

	void touch() {
		listner.onClick();
	}

	interface OnClickListener{
		void onClick();
	}
}
