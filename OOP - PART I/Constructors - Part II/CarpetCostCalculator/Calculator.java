package coding_exercise33;

public class Calculator {
    private final Carpet carpet;
    private final Floor floor;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}
