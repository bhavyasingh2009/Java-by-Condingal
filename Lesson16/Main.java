package Lesson16;

interface Shape{
    double getArea();
}

class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}

public class Main{
    public static void main(String[] args){
        Shape r = new Rectangle(10,10);
        Shape c = new Circle(10);

        System.out.println(r.getArea());
        System.out.println(c.getArea());

    }
}