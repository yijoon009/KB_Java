package ex03_button_event;

public class Button {
	
	OnClickListener listner;
	
	//���� �Ű������� ���� �װ��� onClick�� ������.
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
