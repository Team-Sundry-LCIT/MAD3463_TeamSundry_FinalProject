package Part1;
import Part2.Vehicle;

public class Programmer extends Employee{
    private int projects;
    private final int gainFactorProjects = 200;

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public Programmer(String name, int birthYear, int projects, int rate) {
        super(name, birthYear, rate);
        this.projects = projects;
        printData();
    }

    public Programmer(String name, int birthYear, int projects, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.projects = projects;
        printData();
    }

    @Override
    public double getAnnualIncome() {
        double baseYearlyIncome = (getMonthlyIncome() * 12) * getRate()/100.0;
        double bonus = gainFactorProjects * getProjects();
        return baseYearlyIncome + bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                " has completed  " + getProjects() + " projects." +
                "\nHis/Her estimated annual income is " + getAnnualIncome();
    }
}
