package compare;

import java.util.*;

public class ComparatorTest02 {

	public static void main(String[] args) {
		Set<Fruit> treeset = new TreeSet<>(new DescendingComparator());
		treeset.add(new Fruit("����", 3000));
		treeset.add(new Fruit("����", 13000));
		treeset.add(new Fruit("����", 6000));
		Iterator<Fruit> iter = treeset.iterator();
		while(iter.hasNext()) {
			Fruit f = iter.next();
			System.out.println(f);
		}
	}
}

class Fruit implements Comparator<Fruit> {
	String name;
	int price;
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return 1;
		else if(o1.price == o2.price) return 0;
		else return -1;
	}
	@Override
	public String toString() {
		return name + " " + price;
	}
}

class DescendingComparator implements Comparator<Fruit>{

	//��������
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.name.hashCode() < o2.name.hashCode()) return -1;
		else if(o1.name.hashCode() == o2.name.hashCode()) return 0;
		else return 1;
	}
	//��������
//		@Override
//		public int compare(Fruit o1, Fruit o2) {
//			if(o1.price < o2.price) return 1;
//			else if(o1.price == o2.price) return 0;
//			else return -1;
//		}
	
	
	
}








