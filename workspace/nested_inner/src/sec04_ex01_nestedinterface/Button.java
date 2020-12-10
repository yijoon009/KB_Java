package sec04_ex01_nestedinterface;

public class Button {
	
	OnClickListener listner;
	
	//���� �Ű������� ���� �װ��� onClick�� ������.
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
