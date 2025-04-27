class Employees{
 int empno;
 String names;
 float sal;

  Employees(){
    System.out.println("we are in constructor");
        empno = 181;
        names = "Bhavya";
        sal = 50000;}

     void display(){
     System.out.println(empno + " " + names + " " + sal);
}


}

public class Main {
    
    public static void main(String[] args) {
        Employees bobj = new Employees();
        bobj.display();


    }
}

