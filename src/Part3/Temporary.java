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
}
