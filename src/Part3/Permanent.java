package Part3;

public class Permanent implements EmployeeContract {
    @Override
    public double accumulatedSalary() {
        return EmployeeContract.super.accumulatedSalary();
    }
}
