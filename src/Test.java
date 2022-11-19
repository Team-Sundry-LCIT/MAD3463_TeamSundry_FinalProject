import Part1.Employee;
import Part1.Tester;
import Part2.Car;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


//        Car car = new Car("BMW", "Custom Plate",  "Black",  "Family", "Automatic",  "Sports");
////        System.out.println(car);
//
//        Tester tester = new Tester("Tilak",1997,10,80,car);
//        System.out.println(tester);

        System.out.println("Test 1: ");
        hire_test1();

        System.out.println("Test 2: ");
        System.out.println("Employees description: ");
        hire_test2();
    }

    public static void hire_test1() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Tester("Serge", 1985,  30, 4,null));
        employees.add(new Tester("Cindy", 1974,  20,  6, null));
        employees.add(new Tester("Paul",  1993, 3,  75,null));
        employees.add(new Tester("Pierre", 1987, 124,50,null));
        employees.add(new Tester("Matt",  1981,  5,  110,null));
        employees.add(new Tester("Sarah", 1986,  3,50,null));
    }
    public static void hire_test2() {
        //        Motorcycle m1 = new Motorcycle("Kawasaki","Custom Plate", "Yellow",  "Race Motorcycle", false);
//        Motorcycle m2 = new Motorcycle("Honda","Custom Plate", "Black", "Not for Race", true);
        Car vt1 = new Car("Lamborghini", "Custom Plate", "White","Family", "Manual","Sport");
        Car vt2 = new Car("BMW",  "Custom Plate", "Black", "Family","Automatic","Sedan");
        Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
        Car vt4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic","SUV");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Tester("Serge", 1985, 30, 4, vt1));
        employees.add(new Tester("Cindy",1974, 20,  6, vt2));
        employees.add(new Tester("Paul",  1993,  3, 75, vt3));
        employees.add(new Tester("Pierre", 1987, 124, 50, vt4));
        employees.add(new Tester("Matt", 1981, 5, 110, vt4));
        employees.add(new Tester("Sarah", 1986, 3,30, vt3));
        for( Employee item : employees ){
            System.out.println("-------------------------");
            System.out.println(item);
            System.out.println("-------------------------");
        }
    }
}
