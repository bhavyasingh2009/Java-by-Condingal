package Lesson14;

class Circle{
    private double radius;

    public Circle(){
        System.out.println("default constructor: instantiaciingvthe object called this constructor");
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double calculateAre(){
        return Math.PI * radius*radius;   
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}


public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(6);

        System.out.println(c1.getRadius());
        System.out.println(c1.calculateAre());
        System.out.println(c1.getCircumference());

        System.out.println(c2.getRadius());
        System.out.println(c2.calculateAre());
        System.out.println(c2.getCircumference());

        
    }
    
}
