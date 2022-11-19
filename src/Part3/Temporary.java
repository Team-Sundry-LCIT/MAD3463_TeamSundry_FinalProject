package Part3;

public class Temporary implements EmployeeContract  {
    private int hourlySalary = 0;
    private int accumulatedHours = 0;

    public Temporary(int hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public double accumulatedSalary() {
        return hourlySalary * accumulatedHours;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getAccumulatedHours() {
        return accumulatedHours;
    }

    public void setAccumulatedHours(int accumulatedHours) {
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public String toString() {
        return super.toString() + "he is a temporary employee with " + hourlySalary +
                " hourly salary and he has worked for " + accumulatedHours +
                " hours";
    }
}
