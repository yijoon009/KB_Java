package lambda.usingThis;

public class UsingThisEx {

	public static void main(String[] args) {

		UsingThis us = new UsingThis();
		UsingThis.Inner inner = us.new Inner();
		inner.method();
		
	}

}
