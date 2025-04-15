package lesson4;

public class Main {
    public static void main(String[] args) {
        boolean sunny = true;
        boolean hot   = false;

        if (sunny) {
            if (hot) {
                System.out.println("WEATHER IS SUNNY AND HOT BOTH");
            } else {
                System.out.println("WEATHER IS SUNNY AND NOT HOT");
            }
        } else {
            System.out.println("WEATHER IS NOT SUNNY , BE HAPPY");
        }
    }
}