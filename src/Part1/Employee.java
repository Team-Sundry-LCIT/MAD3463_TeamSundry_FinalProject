package Part1;

import Part2.Vehicle;

import java.util.Calendar;

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

    public Employee(String name, int birthYear,int rate){
        this.setName(name);
        this.setBirthYear(birthYear);
        if(rate < 10){
            setRate(10);
        }
        /*
            for else -> set rate as min value between 100 and passed argument. since rate shouldn't be more than 100.
         */
        else setRate(Math.min(rate, 100));
    }
    public Employee(String name, int birthYear,int rate,Vehicle vehicle){
        this.setName(name);
        this.setBirthYear(birthYear);
        if(rate < 10){
            setRate(10);
        }
        /*
            for else -> set rate as min value between 100 and passed argument. since rate shouldn't be more than 100.
         */
        else setRate(Math.min(rate, 100));
        this.setVehicle(vehicle);
    }

    public void printData(){
        System.out.println("We have a new employee: " + getName() + " a " + getClass().getSimpleName() );
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
                "\n"+ vehicle +
                "\n" + name + " has an Occupation rate: " + rate + "%"
                ;
    }

}