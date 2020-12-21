package stream.toList;

import java.util.*;
import java.util.stream.Collectors;

public class ToListEx {

	public static void main(String[] args) {
		 List<Student> totalList= Arrays.asList(
		            new Student("홍길동", 10, Student.Sex.MALE,Student.City.Pusan),
		            new Student("김수애", 6, Student.Sex.FEMALE,Student.City.Seoul),
		            new Student("신용권", 10, Student.Sex.MALE,Student.City.Pusan),
		            new Student("박수미", 6, Student.Sex.FEMALE,Student.City.Seoul) );
		    
		     //남학생들만 묶어서 List생성
		     List<Student> maleList = totalList.stream()
		            .filter(s->s.getSex()==Student.Sex.MALE)
		            .collect(Collectors.toList());
		      System.out.println(maleList);
		      
		      maleList.stream().forEach(n->System.out.print(n.getSex()+" " + n.getName()));
		      
		      //여학생만 묶어서 List생성 - 송승훈
		      List<Student> femaleList = totalList.stream()
		            .filter(s->s.getSex()==Student.Sex.FEMALE)
		            .collect(Collectors.toList());
		     System.out.println(femaleList);
		     femaleList.stream().forEach(n->System.out.println(n.getSex()+" "+n.getName()));

		      //서울에 사는 사람만 List생성 - 임지혁
		     List<Student> seoulList= totalList.stream()
		            .filter(s-> s.getCity()==Student.City.Seoul)
		            .collect(Collectors.toList());
		     System.out.println(seoulList);

		      //부산에 사는 사람만 List생성 - 김이준
		     List<Student> pusanList = totalList.stream()
		            .filter(s->s.getCity()==Student.City.Pusan)
		            .collect(Collectors.toList());
		      pusanList.stream().forEach(s->System.out.println(s.getName()));

		      //점수가 8이상만 List생성 - 홍아현
		     List<Student> scoreList = totalList.stream()
		            .filter(s -> s.getScore() >= 8)
		            .collect(Collectors.toList());
		    scoreList.stream().forEach(System.out :: println);
		   }

}


