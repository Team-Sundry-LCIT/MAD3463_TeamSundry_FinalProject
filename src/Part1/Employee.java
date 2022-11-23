package Part1;
import Part2.Vehicle;
import Part3.EmployeeContract;

import java.util.Calendar;

public abstract class Employee implements EmployeeContract {
    private String name;
    private int birthYear;
    private int age;
    private double monthlyIncome;
    private int rate;

    private Vehicle vehicle;
    private EmployeeContract contract;

    public EmployeeContract getContract() {
        return contract;
    }

    public void setContract(EmployeeContract contract) {
        this.contract = contract;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract double getAnnualIncome();

    public Employee(String name, int birthYear,int rate){
        this.name = name;
        this.birthYear = birthYear;
        if(rate < 10){
            this.rate = 10;
        }
        /*
            for else -> set rate as min value between 100 and passed argument. since rate shouldn't be more than 100.
         */
        else this.rate = (Math.min(rate, 100));
    }
    public Employee(String name, int birthYear,int rate,Vehicle vehicle){
        this.name = name;
        this.birthYear = birthYear;
        if(rate < 10){
            this.rate = 10;
        }
        /*
            for else -> set rate as min value between 100 and passed argument. since rate shouldn't be more than 100.
         */
        else this.rate = (Math.min(rate, 100));
        this.vehicle = vehicle;
    }

    public void printData(){
        System.out.println("We have a new employee: " + getName() + ", a " + getClass().getSimpleName().toLowerCase() + "." );
    }

    public int calculateAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
//        int currentYear = Year.now().getValue();
        return currentYear - getBirthYear();
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", a " + getClass().getSimpleName() +
                "\nAge: "+ calculateAge() +
                "\n"+ getVehicle() +
                "\n" + getName() + " has an Occupation rate: " + getRate() + "%"
                ;
    }

    public void signContract(EmployeeContract contract) {
        this.setMonthlyIncome(this.accumulatedSalary());
        this.setContract(contract);
    }

    public String contractInfo() {
        return getName() + " is a " + getClass().getSimpleName() +". ";
    }

}