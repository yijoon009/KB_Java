package toString;

public class Card {
	String kind;
	int num;
	public Card() {
		this("SPADE", 1);	//�ٸ� ������ ȣ��
	}
	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return "kind: "+kind+", number: "+num;
	}
}
