package Lesson15;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;

    }

    public String getBreed(){
        return breed;
    }

    @Override
    public void makeSound(){
        System.out.println("dog barks");
    }
    
}
