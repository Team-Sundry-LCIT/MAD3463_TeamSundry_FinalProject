package Part3;

public class Temporary implements EmployeeContract {
    @Override
    public double accumulatedSalary() {
        return EmployeeContract.super.accumulatedSalary();
    }
}
