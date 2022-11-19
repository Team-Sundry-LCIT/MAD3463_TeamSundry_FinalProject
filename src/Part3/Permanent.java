package Part3;

public class Permanent implements EmployeeContract {
    @Override
    public String contractInfo() {
        return null;
    }

    @Override
    public double accumulatedSalary() {
        return EmployeeContract.super.accumulatedSalary();
    }
}
