package Part1;

import Part2.Vehicle;

public abstract class Employee {
    private String name;
    private int birthYear;
    private int age;
    private int monthlyIncome;
    private int rate;

    private Vehicle vehicle;

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

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
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

    public Employee(String name, int birthYear,int rate,Vehicle vehicle){
        this.setName(name);
        this.setBirthYear(birthYear);
        this.setRate(rate);
        this.setVehicle(vehicle);
    }

    public void printData(){
        System.out.println("We have a new employee: " + getName() + " a " + getClass().getSimpleName() );
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", a " + getClass().getSimpleName() +
                "\nAge: "+ age +
                "\n"+ vehicle +
                "\n" + name + " has Occupation rate: " + rate
                ;
    }

}