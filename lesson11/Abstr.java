package lesson11;

abstract class Shape{
    abstract void printShape();

    public void Shape(){
        System.out.println("I am from abstract class" );
    }
}

class Sphere extends Shape{
    void printShape(){
        System.out.println("I am sphere");
    }
}

class Cube extends Shape{
    void printShape(){
        System.out.println("I am cube");
    }
}

public class Abstr {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.printShape();

        Cube c = new Cube();
        c.printShape();
    }
    
}
