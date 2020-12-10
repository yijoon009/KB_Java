package sec04_ex01_nestedinterface;

public class Button {
	
	OnClickListener listner;
	
	//들어온 매개변수의 따라 그것의 onClick이 구현됨.
	public void setOnClickListner(OnClickListener listner) {
		this.listner = listner;
	}

	void touch() {
		listner.onClick();
	}

	interface OnClickListener{
		void onClick();
	}
}
