package coding.exercises.examples.part2;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999) || year % 400 == 0 && (year >= 1 && year <= 9999)) {
            return true;
        } else {
            return false;
        }
    }

}