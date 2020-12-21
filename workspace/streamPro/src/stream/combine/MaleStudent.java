package stream.combine;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import stream.toList.Student;

public class MaleStudent {
	private List<Student> list;	//요소를 저장할 컬렉션
	public MaleStudent() {
		list = new ArrayList<>();
		System.out.println("["+Thread.currentThread().getName()+"] MaleStudent()" );
	}
	
	//요소를 수집하는 메소드
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()+"] accumulate(Student student)" );
	}
	
	//두 malestudent를 결합하는 메소드 (병렬처리시에만 호출됨)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()+"] combine(Malestudent other)" );
	}
	public List<Student> getList(){
		return list;
	}
	
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(new Student("홍길동", 10, Student.Sex.MALE,Student.City.Pusan),
	            new Student("김수애", 6, Student.Sex.FEMALE,Student.City.Seoul),
	            new Student("신용권", 10, Student.Sex.MALE,Student.City.Pusan),
	            new Student("남자", 13, Student.Sex.MALE,Student.City.Pusan),
	            new Student("박수미", 6, Student.Sex.FEMALE,Student.City.Seoul));
		
		
		/*
		//코드방법1. 각 리턴타입 단계별로
		//오리지널 스트림
//		Stream<Student> totalStream = totalList.stream();
		Stream<Student> totalStream = totalList.parallelStream();
		
		//남학생만 필터링
		Stream<Student> malestream = totalStream.filter(s -> s.getSex() == Student.Sex.MALE);
		
		//남학생을 제공하는 supplier
		Supplier<MaleStudent> supplier = () -> new MaleStudent();
		
		//남학생 자료만 축적하는중
		BiConsumer<MaleStudent, Student> accumulator = (m,s) -> m.accumulate(s);
		
		//결합하는 메소드
		BiConsumer<MaleStudent, MaleStudent> combiner = (ms1,ms2) -> ms1.combine(ms2);
		
		MaleStudent maleStudent = malestream.collect(supplier, accumulator, combiner);
		System.out.println(maleStudent.getList());
		*/

		/*
		//코드방법2. 람다식으로 표현
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() ==Student.Sex.MALE)
				.collect(() -> new MaleStudent(),
						(m,s) -> m.accumulate(s),
						(ms1,ms2) -> ms1.combine(ms2));
		
		System.out.println(maleStudent.getList());
		*/
		
		//코드방법3. 메소드 참조 표현
		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s -> s.getSex() ==Student.Sex.MALE)
				.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		System.out.println(maleStudent.getList());
		
	}
}













