package Lesson10.subpackage;

public class Animal {
    private int n;
    private int a;

    public int sum(){
        return n+a;
    }
    
    public void settingVariable(int n, int a){
        this.n = n;
        this.a = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal anm = new Animal();
        System.out.println(anm.sum());
    }
}