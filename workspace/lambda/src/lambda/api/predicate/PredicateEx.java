package lambda.api.predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

   static List<Student> list=Arrays.asList(
         new Student("ȫ�浿", "����", 90),
         new Student("�����", "����", 90),
         new Student("���ڹ�", "����", 95),
         new Student("���ѳ�", "����", 92));
   
   private static double avg(Predicate<Student> predicate) { //avg()�޼ҵ� ������ 
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
       double maleAvg =  avg( t ->   t.getSex().equals("����") );
       System.out.println("���� ��� ���� : " + maleAvg);
       
       double femaleAvg =  avg( t ->   t.getSex().equals("����") );
       System.out.println("���� ��� ���� : " + femaleAvg);
     
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