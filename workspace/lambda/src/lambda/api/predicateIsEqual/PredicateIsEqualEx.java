package lambda.api.predicateIsEqual;

import java.util.function.Predicate;

public class PredicateIsEqualEx {

	public static void main(String[] args) {
		Predicate<String> predicate;
		predicate = Predicate.isEqual(null);
		System.out.println(predicate);
		System.out.println("null null : "+predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8 null : " + predicate.test("Java8"));
		
		
		
	}

}
