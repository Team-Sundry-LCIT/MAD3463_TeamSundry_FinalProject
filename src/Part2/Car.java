package Part2;

import Part1.Employee;

public class Car extends Vehicle {

    private String gear;
    private String type;

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String make, String plate, String color, String category, String gear, String type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    public Car(String make, String plate, String color, String category) {
        super(make, plate, color, category);
    }

    @Override
    public String toString() {

        String ownsACar = "Employee has a car\n";

        String description =
                "\n\t- gear type: " + gear +
                "\n\t- type: " + type + "\n";

        return ownsACar + super.toString() + description;
    }
}
