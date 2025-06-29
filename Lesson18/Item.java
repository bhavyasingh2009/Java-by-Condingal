package Lesson18;

import java.time.LocalDate;

public class Item {
    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;
    
    public Item(String var1, String var2, LocalDate var3, int var4){
        this.id = var1;
        this.title = var2;
        this.publicationDate = var3;
        this.maxCheckoutDays = var4;
    }
    public String getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public LocalDate getPublicationDays(){
        return this.publicationDate;
    }
    public int getMaxCheckoutDays(){
        return this.maxCheckoutDays;
    }
}
