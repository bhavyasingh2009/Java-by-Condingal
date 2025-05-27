package Lesson13;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class Student extends Person{
    private String major;
    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    public String getMajor(){
        return major;
    }
}

class Book{
    private String titles;
    private String author;
    private int numPages;

    public Book(String titles, String author, int numPages){
        this.titles = titles;
        this.author = author;
        this.numPages = numPages;
    }
}

public class Main{
    public static void main(String[] args) {
        Student student = new Student(name:"yoyo", age:32, major:"music");
    }

}