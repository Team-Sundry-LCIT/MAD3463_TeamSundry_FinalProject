package Part2;

interface MotorcycleInterface {
    boolean sideCar = false;
}
public class Motorcycle implements MotorcycleInterface {
    private boolean sideCar = false;
    private String make;
    private String plate;
    private String color;
    private String category;

    public boolean isSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Employee has a " +
                "\t- Model:" + make + '\'' +
                "\t- Plate:" + plate + '\'' +
                "\t- Colour:" + color + '\'' +
                "\t- Category:" + category + '\'' +
                "\t- " + (sideCar ? "with" : "without") + "a sidecar" + '\'';
    }
}
