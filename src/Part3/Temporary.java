package Part3;

interface TemporaryInterface {
    int hourlySalary = 0;
    int accumulatedHours = 0;
    double accumulatedSalary();
}
public class Temporary implements TemporaryInterface {
    private int hourlySalary = 0;
    private int accumulatedHours = 0;

    @Override
    public double accumulatedSalary() {
        return 0;
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
}
