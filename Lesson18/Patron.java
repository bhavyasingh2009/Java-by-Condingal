package Lesson18;



public class Patron {
    private String name;
    private int checkOutItems;

    public Patron(String name){
        this.name = name;
    }

    //to checkout an item
    public void checkOutItem(Item item){
        this.checkOutItems = this.checkOutItems + 1;
    }


    //to return an item
    public void returnAnItem(Item item){
         this.checkOutItems = this.checkOutItems - 1;
    }
       


    //to return how many items are currently their with the patron
    public int getNumItemsCheckedOut(){
        return this.checkOutItems;
    }

    
}
