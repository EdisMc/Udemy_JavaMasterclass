package classes_part1;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("CAREERA");
        System.out.println("Model is: " + porsche.getModel());
    }
}
