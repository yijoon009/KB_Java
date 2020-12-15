package generic.extendsEx;

//인터페이스 구현객체
public class StorageImpl<T> implements Storage<T>{
	
	private T[] arr;
	
	public StorageImpl(int capa) {
		//타입 파라미터로 배열을 생성
		this.arr = (T[])(new Object [capa]);
	}
	
	@Override
	public void add(T item, int index) {
		
	}

	@Override
	public T get(int index) {
		return null;
	}
	

}
