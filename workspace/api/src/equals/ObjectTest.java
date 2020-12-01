package equals;

import java.util.Arrays;

public class ObjectTest {
	public static void main(String[] args) {
		Value v1 = new Value(10,30);
		Value v2 = new Value(10,30);
		if(v1.equals(v2)) {
			System.out.println("equals 같음");
		}else {
			System.out.println("equals 다름");
		}
		if(v1 == v2) {
			System.out.println("== 같음");
		}else {
			System.out.println("== 다름");
		}
	}
	
}

class Value{
	int val1;
	int val2;
	public Value(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value val = (Value) obj;
			if(val1 == val.val1 && val2 == val.val2) {
				return true;
			}
		}
		return false;
	}
}
