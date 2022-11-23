package Part2;
public class Motorcycle extends Vehicle {
    private boolean sideCar = false;

    public Motorcycle(String make, String plate, String color, String category) {
        super(make, plate, color, category);
    }

    public Motorcycle(String make, String plate, String color, String category, boolean sideCar) {
        super(make, plate, color, category);
        this.sideCar = sideCar;
    }

    public boolean getSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }

    @Override
    public String toString() {

        String description =
                "\n\t- " + (getSideCar() ? "with" : "without") + " sidecar";

        return super.toString() + description;
    }
}
