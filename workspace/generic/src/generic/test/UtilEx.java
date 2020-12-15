package generic.test;

public class UtilEx {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		
		//Util.getValue 바로쓴거 보니까 static 메소드인걸 알아봐야해
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "김기준");
		System.out.println(childAge);

		/*OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
		//OtherPair는 Pair를 상속하지 않으므로 예외가 발생해야 합니다.
		int otherAge = Util.getValue(otherPair, "홍삼원");
		System.out.println(otherAge);*/
		}
	}

class Pair<K, V> {

	private K key;
	private V value;
	public Pair() {;}
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; }
}

class ChildPair<K, V> extends Pair<K,V> {
	public ChildPair(K k, V v) {
		super(k, v);
	}
}

class OtherPair<K, V> {

	private K key;
	private V value;
	
	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; }
}



class Util<T, V>{
	
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(p.getKey().equals(k)) {
			return p.getValue();
		}else {
			return null;
		}
		
	}
} 






