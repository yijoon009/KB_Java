package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "È«±æµ¿"));
		set.add(new Student(2, "È«¹Úµ¿"));
		set.add(new Student(4, "È«ÇÔµ¿"));
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.snum + ": " +s.name);
		}
	}

}
class Student{
	public int snum;
	public String name;
	public Student(int snum, String name) {
		super();
		this.snum = snum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + snum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (snum != other.snum)
			return false;
		return true;
	}
	
}