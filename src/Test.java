import Part1.Employee;
import Part1.Tester;
import Part2.Car;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Test part 1
        System.out.println("Test 1: ");
        hire_test1();

        // Test part 2
        System.out.println("Test 2: ");
        System.out.println("Employees description: ");
        hire_test2();
    }

    public static void hire_test1() {
        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Manager("Serge", 1985,  30, 4));
//        employees.add(new Manager("Cindy", 1974,  20,  6));
//        employees.add(new Programmer("Paul",  1993, 3,  75));
        employees.add(new Tester("Pierre", 1987, 124,50));
//        employees.add(new Programmer("Matt",  1981,  5,  110));
//        employees.add(new Programmer("Sarah", 1986,  3,50));

    }
    public static void hire_test2() {
//        Motorcycle m1 = new Motorcycle("Kawasaki","Custom Plate", "Yellow",  "Race Motorcycle", false);
//        Motorcycle m2 = new Motorcycle("Honda","Custom Plate", "Black", "Not for Race", true);
        Car vt1 = new Car("Lamborghini", "Custom Plate", "White","Family", "Manual","Sport");
        Car vt2 = new Car("BMW",  "Custom Plate", "Black", "Family","Automatic","Sedan");
        Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
        Car vt4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic","SUV");

        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Manager("Serge", 1985, 30, 4, vt1));
//        employees.add(new Manager("Cindy",1974, 20,  6, vt2));
//        employees.add(new Programmer("Paul",  1993,  3, 75, vt3));
        employees.add(new Tester("Pierre", 1987, 124, 50, vt4));
//        employees.add(new Programmer("Matt", 1981, 5, 110, vt4));
//        employees.add(new Programmer("Sarah", 1986, 3,30, vt3));

        for( Employee item : employees ){
            System.out.println("-------------------------");
            System.out.println(item);
            System.out.println("-------------------------");
        }
    }
}
