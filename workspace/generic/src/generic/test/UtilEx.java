package generic.test;

public class UtilEx {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		
		//Util.getValue �ٷξ��� ���ϱ� static �޼ҵ��ΰ� �˾ƺ�����
		Integer age = Util.getValue(pair, "ȫ�浿");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("ȫ���", 20);
		Integer childAge = Util.getValue(childPair, "�����");
		System.out.println(childAge);

		/*OtherPair<String, Integer> otherPair = new OtherPair<>("ȫ���", 20);
		//OtherPair�� Pair�� ������� �����Ƿ� ���ܰ� �߻��ؾ� �մϴ�.
		int otherAge = Util.getValue(otherPair, "ȫ���");
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






