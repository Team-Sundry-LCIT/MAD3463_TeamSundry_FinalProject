package Part2;

public abstract class Vehicle {

    private String make = "";
    private String plate = "";
    private String color = "";
    private String category = "";

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

    public Vehicle(String make, String plate, String color, String category) {
        this.setMake(make);
        this.setPlate(plate);
        this.setColor(color);
        this.setCategory(category);
    }

    @Override
    public String toString() {

        String ownsACar = "Employee has a " + getClass().getSimpleName();

        return ownsACar + "\n\t- Make: " + make +
                "\n\t- Plate: "+ plate+
                "\n\t- Colour: "+ color +
                "\n\t- Category: "+ category;
    }

}
