package stream.groupingBy;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import stream.toList.Student;

public class GroupingByEx {

	public static void main(String[] args) {
		List<Student> totalList= Arrays.asList(
	            new Student("홍길동", 10, Student.Sex.MALE,Student.City.Pusan),
	            new Student("김수애", 6, Student.Sex.FEMALE,Student.City.Seoul),
	            new Student("신용권", 10, Student.Sex.MALE,Student.City.Pusan),
	            new Student("박수미", 6, Student.Sex.FEMALE,Student.City.Seoul) );
		
	    Stream<Student> totalStream = totalList.stream();
	    //Student 객체가 입력되어서 Student.City가 리턴됨
	    Function<Student, Student.City> classIsFier = Student::getCity;
	    //Student 객체가 입력되어서 Student의 name이 리턴됨
	    Function<Student, String> mapper = Student::getName;
	    //이름을 List에 수집하는 Collector를 얻는다
	    Collector<String, ?, List<String>> collector1 = Collectors.toList();
	    //Collectors의 mapping() 메소드로 Student 이름을 List에 수집하는 Collector를 얻는다
	    
	    
	    
	    
	    
	    
	    
	}

}
