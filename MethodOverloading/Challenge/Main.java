package method.overloading;

import static method.overloading.SecondsAndMinutes.getDurationString;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65L,45L));
        System.out.println(getDurationString(3945L));
    }

}
