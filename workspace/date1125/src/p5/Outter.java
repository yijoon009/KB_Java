package p5;

public class Outter {
	int o1 = 10;
	void o1Method() {}
	
	//����Ŭ����
	class Inner{
		int i1 = 20;
		int o1 = 30;	//�ٸ� Ŭ�����ϱ� ���ϸ��� �������� ����
		void i1Method() {
			this.o1 += 100;
			System.out.println(o1);
		}
	}
}
