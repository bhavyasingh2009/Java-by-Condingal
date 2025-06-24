package Lesson17;

public class Main {
   public static void main(String[] args){
     Course cs = new Course("computer science",4);
    cs.setGrade(7.8);

    Student bhavya = new Student("bhavya singh", 2);
    bhavya.addCourse(cs);

    System.out.println(bhavya.getCGPA());
   }

}
