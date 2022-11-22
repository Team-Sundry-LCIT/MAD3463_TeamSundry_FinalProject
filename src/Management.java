import Part1.Employee;
import Part1.Manager;
import Part1.Programmer;
import Part1.Tester;
import Part2.Car;
import Part2.Motorcycle;
import Part3.Permanent;
import Part3.Temporary;

import java.util.ArrayList;

public class Management {

    public Management(){

    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static Motorcycle m1 = new Motorcycle("Kawasaki","Custom Plate", "Yellow",  "Race Motorcycle", false);
    static Motorcycle m2 = new Motorcycle("Honda","Custom Plate", "Black", "Not for Race", true);
    static Car vt1 = new Car("Lamborghini", "Custom Plate", "White","Family", "Manual","Sport");
    static Car vt2 = new Car("BMW",  "Custom Plate", "Black", "Family","Automatic","Sedan");
    static Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
    static Car vt4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic","SUV");

    public void hire_test1() {

//        employees.add(new Manager("Serge", 1985,  30, 4));
//        employees.add(new Manager("Cindy", 1974,  20,  6));
//        employees.add(new Programmer("Paul",  1993, 3,  75));
        employees.add(new Tester("Pierre", 1987, 124,50));
//        employees.add(new Programmer("Matt",  1981,  5,  110));
//        employees.add(new Programmer("Sarah", 1986,  3,50));

    }

    public void hire_test2() {
        employees = new ArrayList<>();
//        employees.add(new Manager("Serge", 1985, 30, 4, vt1));
//        employees.add(new Manager("Cindy",1974, 20,  6, vt2));
//        employees.add(new Programmer("Paul",  1993,  3, 75, vt3));
        employees.add(new Tester("Pierre", 1987, 124, 50, m2));
//        employees.add(new Programmer("Matt", 1981, 5, 110, vt4));
//        employees.add(new Programmer("Sarah", 1986, 3,30, vt3));

        for( Employee item : employees ){
            System.out.println("-------------------------");
            System.out.println(item);
            System.out.println("-------------------------");
        }
    }

    public void hire_test3(){
        employees = new ArrayList<>();

//        Manager Serge = new Manager("Serge",1985,30,4,vt1);
//        Manager Cindy = new Manager("Cindy",1974,20,6,80,vt2);
//        Programmer Paul = new Programmer("Paul",1983,3,75,m1);
        Tester Pierre = new Tester("Pierre", 1987, 124, 50, m2);
//        Programmer Matt = new Programmer("Matt",1981,5,110,vt4);
//        Programmer Sarah = new Programmer("Sarah",1986,3,vt3);

//        Permanent p1 = new Permanent(2,true,6000,200,17);
//        Permanent p2 = new Permanent(3,false,5000,150,19);
        Temporary t1 = new Temporary(60,30);
        Temporary t2 = new Temporary(50,60);
//        Permanent p3 = new Permanent(1,true,4000,100,20);
//        Permanent p4 = new Permanent(4,true,4500,100,19);

//        Serge.signContract(p1);
//        Cindy.signContract(p2);
//        Paul.signContract(t1);
//        Matt.signContract( t2);
//        Pierre.signContract(p3);
//        Sarah.signContract( p4);
        Pierre.signContract(t1);

//        employees.add(Serge);
//        employees.add(Cindy);
//        employees.add(Paul);
        employees.add(Pierre);
//        employees.add(Matt);
//        employees.add(Sarah);

        for( Employee item : employees ){
            System.out.println("-------------------------");
            System.out.println(item);
            System.out.println("-------------------------");
        }

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");

        for(Employee item : employees) {
            if ( item.getContract() != null) {
                System.out.print(item.contractInfo());
                System.out.println(item.getContract());
            }
        }
        System.out.println("-------------------------");
    }
}
