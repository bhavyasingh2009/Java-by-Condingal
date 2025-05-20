package lesson11;

public class Hillstations {
    
    void location(){
        System.out.println("location is:");
    }

    void famousfor(){
        System.out.println("famous for:");
    }
}

class Manali extends Hillstations{

    void location(){

        System.out.println("manali is in himachal pradesh");

    }

    void famousfor(){
        System.out.println("it is famous for hadimba temple and adventure sports");
    }
}


class Mussoorie extends Hillstations{
    void location(){

        System.out.println("mussoorie is in uttarakhand");

    }

    void famousfor(){
        System.out.println("it is famous for education institutions");

    }

}

class Gulmarg extends Hillstations{

    void location(){
        System.out.println("gulmarg is in J&K");

    }

    void fomousfor(){
        System.out.println("it is famous for skiing");
    }
}


class Hillstation {
    public static void main(String args[]){

        Hillstations a = new Hillstations();

        Hillstations m = new Manali();

        Hillstations Mu = new Mussoorie();

        Hillstations g = new Gulmarg();

        a.location();
        a.famousfor();
        m.location();
        m.famousfor();
        Mu.location();
        Mu.famousfor();
        g.location();
        g.famousfor();
    }
}