package Part1;

import Part2.Vehicle;

public class Manager extends Employee {
    private int travelDays;
    private int clients;
    private final int gainFactorClient = 500;
    private final int gainFactorTravel = 100;

    public int getTravelDays() {
        return travelDays;
    }

    public void setTravelDays(int travelDays) {
        this.travelDays = travelDays;
    }

    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    public Manager(String name, int birthYear, int travelDays, int clients, int rate) {
        super(name, birthYear, rate);
        this.travelDays = travelDays;
        this.clients = clients;
    }

    public Manager(String name, int birthYear, int travelDays, int clients, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.travelDays = travelDays;
        this.clients = clients;
    }

    @Override
    public double getAnnualIncome() {
        double baseYearlyIncome = (getMonthlyIncome() * 12) * getRate()/100.0;
        double clientBonus = gainFactorClient * getClients();
        double expenditure = gainFactorTravel * getTravelDays();
        return baseYearlyIncome + clientBonus + expenditure;
    }

    @Override
    public String toString() {
        return super.toString() +
                " and has brought " + getClients() + " news clients." +
                "\nHis/Her estimated annual income is " + getAnnualIncome();
    }
}
