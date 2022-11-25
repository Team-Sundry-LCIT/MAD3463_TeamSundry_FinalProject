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

    public Programmer(String name, int birthYear, int projects, Vehicle vehicle) {
        super(name, birthYear,vehicle);
        this.projects = projects;
        printData();
    }

    /**
     * Calculate the manager annual income
     * @return Annual income in double
     */
    @Override
    public double getAnnualIncome() {
        double baseYearlyIncome = (getMonthlyIncome() * NO_OF_MONTHS) * getRate()/TO_PERCENTAGE;
        double bonus = gainFactorProjects * getProjects();
        return baseYearlyIncome + bonus;
    }
    /**
     * Print programmer related data
     * @return Programmer data in String format
     */
    @Override
    public String toString() {
        return super.toString() +
                " has completed " + getProjects() + " projects." +
                "\nHis/Her estimated annual income is " + getAnnualIncome();
    }
}
