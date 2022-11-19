import Part1.Tester;
import Part2.Car;

public class Test {
    public static void main(String[] args) {
        Tester tester = new Tester("Tilak",1997,10,80,null);
        System.out.println(tester);

        Car car = new Car("BMW", "Custom Plate",  "Black",  "Family", "Automatic",  "Sports");
        System.out.println(car);
    }
}
