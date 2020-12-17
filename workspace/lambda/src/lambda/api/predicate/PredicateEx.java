package lambda.api.pradicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

   static List<Student> list=Arrays.asList(
         new Student("홍길동", "남자", 90),
         new Student("김순희", "여자", 90),
         new Student("감자바", "남자", 95),
         new Student("박한나", "여자", 92));
   
   private static double avg(Predicate<Student> predicate) { //avg()메소드 정의함 
      int count =0; int sum = 0;
      for(Student student : list) {
         if(predicate.test(student)) {
            count++;
            sum += student.getScore();
         }
      }
      return  (double) sum/ (double) count;
      
   }//end avg()
   
   
   public static void main(String[] args) {
      //boolean test(T t);
       double maleAvg =  avg( t ->   t.getSex().equals("남자") );
       System.out.println("남자 평균 점수 : " + maleAvg);
       
       double femaleAvg =  avg( t ->   t.getSex().equals("여자") );
       System.out.println("여자 평균 점수 : " + femaleAvg);
     
       }      
      
   }


class Student{
   String name;
   String sex;
   int score;
   
   public Student(String name, String sex, int score) {
      this.name = name;
      this.sex = sex;
      this.score = score;
   }
   
   public String getName() {
      return name;
   }
   public String getSex() {
      return sex;
   }
   public int getScore() {
      return score;
   }
   
}