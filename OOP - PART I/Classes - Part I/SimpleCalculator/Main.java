package coding_exercise29;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        calculator.setFirstNumber(5.879);
        calculator.setSecondNumber(4.02);
        System.out.println("Added: " + calculator.getAdditionResult());
        System.out.println("Subtracted: " + calculator.getSubtractionResult());
        System.out.println("Multiplied: " + calculator.getMultiplicationResult());
        System.out.println("Divided: " + calculator.getDivisionResult());
    }
}
