package Lesson15;

public class Cat extends Animal {
    private boolean isIndoor;
    public Cat(String name, int age, boolean isIndoor){
        super(name,age);
        this.isIndoor = false;
    }
    public boolean getIsIndoor{
        return isIndoor;
    }

    @Override
    public void makeSound(){
        System.out.println("cat meows");
    }
}
