package generic.extendsEx;

//�������̽� ������ü
public class StorageImpl<T> implements Storage<T>{
	
	private T[] arr;
	
	public StorageImpl(int capa) {
		//Ÿ�� �Ķ���ͷ� �迭�� ����
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
