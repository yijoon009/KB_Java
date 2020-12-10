package hashMap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx02 {
	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student, Integer>();
		//값 넣기
		map.put(new Student(2020, "홍길동"), 100);
		map.put(new Student(2019, "김길동"), 80);
		map.put(new Student(2018, "홍길동"), 90);
		map.put(new Student(2020, "홍길동"), 100);
		
		//출력하기 2018 홍길동 key 넣어서 90
		System.out.println(map.get(new Student(2018,"홍길동")));
		
		
		
		//모두 출력 map.get(key)반복해서 넣어주기
		//방법1. key만 전부 다 가지고 온다.
		Set<Student> keys = map.keySet();
		Iterator<Student> iter = keys.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(map.get(s));
		}
		
		//방법2. Map에 있는 Map.Entry로 모두 가져온다 -> key만 가져온다 -> 반복해서 key를  넣어준다.
		//								     -> value만 가지고 온다.
		Set<Map.Entry< Student, Integer>> entryS = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> itt = entryS.iterator();
		while(itt.hasNext()) {
			Map.Entry<Student, Integer> k = itt.next();
			//key만 가지고 옴
			Student key = k.getKey();
			System.out.println("key: "+key.name);
			//value만 가지고 옴
			Integer value = k.getValue();
			System.out.println("value: "+value);
		}
		
		Map<Person, Integer> map2 = new HashMap<Person, Integer>();
		map2.put(new Person("123", "seoul", "kim", 100), 200);
		map2.put(new Person("454", "incheon", "hong", 90), 500);
		map2.put(new Person("875", "busan", "oark", 200), 200);
		map2.put(new Person("123", "seoul", "kim", 100), 200);
		//1개 검색하기
		int point = map2.get(new Person("123", "seoul", "kim", 100));
		System.out.println(point);
		
		//모두출력하기 방법1. keySet() - 키값들을 구함
		Set<Person> keyset2 = map2.keySet();
		for(Person key: keyset2) {
			System.out.println(map2.get(key));
		}
		
		//방법2. entrySet()
		Set<Map.Entry<Person, Integer>> es = map2.entrySet();
		for(Map.Entry<Person, Integer> entryset : es) {
			//getKey()
			System.out.println(entryset.getKey());
			//getValue()
			System.out.println(entryset.getValue());
			//get(key)방법으로 value값 얻어오기
			System.out.println(map2.get(entryset.getKey()));
		}
	}
}

class Person{
	String tel;
	String city;
	String name;
	int point;
	public Person(String tel, String city, String name, int point) {
		super();
		this.tel = tel;
		this.city = city;
		this.name = name;
		this.point = point;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + point;
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
		Person other = (Person) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (point != other.point)
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
	
}

class Student{
	int sno;
	String name;
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	//학번, 이름 같으면 동등객체

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + sno;
//		return result;
		return (name+sno).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (sno != other.sno)
//			return false;
//		return true;
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return sno==s.sno && name.equals(s.name);
		}
		return false;
	}
	
	
	
}