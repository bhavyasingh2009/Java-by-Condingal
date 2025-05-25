package Lesson12;

interface BhavyaInterface{
    public void method1();
    public void method2();
}

interface CodingalInterfacce {
    public void method3();
    public void method4();

    
}

    


class Ankush implements BhavyaInterface{
    public void method1(){
        System.out.println("i am method 1");
    }
    public void method2(){
        System.out.println("i am method 2");
    }
    public void method3(){
        System.out.println("i am method 3");
    }
    public void method4(){
        System.out.println("i am method 4");
    }
}



public class Main {
    public static void main(String[] args) {
        // AnkushClass ac = new AnkushClass();
        // ac.method1();
        // ac.method2();
        // ac.method3();
        // ac.method4();

        try{
            System.out.println("i am in try");
            int x = 20;
            int y = 0;
            System.out.println(x/y);
            System.out.println("output to tell this sentence");



        } catch(ArithmeticException e ){
            System.out.println("there is error and which");
        }
        finally{
            System.out.println("this will run everytime");
        }
    }
     
}
