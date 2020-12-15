package generic.test;

public class ContainerEx {

	public static void main(String[] args) {
//		Container<String> container1 = new Container<String>();
//		container1.setT("È«±æµ¿");
//		String str = container1.getT();
//		System.out.println(str);
//		
//		Container<Integer> container2 = new Container();
//		container2.setT(6);
//		int value = container2.getT();
//		System.out.println(value);
		
		Container<String, String> container1 = new Container<>();
		container1.set("È«±æµ¿", "µµÀû");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1+" : "+job);
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("È«±æµ¿", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 +" : "+ age);
	}

}

class Container<K, V>{
	private K key;
	private V value;
	public Container() {;}
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
	
	
}
/*class Container<T>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}*/