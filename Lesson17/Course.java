package Lesson17;

public class Course {
    private String name;
    private int credits;
    private double  grade;

    public Course(String name, int credits){
        this.name = name;
        this.credits = credits;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return credits;
    }

    public String getName(){
        return name;
    }

    public String getLetterGrade(){
        if(grade > 9.5){
            return "A plus";
        }else if(grade > 9){
            return "A minus";
        }else if(grade > 8){
            return "8 plus";
        }else if(grade > 7){
            return "8 minus";
        }else{
            return "c";
        }
    }
}
