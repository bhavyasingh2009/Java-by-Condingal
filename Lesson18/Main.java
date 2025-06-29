package Lesson18;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Book book = new Book("a1", "Sapiens", LocalDate.of(2009, 7, 9), "Bhavya", 500);

        Dvd dvd = new Dvd("b1", "rowdy rathore", LocalDate.of(2024, 8, 8), "Ankush", 29);

        Patron alice = new Patron("Alice");

        alice.checkOutItem(book);
        alice.checkOutItem(dvd);

        System.out.println(alice.getNumItemsCheckedOut());

        alice.returnAnItem(dvd);

        System.out.println(alice.getNumItemsCheckedOut());
    }
    
}
