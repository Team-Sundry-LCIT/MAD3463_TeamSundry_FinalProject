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
        this.setBugs(bugs);
        printData();
    }
    public Tester(String name, int birthYear, int bugs, int rate, Vehicle vehicle){
        super(name,birthYear,rate,vehicle);
        this.setBugs(bugs);
        printData();
    }

    @Override
    public double getAnnualIncome() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                " and corrected " + bugs + " bugs." +
                "\nHis/Her estimated annual income is " + getAnnualIncome();
    }
}
