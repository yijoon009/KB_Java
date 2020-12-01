package toString;

public class Card {
	String kind;
	int num;
	public Card() {
		this("SPADE", 1);	//다른 생성자 호출
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
