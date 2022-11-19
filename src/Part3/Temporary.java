package Part3;

public class Temporary implements EmployeeContract  {
    private int hourlySalary = 0;
    private int accumulatedHours = 0;

    @Override
    public String contractInfo() {
        return super.toString() + " he is a temporary employee with " + hourlySalary + " hourly salary and he has worked for " + accumulatedHours +" hours";
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
        return "he is a temporary employee with " + hourlySalary +
                " hourly salary and he has worked for " + accumulatedHours +
                " hours";
    }
}
