package Part1;

import Part2.Vehicle;

public class Tester extends Employee{

    private int bugs;
    private final int gainFactorError = 10;

    public int getBugs() {
        return bugs;
    }

    public void setBugs(int bugs) {
        this.bugs = bugs;
    }

    public Tester(String name, int birthYear, int bugs, int rate){
        super(name,birthYear,rate);
        this.bugs = bugs;
        printData();
    }
    public Tester(String name, int birthYear, int bugs, int rate, Vehicle vehicle){
        super(name,birthYear,rate,vehicle);
        this.bugs = bugs;
        printData();
    }

    @Override
    public double getAnnualIncome() {
        double baseYearlyIncome = (getMonthlyIncome() * 12) * getRate()/100.0;
        double bonus = gainFactorError * getBugs();
        return baseYearlyIncome + bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                " and corrected " + getBugs() + " bugs." +
                "\nHis/Her estimated annual income is " + getAnnualIncome();
    }
}
