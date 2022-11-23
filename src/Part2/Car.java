package Part2;

import Part1.Employee;

public class Car extends Vehicle {

    private String gear;
    private String type;
    /**
    * All getters and Setters
    */
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
    /**
     * Constructor to pass super class data and the subclass data
     */
    public Car(String make, String plate, String color, String category, String gear, String type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }
    /**
     * Constructor to pass super class data
    */
    public Car(String make, String plate, String color, String category) {
        super(make, plate, color, category);
    }
    /**
     * @Overrride method return the Car class description
    */
    @Override
    public String toString() {
        String description =
                "\n\t- Gear Type: " + gear +
                "\n\t- Type: " + type ;

        return super.toString() + description;
    }
}
