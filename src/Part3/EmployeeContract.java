package Part3;

public interface EmployeeContract {
    public default double accumulatedSalary() {
        return 0.0;
    }

}
