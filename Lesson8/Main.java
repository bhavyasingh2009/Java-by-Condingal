package Lesson8;
//class vehicle{
  //  int u = 5;
    //int k = 8;
    //void allvehicleproperty()){
      //  System.out.println("we are vehicle, we run on fossil fuel and electricity");
    //}
//}

//single inheritance
//class Bike extends vehicle{

//}

//public class Main{
  //  public static void main(String[]args){
    //    Bike b = new Bike();
      //  b.allvehicleproperty();
        //System.out.println("from bike calling data members k using bike object;"+b.k);
    //}
//}


//multiple inheritance
// class Animal{
//     void eat(){
//         System.out.println("eating animal class");
//     }
// }

//  class Lion extends Animal{
//     void roar(){
//         System.out.println("lion roaring");
//     }
//  }

//  class Babylion extends Lion{
//     void weep(){
//         System.out.println("baby lion weep");
//     }
//  }

//  class Main{
//     public static void main(String[] args) {
//         Babylion bl = new Babylion();
//         bl.weep();
//         bl.roar();
//         bl.eat();
//     }
//  }

// hirarical inheritance
class Mamals{
    void mam(){
        System.out.println("inside mamal class");
    }
}

class Lion extends Mamals{
    void roar(){
        System.out.println("inside lion class");
    }
}

class Human extends Mamals{
    void hum(){
        System.out.println("inside human class");
    }
}

class Main{
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.roar();
        obj.mam();

        Human obb = new Human();
        obb.hum();
        obb.mam();
    }
}