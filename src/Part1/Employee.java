package Part1;
import Part2.Vehicle;
import Part3.EmployeeContract;

import java.util.Calendar;

public abstract class Employee {
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
        for else -> set rate as min value between 100 and passed argument.
        since rate shouldn't be more than 100.
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
        for else -> set rate as min value between 100 and passed argument.
        since rate shouldn't be more than 100.
         */
        else this.rate = (Math.min(rate, 100));
        this.vehicle = vehicle;
    }

    public Employee(String name, int birthYear,Vehicle vehicle){
        this.name = name;
        this.birthYear = birthYear;
        this.vehicle = vehicle;
        this.rate = 100;
    }

    /**
     * Print employee name and type
     */
    public void printData(){
        System.out.println("We have a new employee: " + getName() + ", a " + getClass().getSimpleName().toLowerCase() + "." );
    }

    /**
     * Calculate the current age
     * @return Age of the employee
     */
    public int calculateAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - getBirthYear();
    }

    /**
     * Print employee related details
     * @return All employee data
     */

    @Override
    public String toString() {
        return "Name: " + getName() + ", a " + getClass().getSimpleName() +
                "\nAge: "+ calculateAge() +
                "\n"+ getVehicle() +
                "\n" + getName() + " has an Occupation rate: " + getRate() + "%"
                ;
    }

    /**
     * Employee can be a permanent or temporary employee. He need to sign a contract. Base on the contract his salary calculated
     * and set the monthly income.
     * Print the contract detail we need a Contract object therefore we set contract object.
     * @param contract details related to the employee
     */

    public void signContract(EmployeeContract contract) {
        this.setMonthlyIncome(contract.accumulatedSalary());
        this.setContract(contract);
    }

    /**
     * This print employee contract details
     * @return Contract details of the employee
     */
    public String contractInfo() {
        return getName() + " is a " + getClass().getSimpleName().toLowerCase() +". ";
    }

}