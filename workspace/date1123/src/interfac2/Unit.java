package interfac2;

//부모 인터페이스 2개를 상속받고싶다. ObjectInter, Movable
//인터페이스끼리는 다중상속이 가능하다.
public interface Unit extends ObjectInter, Movable{
	//interface끼리는 extends로 상속받을 수 있어.
	
	//상소 UnitMAX = 100;
	int UnitMAX = 100;
	
	public abstract void unitMax();
	
}
