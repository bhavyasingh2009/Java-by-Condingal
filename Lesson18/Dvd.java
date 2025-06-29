package Lesson18;

import java.time.LocalDate;

public class Dvd extends Item {
    private String director;
    private int runningTime;

    public Dvd(String id, String title, LocalDate publicationDate, String dierector, int runningTime){
        super(id, title, publicationDate, 7);
        this.director = director;
        this.runningTime = runningTime;

    }

    public String getDirector(){
        return this.director;
    }
    public int runningTime(){
        return this.runningTime;
    }
    
}
