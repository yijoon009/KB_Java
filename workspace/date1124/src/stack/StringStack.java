package stack;

public class StringStack implements StackInterface{
	private int index = 0;
	private String[] element;
	
	public StringStack(int capacity) {
		element = new String[capacity];
		index = 0;
		
	}
	@Override
	public int length() {
		return index;
	}

	@Override
	public String pop() {
		if(index==0) return null;
		index--;
		return element[index];
	}

	@Override
	public boolean push(String ob) {
		if(index==element.length) return false;
		element[index++] = ob;
		return true;
	}

}
